package edu.epitech.flight.models;

import edu.epitech.flight.enums.CompanyName;
import edu.epitech.flight.enums.FlightType;
import edu.epitech.flight.enums.TravelType;

import javax.persistence.Embeddable;
import java.time.LocalDate;
import java.time.LocalTime;

@Embeddable
public class FlightCriteria {

    private CompanyName company;
    private FlightType flightType;
    private TravelType travelType;
    private String departureLocation;
    private String arrivalLocation;
    private Double fareMin;
    private Double fareMax;
    private LocalTime flightDurationMin;
    private LocalTime flightDurationMax;
    private String aircraftType;
    private LocalDate departureDateMin;
    private LocalDate arrivalDateMin;
    private LocalDate backDateMin;
    private LocalTime departureTimeMin;
    private LocalTime arrivalTimeMin;
    private LocalTime backTimeMin;
    private LocalDate departureDateMax;
    private LocalDate arrivalDateMax;
    private LocalDate backDateMax;
    private LocalTime departureTimeMax;
    private LocalTime arrivalTimeMax;
    private LocalTime backTimeMax;
    private LocalTime connectionDurationMin;
    private LocalTime connectionDurationMax;

    public FlightCriteria() {
    }

    public FlightCriteria(CompanyName company, FlightType flightType, TravelType travelType, String departureLocation, String arrivalLocation, Double fareMin, Double fareMax, LocalTime flightDurationMin, LocalTime flightDurationMax, String aircraftType, LocalDate departureDateMin, LocalDate arrivalDateMin, LocalDate backDateMin, LocalTime departureTimeMin, LocalTime arrivalTimeMin, LocalTime backTimeMin, LocalDate departureDateMax, LocalDate arrivalDateMax, LocalDate backDateMax, LocalTime departureTimeMax, LocalTime arrivalTimeMax, LocalTime backTimeMax, LocalTime connectionDurationMin, LocalTime connectionDurationMax) {
        this.company = company;
        this.flightType = flightType;
        this.travelType = travelType;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.fareMin = fareMin;
        this.fareMax = fareMax;
        this.flightDurationMin = flightDurationMin;
        this.flightDurationMax = flightDurationMax;
        this.aircraftType = aircraftType;
        this.departureDateMin = departureDateMin;
        this.arrivalDateMin = arrivalDateMin;
        this.backDateMin = backDateMin;
        this.departureTimeMin = departureTimeMin;
        this.arrivalTimeMin = arrivalTimeMin;
        this.backTimeMin = backTimeMin;
        this.departureDateMax = departureDateMax;
        this.arrivalDateMax = arrivalDateMax;
        this.backDateMax = backDateMax;
        this.departureTimeMax = departureTimeMax;
        this.arrivalTimeMax = arrivalTimeMax;
        this.backTimeMax = backTimeMax;
        this.connectionDurationMin = connectionDurationMin;
        this.connectionDurationMax = connectionDurationMax;
    }

    public CompanyName getCompany() {
        return company;
    }

    public void setCompany(CompanyName company) {
        this.company = company;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public TravelType getTravelType() {
        return travelType;
    }

    public void setTravelType(TravelType travelType) {
        this.travelType = travelType;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Double getFareMin() {
        return fareMin;
    }

    public void setFareMin(Double fareMin) {
        this.fareMin = fareMin;
    }

    public Double getFareMax() {
        return fareMax;
    }

    public void setFareMax(Double fareMax) {
        this.fareMax = fareMax;
    }

    public LocalTime getFlightDurationMin() {
        return flightDurationMin;
    }

    public void setFlightDurationMin(LocalTime flightDurationMin) {
        this.flightDurationMin = flightDurationMin;
    }

    public LocalTime getFlightDurationMax() {
        return flightDurationMax;
    }

    public void setFlightDurationMax(LocalTime flightDurationMax) {
        this.flightDurationMax = flightDurationMax;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalDate getDepartureDateMin() {
        return departureDateMin;
    }

    public void setDepartureDateMin(LocalDate departureDateMin) {
        this.departureDateMin = departureDateMin;
    }

    public LocalDate getArrivalDateMin() {
        return arrivalDateMin;
    }

    public void setArrivalDateMin(LocalDate arrivalDateMin) {
        this.arrivalDateMin = arrivalDateMin;
    }

    public LocalDate getBackDateMin() {
        return backDateMin;
    }

    public void setBackDateMin(LocalDate backDateMin) {
        this.backDateMin = backDateMin;
    }

    public LocalTime getDepartureTimeMin() {
        return departureTimeMin;
    }

    public void setDepartureTimeMin(LocalTime departureTimeMin) {
        this.departureTimeMin = departureTimeMin;
    }

    public LocalTime getArrivalTimeMin() {
        return arrivalTimeMin;
    }

    public void setArrivalTimeMin(LocalTime arrivalTimeMin) {
        this.arrivalTimeMin = arrivalTimeMin;
    }

    public LocalTime getBackTimeMin() {
        return backTimeMin;
    }

    public void setBackTimeMin(LocalTime backTimeMin) {
        this.backTimeMin = backTimeMin;
    }

    public LocalDate getDepartureDateMax() {
        return departureDateMax;
    }

    public void setDepartureDateMax(LocalDate departureDateMax) {
        this.departureDateMax = departureDateMax;
    }

    public LocalDate getArrivalDateMax() {
        return arrivalDateMax;
    }

    public void setArrivalDateMax(LocalDate arrivalDateMax) {
        this.arrivalDateMax = arrivalDateMax;
    }

    public LocalDate getBackDateMax() {
        return backDateMax;
    }

    public void setBackDateMax(LocalDate backDateMax) {
        this.backDateMax = backDateMax;
    }

    public LocalTime getDepartureTimeMax() {
        return departureTimeMax;
    }

    public void setDepartureTimeMax(LocalTime departureTimeMax) {
        this.departureTimeMax = departureTimeMax;
    }

    public LocalTime getArrivalTimeMax() {
        return arrivalTimeMax;
    }

    public void setArrivalTimeMax(LocalTime arrivalTimeMax) {
        this.arrivalTimeMax = arrivalTimeMax;
    }

    public LocalTime getBackTimeMax() {
        return backTimeMax;
    }

    public void setBackTimeMax(LocalTime backTimeMax) {
        this.backTimeMax = backTimeMax;
    }

    public LocalTime getConnectionDurationMin() {
        return connectionDurationMin;
    }

    public void setConnectionDurationMin(LocalTime connectionDurationMin) {
        this.connectionDurationMin = connectionDurationMin;
    }

    public LocalTime getConnectionDurationMax() {
        return connectionDurationMax;
    }

    public void setConnectionDurationMax(LocalTime connectionDurationMax) {
        this.connectionDurationMax = connectionDurationMax;
    }
}
