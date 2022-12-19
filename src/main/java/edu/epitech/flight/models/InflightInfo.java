package edu.epitech.flight.models;

import javax.persistence.Embeddable;

@Embeddable
public class InflightInfo {
    private String title;
    private String description;

    public InflightInfo() {
    }

    public InflightInfo(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
