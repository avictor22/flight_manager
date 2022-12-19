package edu.epitech.flight.services.impl;

import edu.epitech.flight.dto.SynthesesCompanyDto;
import edu.epitech.flight.models.Flight;
import edu.epitech.flight.models.FlightCriteria;
import edu.epitech.flight.models.SynthesisCriteria;
import edu.epitech.flight.repositories.FlightRepository;
import edu.epitech.flight.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired // implementation automatique de dependance
    private FlightRepository flightRepository;

    @Override
    public Flight addFlight(Flight flight) {
       return flightRepository.save(flight);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public List<Flight> searchFlight(FlightCriteria flightCriteria) {
        return flightRepository.searchFlight(flightCriteria);
    }

    @Override
    public Flight getFlight(Long idFlight) {
        return flightRepository.findById(idFlight).orElse(null);
    }

    @Override
    public Long getNumberFlights(SynthesisCriteria synthesisCriteria) {
        return flightRepository.getNumberFlights(synthesisCriteria);
    }

    @Override
    public List<SynthesesCompanyDto> getNbsFlightsByCompany(SynthesisCriteria synthesisCriteria) {
        return flightRepository.getNbsFlightsByCompany(synthesisCriteria);
    }
}
