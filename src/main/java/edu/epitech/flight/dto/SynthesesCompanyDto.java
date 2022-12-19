package edu.epitech.flight.dto;

import edu.epitech.flight.enums.CompanyName;

public class SynthesesCompanyDto {
    private CompanyName companyName;
    private Long nbFlights;

    public SynthesesCompanyDto() {
    }

    public SynthesesCompanyDto(CompanyName companyName, Long nbFlights) {
        this.companyName = companyName;
        this.nbFlights = nbFlights;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    public Long getNbFlights() {
        return nbFlights;
    }

    public void setNbFlights(Long nbFlights) {
        this.nbFlights = nbFlights;
    }
}
