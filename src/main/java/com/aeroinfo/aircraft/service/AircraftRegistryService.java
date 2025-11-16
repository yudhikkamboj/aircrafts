package com.aeroinfo.aircraft.service;

import com.aeroinfo.aircraft.model.BasicInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AircraftService {

    public void saveAircraft(BasicInfo aircraftInfo){
        log.info("aircraftInfo: {}", aircraftInfo);
    }

    public BasicInfo getAircraft(String name){
        BasicInfo basicInfo = BasicInfo.builder()
                .icao(123456)
                .registration("reg")
                .operator("Indian Air Force")
                .type("Fighter")
                .icaoType("icaoType")
                .cmpg("cmpg")
                .tag1(name)
                .tag2("tag2")
                .tag3("tag3")
                .category("category")
                .link("link")
                .build();
        return basicInfo;
    }

    public void updateAircraft(BasicInfo aircraftInfo){
        log.info("aircraftInfo: {}", aircraftInfo);
    }
}
