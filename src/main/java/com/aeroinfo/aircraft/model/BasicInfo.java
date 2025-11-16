package com.aeroinfo.aircraft.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BasicInfo {

    private long icao;
    private String registration;
    private String operator;
    private String type;
    private String icaoType;
    private String cmpg;
    private String tag1;
    private String tag2;
    private String tag3;
    private String category;
    private String link;
}
