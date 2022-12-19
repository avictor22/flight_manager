package edu.epitech.flight.models;

import java.time.LocalDate;

public class SynthesisCriteria {
    private LocalDate departureDateMin;
    private LocalDate departureDateMax;

    public SynthesisCriteria() {
    }

    public SynthesisCriteria(LocalDate departureDateMin, LocalDate departureDateMax) {
        this.departureDateMin = departureDateMin;
        this.departureDateMax = departureDateMax;
    }

    public LocalDate getDepartureDateMin() {
        return departureDateMin;
    }

    public void setDepartureDateMin(LocalDate departureDateMin) {
        this.departureDateMin = departureDateMin;
    }

    public LocalDate getDepartureDateMax() {
        return departureDateMax;
    }

    public void setDepartureDateMax(LocalDate departureDateMax) {
        this.departureDateMax = departureDateMax;
    }
}
