package edu.epitech.flight.repositories;

import edu.epitech.flight.dto.SynthesesCompanyDto;
import edu.epitech.flight.models.Flight;
import edu.epitech.flight.models.FlightCriteria;
import edu.epitech.flight.models.SynthesisCriteria;

import java.util.List;

public interface FlightRepositoryCustom {
    List<Flight> searchFlight(FlightCriteria flightCriteria);
    Long getNumberFlights(SynthesisCriteria synthesisCriteria);
    List<SynthesesCompanyDto> getNbsFlightsByCompany(SynthesisCriteria synthesisCriteria);
}
