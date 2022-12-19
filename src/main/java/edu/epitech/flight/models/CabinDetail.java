package edu.epitech.flight.models;

import edu.epitech.flight.enums.CabinClass;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
public class CabinDetail {
    @Enumerated(EnumType.STRING)
    private CabinClass cabinClass;
    private String bagage;
    private String cancellation;
    private String rebooking;
    private String refund;
    private Double fare;

    public CabinDetail() {
    }

    public CabinDetail(CabinClass cabinClass, String bagage, String cancellation, String rebooking, String refund, Double fare) {
        this.cabinClass = cabinClass;
        this.bagage = bagage;
        this.cancellation = cancellation;
        this.rebooking = rebooking;
        this.refund = refund;
        this.fare = fare;
    }

    public CabinClass getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(CabinClass cabinClass) {
        this.cabinClass = cabinClass;
    }

    public String getBagage() {
        return bagage;
    }

    public void setBagage(String bagage) {
        this.bagage = bagage;
    }

    public String getCancellation() {
        return cancellation;
    }

    public void setCancellation(String cancellation) {
        this.cancellation = cancellation;
    }

    public String getRebooking() {
        return rebooking;
    }

    public void setRebooking(String rebooking) {
        this.rebooking = rebooking;
    }

    public String getRefund() {
        return refund;
    }

    public void setRefund(String refund) {
        this.refund = refund;
    }

    public Double getFare() {
        return fare;
    }

    public void setFare(Double fare) {
        this.fare = fare;
    }
}
