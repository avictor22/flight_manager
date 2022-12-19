package edu.epitech.flight.services;

import edu.epitech.flight.models.Flight;
import edu.epitech.flight.models.FlightCriteria;
import edu.epitech.flight.models.SynthesisCriteria;
import edu.epitech.flight.dto.SynthesesCompanyDto;

import java.util.List;

public interface FlightService {

    Flight addFlight(Flight flight);
    List<Flight> getAllFlights();
    List <Flight> searchFlight(FlightCriteria flightCriteria);

    Flight getFlight(Long idFlight);

    Long getNumberFlights(SynthesisCriteria synthesisCriteria);

    List<SynthesesCompanyDto> getNbsFlightsByCompany(SynthesisCriteria synthesisCriteria);
}
