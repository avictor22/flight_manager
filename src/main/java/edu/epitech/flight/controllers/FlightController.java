package edu.epitech.flight.controllers;

import edu.epitech.flight.dto.AccountDto;
import edu.epitech.flight.dto.FlightDto;
import edu.epitech.flight.dto.SynthesesCompanyDto;
import edu.epitech.flight.models.Account;
import edu.epitech.flight.models.Flight;
import edu.epitech.flight.models.FlightCriteria;
import edu.epitech.flight.models.SynthesisCriteria;
import edu.epitech.flight.services.AccountService;
import edu.epitech.flight.services.FlightService;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController // HTTP METHOD
@RequestMapping("flight-webServices/api/v1.0/flights") // Base URI
public class FlightController {

    @Autowired
    FlightService flightService;
    @Autowired
    AccountService accountService;
    private ModelMapper modelMapper; // DTO model mapper

    PropertyMap<Flight, FlightDto> companyFieldMapping = new PropertyMap<Flight, FlightDto>() {

        @Override
        protected void configure() {
            map().setCompanyName(source.getCompany().getCompanyName());
            map().setCabinDetails(source.getCompany().getCabinDetails());
            map().setInflightInfos(source.getCompany().getInflightInfos());
        }
    };

    @Autowired
    public FlightController(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.modelMapper.addMappings(companyFieldMapping);
    }

    @PostMapping("/add")
    public ResponseEntity<Flight> addFlight(@RequestBody Flight flight) {

        Flight addFlight = flightService.addFlight(flight);
        return new ResponseEntity<Flight>(addFlight, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/allFlights")
    public ResponseEntity<List<FlightDto>> getAllFlights() {
        List<FlightDto> flights = flightService.getAllFlights().stream().map(flight -> modelMapper.map(flight, FlightDto.class)).collect(Collectors.toList());
        return new ResponseEntity<List<FlightDto>>(flights,new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/search")
    public ResponseEntity<List<FlightDto>> searchFlight(@RequestBody FlightCriteria flightCriteria) {
        List<FlightDto> flights = flightService.searchFlight(flightCriteria).stream().map(flight -> modelMapper.map(flight, FlightDto.class)).collect(Collectors.toList());
        return new ResponseEntity<List<FlightDto>>(flights,new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping("/getFlight/{id}")
    public ResponseEntity<FlightDto> getFlight(@PathVariable("id") Long idFlight ) {
        Flight flight =  flightService.getFlight(idFlight);
        FlightDto flightDto = modelMapper.map(flight,FlightDto.class);
        return new ResponseEntity<FlightDto>(flightDto, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/numberFlights")
    public ResponseEntity<Long> getNumberFlights(@RequestBody SynthesisCriteria synthesisCriteria) {
        Long numberFlights = flightService.getNumberFlights(synthesisCriteria);
        return new ResponseEntity<Long>(numberFlights, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/syntheseCompany")
    public ResponseEntity<List<SynthesesCompanyDto>> getNbsFlightsByCompany(@RequestBody SynthesisCriteria synthesisCriteria) {
        List<SynthesesCompanyDto> synthesesCompanyDtos = flightService.getNbsFlightsByCompany(synthesisCriteria);
        return new ResponseEntity<List<SynthesesCompanyDto>>(synthesesCompanyDtos,new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/register")
    public ResponseEntity<Account> addAccount(@RequestBody AccountDto accountDto) {
        Account account = accountService.addAccount(accountDto);
        return new ResponseEntity<Account>(account, new HttpHeaders(), HttpStatus.OK);
    }
}
