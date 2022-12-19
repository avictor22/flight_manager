package edu.epitech.flight.repositories.impl;

import edu.epitech.flight.dto.SynthesesCompanyDto;
import edu.epitech.flight.enums.CompanyName;
import edu.epitech.flight.models.Flight;
import edu.epitech.flight.models.FlightCriteria;
import edu.epitech.flight.models.SynthesisCriteria;
import edu.epitech.flight.repositories.FlightRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class FlightRepositoryImpl implements FlightRepositoryCustom {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Flight> searchFlight(FlightCriteria flightCriteria) {
        CriteriaBuilder cbuild = entityManager.getCriteriaBuilder();
        CriteriaQuery<Flight> cquery = cbuild.createQuery(Flight.class);
        Root<Flight> flight = cquery.from(Flight.class);
        List<Predicate> predicates = new ArrayList<>();

        if (flightCriteria.getFlightType() != null) {
            predicates.add(cbuild.equal(flight.get("flightType"), flightCriteria.getFlightType()));
        }

        if (flightCriteria.getTravelType() != null) {
            predicates.add(cbuild.equal(flight.get("travelType"), flightCriteria.getTravelType()));
        }
        if (flightCriteria.getCompany() != null) {
            predicates.add(cbuild.equal(flight.get("company").get("companyName"), flightCriteria.getCompany()));
        }
        if (flightCriteria.getAircraftType() != null) {
            predicates.add(cbuild.like(flight.get("aircraftType"), "%" + flightCriteria.getAircraftType() + "%"));
        }
        if (flightCriteria.getDepartureLocation() != null) {
            predicates.add(cbuild.like(flight.get("departureLocation"), "%" + flightCriteria.getDepartureLocation() + "%"));
        }
        if (flightCriteria.getArrivalLocation() != null) {
            predicates.add(cbuild.like(flight.get("arrivalLocation"), "%" + flightCriteria.getArrivalLocation() + "%"));
        }
        if (flightCriteria.getArrivalDateMin() != null) {
            predicates.add(cbuild.greaterThanOrEqualTo(flight.get("arrivalDate"), flightCriteria.getArrivalDateMin()));
        }
        if (flightCriteria.getArrivalDateMax() != null) {
            predicates.add(cbuild.lessThanOrEqualTo(flight.get("arrivalDate"), flightCriteria.getArrivalDateMax()));
        }
        if (flightCriteria.getArrivalTimeMin() != null) {
            predicates.add(cbuild.greaterThanOrEqualTo(flight.get("arrivalTime"), flightCriteria.getArrivalTimeMin()));
        }
        if (flightCriteria.getArrivalTimeMax() != null) {
            predicates.add(cbuild.lessThanOrEqualTo(flight.get("arrivalTime"), flightCriteria.getArrivalTimeMax()));
        }
        if (flightCriteria.getBackDateMin() != null) {
            predicates.add(cbuild.greaterThanOrEqualTo(flight.get("backDate"), flightCriteria.getBackDateMin()));
        }
        if (flightCriteria.getBackDateMax() != null) {
            predicates.add(cbuild.lessThanOrEqualTo(flight.get("backDate"), flightCriteria.getBackDateMax()));
        }
        if (flightCriteria.getBackTimeMin() != null) {
            predicates.add(cbuild.greaterThanOrEqualTo(flight.get("backTime"), flightCriteria.getBackTimeMin()));
        }
        if (flightCriteria.getBackTimeMax() != null) {
            predicates.add(cbuild.lessThanOrEqualTo(flight.get("backTime"), flightCriteria.getBackTimeMax()));
        }
        if (flightCriteria.getConnectionDurationMin() != null) {
            predicates.add(cbuild.greaterThanOrEqualTo(flight.get("connectionDuration"),
                    flightCriteria.getConnectionDurationMin()));
        }
        if (flightCriteria.getConnectionDurationMax() != null) {
            predicates.add(
                    cbuild.lessThanOrEqualTo(flight.get("connectionDuration"), flightCriteria.getConnectionDurationMax()));
        }
        if (flightCriteria.getDepartureDateMax() != null) {
            predicates.add(cbuild.lessThanOrEqualTo(flight.get("departureDate"), flightCriteria.getDepartureDateMax()));
        }
        if (flightCriteria.getDepartureDateMin() != null) {
            predicates.add(cbuild.greaterThanOrEqualTo(flight.get("departureDate"), flightCriteria.getDepartureDateMin()));
        }
        if (flightCriteria.getDepartureTimeMax() != null) {
            predicates.add(cbuild.lessThanOrEqualTo(flight.get("departureTime"), flightCriteria.getDepartureTimeMax()));
        }
        if (flightCriteria.getDepartureTimeMin() != null) {
            predicates.add(cbuild.greaterThanOrEqualTo(flight.get("departureTime"), flightCriteria.getDepartureTimeMin()));
        }
        if (flightCriteria.getFlightDurationMax() != null) {
            predicates.add(cbuild.lessThanOrEqualTo(flight.get("flightDuration"), flightCriteria.getFlightDurationMax()));
        }
        if (flightCriteria.getFlightDurationMin() != null) {
            predicates
                    .add(cbuild.greaterThanOrEqualTo(flight.get("flightDuration"), flightCriteria.getFlightDurationMin()));
        }
        cquery.where(predicates.toArray(new Predicate[0]));
        return entityManager.createQuery(cquery).getResultList();
    }

    @Override
    public Long getNumberFlights(SynthesisCriteria synthesisCriteria) {
        CriteriaBuilder cbuild = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> cquery = cbuild.createQuery(Long.class);
        Root<Flight> flight = cquery.from(Flight.class);
        cquery.select(cbuild.count(flight));
        List<Predicate> predicates = new ArrayList<>();
        if (synthesisCriteria.getDepartureDateMax() != null) {
            predicates.add(cbuild.lessThanOrEqualTo(flight.get("departureDate"), synthesisCriteria.getDepartureDateMax()));
        }

        if (synthesisCriteria.getDepartureDateMin() != null) {
            predicates.add(cbuild.equal(flight.get("departureDate"), synthesisCriteria.getDepartureDateMin()));
        }
        cquery.where(predicates.toArray(new Predicate[0]));
        return entityManager.createQuery(cquery).getSingleResult();
    }

    @Override
    public List<SynthesesCompanyDto> getNbsFlightsByCompany(SynthesisCriteria synthesisCriteria) {
        CriteriaBuilder cbuild = entityManager.getCriteriaBuilder();
        CriteriaQuery<SynthesesCompanyDto> cquery = cbuild.createQuery(SynthesesCompanyDto.class);
        Root<Flight> flight = cquery.from(Flight.class);
        Expression<CompanyName> groupByExp = flight.get("company").get("companyName").as(CompanyName.class);
        Expression<Long> countExp = cbuild.count(groupByExp);
        cquery.multiselect(groupByExp,countExp);
        cquery.groupBy(groupByExp);
        List<Predicate> predicates = new ArrayList<>();
        if (synthesisCriteria.getDepartureDateMax() != null) {
            predicates.add(cbuild.lessThanOrEqualTo(flight.get("departureDate"), synthesisCriteria.getDepartureDateMax()));
        }

        if (synthesisCriteria.getDepartureDateMin() != null) {
            predicates.add(cbuild.equal(flight.get("departureDate"), synthesisCriteria.getDepartureDateMin()));
        }
        cquery.where(predicates.toArray(new Predicate[0]));
        return entityManager.createQuery(cquery).getResultList();
    }

}
