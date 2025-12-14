package com.aeroinfo.aircraft.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "aircraft_registry")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}