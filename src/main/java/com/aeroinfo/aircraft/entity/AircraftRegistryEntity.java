package com.aeroinfo.aircraft.entity;

import jakarta.persistence.*;
import lombok.Builder;

@Entity
@Table(name = "aircraft_registry")
@Builder
public class AircraftRegistryEntity {

    @Id
    @Column(name = "icao_code", length = 10)
    private String icaoCode;

    @Column(name = "registration", nullable = false, length = 20)
    private String registration;

    @Column(name = "operator", nullable = false, length = 100)
    private String operator;

    @Column(name = "aircraft_type", nullable = false, length = 100)
    private String aircraftType;

    @Column(name = "icao_type", nullable = false, length = 10)
    private String icaoType;

    @Column(name = "category_code", nullable = false, length = 10)
    private String categoryCode;

    @Column(name = "tag1", length = 100)
    private String tag1;

    @Column(name = "tag2", length = 100)
    private String tag2;

    @Column(name = "tag3", length = 100)
    private String tag3;

    @Column(name = "category_label", length = 100)
    private String categoryLabel;

    @Column(name = "reference_link", columnDefinition = "TEXT")
    private String referenceLink;

    // Getters and Setters

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getIcaoType() {
        return icaoType;
    }

    public void setIcaoType(String icaoType) {
        this.icaoType = icaoType;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    public String getTag2() {
        return tag2;
    }

    public void setTag2(String tag2) {
        this.tag2 = tag2;
    }

    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    public String getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    public String getReferenceLink() {
        return referenceLink;
    }

    public void setReferenceLink(String referenceLink) {
        this.referenceLink = referenceLink;
    }
}