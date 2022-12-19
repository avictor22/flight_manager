package edu.epitech.flight.repositories;

import edu.epitech.flight.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>, FlightRepositoryCustom {
}
