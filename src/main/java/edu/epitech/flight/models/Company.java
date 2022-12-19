package edu.epitech.flight.models;

import edu.epitech.flight.enums.CompanyName;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Company {

    @Id
    @GeneratedValue
    private int idCompany;

    @Column(name = "Company_name")
    @Enumerated(EnumType.STRING)
    private CompanyName companyName;

    @Column(name = "")
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
    private Set<Flight> flights;

    @ElementCollection
    @CollectionTable(name = "cabin_details", joinColumns = @JoinColumn(name = "company_id"))
    private Set<CabinDetail> cabinDetails;

    @ElementCollection
    @CollectionTable(name = "inflight_info", joinColumns = @JoinColumn(name = "company_id"))
    private Set<InflightInfo> inflightInfos;


    public Company() {
    }

    public Company(int idCompany, CompanyName companyName, Set<Flight> flights, Set<CabinDetail> cabinDetails, Set<InflightInfo> inflightInfos) {
        this.idCompany = idCompany;
        this.companyName = companyName;
        this.flights = flights;
        this.cabinDetails = cabinDetails;
        this.inflightInfos = inflightInfos;
    }

    public int getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(int idCompany) {
        this.idCompany = idCompany;
    }

    public CompanyName getCompanyName() {
        return companyName;
    }

    public void setCompanyName(CompanyName companyName) {
        this.companyName = companyName;
    }

    public Set<Flight> getFlights() {
        return flights;
    }

    public void setFlights(Set<Flight> flights) {
        this.flights = flights;
    }

    public Set<CabinDetail> getCabinDetails() {
        return cabinDetails;
    }

    public void setCabinDetails(Set<CabinDetail> cabinDetails) {
        this.cabinDetails = cabinDetails;
    }

    public Set<InflightInfo> getInflightInfos() {
        return inflightInfos;
    }

    public void setInflightInfos(Set<InflightInfo> inflightInfos) {
        this.inflightInfos = inflightInfos;
    }
}
