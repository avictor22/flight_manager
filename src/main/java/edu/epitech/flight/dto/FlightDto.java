package edu.epitech.flight.dto;

import edu.epitech.flight.enums.CompanyName;
import edu.epitech.flight.enums.FlightType;
import edu.epitech.flight.enums.TravelType;
import edu.epitech.flight.models.CabinDetail;
import edu.epitech.flight.models.InflightInfo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class FlightDto {
    private Long idFlight;
    private CompanyName companyName;
    private FlightType flightType;
    private TravelType travelType;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private LocalDate arrivalDate;
    private LocalTime arrivalTime;
    private LocalDate backDate;
    private LocalTime backTime;
    private String departureLocation;
    private String arrivalLocation;
    private LocalTime flightDuration;
    private LocalTime connectionDuration;
    private String aircraftType;
    private Set<CabinDetail> cabinDetails;
    private Set<String> comforts;
    private Set<InflightInfo> inflightInfos;

    public FlightDto() {
    }

    public FlightDto(Long idFlight, CompanyName companyName, FlightType flightType, TravelType travelType, LocalDate departureDate, LocalTime departureTime, LocalDate arrivalDate, LocalTime arrivalTime, LocalDate backDate, LocalTime backTime, String departureLocation, String arrivalLocation, LocalTime flightDuration, LocalTime connectionDuration, String aircraftType, Set<CabinDetail> cabinDetails, Set<String> comforts, Set<InflightInfo> inflightInfos) {
        this.idFlight = idFlight;
        this.companyName = companyName;
        this.flightType = flightType;
        this.travelType = travelType;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.backDate = backDate;
        this.backTime = backTime;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.flightDuration = flightDuration;
        this.connectionDuration = connectionDuration;
        this.aircraftType = aircraftType;
        this.cabinDetails = cabinDetails;
        this.comforts = comforts;
        this.inflightInfos = inflightInfos;
    }

    public Long getIdFlight() {
        return idFlight;
    }

    public void setIdFlight(Long idFlight) {
        this.idFlight = idFlight;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
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

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public LocalTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDate getBackDate() {
        return backDate;
    }

    public void setBackDate(LocalDate backDate) {
        this.backDate = backDate;
    }

    public LocalTime getBackTime() {
        return backTime;
    }

    public void setBackTime(LocalTime backTime) {
        this.backTime = backTime;
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

    public LocalTime getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(LocalTime flightDuration) {
        this.flightDuration = flightDuration;
    }

    public LocalTime getConnectionDuration() {
        return connectionDuration;
    }

    public void setConnectionDuration(LocalTime connectionDuration) {
        this.connectionDuration = connectionDuration;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public Set<CabinDetail> getCabinDetails() {
        return cabinDetails;
    }

    public void setCabinDetails(Set<CabinDetail> cabinDetails) {
        this.cabinDetails = cabinDetails;
    }

    public Set<String> getComforts() {
        return comforts;
    }

    public void setComforts(Set<String> comforts) {
        this.comforts = comforts;
    }

    public Set<InflightInfo> getInflightInfos() {
        return inflightInfos;
    }

    public void setInflightInfos(Set<InflightInfo> inflightInfos) {
        this.inflightInfos = inflightInfos;
    }
}
