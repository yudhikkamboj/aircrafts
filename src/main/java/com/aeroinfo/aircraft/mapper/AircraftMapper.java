package com.aeroinfo.aircraft.mapper;

import com.aeroinfo.aircraft.entity.AircraftRegistryEntity;
import com.aeroinfo.aircraft.model.BasicInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AircraftMapper {

    public AircraftRegistryEntity basicInfoToAircraftEntityMapper(BasicInfo basicInfo){

        AircraftRegistryEntity.AircraftRegistryEntityBuilder aircraft = AircraftRegistryEntity.builder();

        aircraft.aircraftType(basicInfo.getType());
        aircraft.categoryCode(basicInfo.getCategory());
        aircraft.operator(basicInfo.getOperator());
        aircraft.registration(basicInfo.getRegistration());

        return aircraft.build();
    }
}
