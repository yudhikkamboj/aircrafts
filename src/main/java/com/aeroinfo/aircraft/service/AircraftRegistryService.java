package com.aeroinfo.aircraft.service;

import com.aeroinfo.aircraft.entity.AircraftRegistryEntity;
import com.aeroinfo.aircraft.mapper.AircraftMapper;
import com.aeroinfo.aircraft.model.BasicInfo;
import com.aeroinfo.aircraft.repository.AircraftRegistryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@AllArgsConstructor
public class AircraftRegistryService {

    private final AircraftRegistryRepository aircraftRegistryRepository;
    private final AircraftMapper aircraftMapper;

    public void saveAircraft(BasicInfo aircraftInfo){
        log.info("aircraftInfo: {}", aircraftInfo);
        AircraftRegistryEntity aircraftRegistry = aircraftMapper.basicInfoToAircraftEntityMapper(aircraftInfo);
        aircraftRegistryRepository.save(aircraftRegistry);
        log.info("Aircraft saved!!!");
    }

    public List<AircraftRegistryEntity> getAllAircrafts(){
        Iterable<AircraftRegistryEntity> aircraftRegistryEntityIterable = aircraftRegistryRepository.findAll();
        log.info("Aircrafts found!!!");
        return StreamSupport.stream(aircraftRegistryEntityIterable.spliterator(), false).toList();
    }

    public List<AircraftRegistryEntity> getAircraftsByName(String name){
        List<AircraftRegistryEntity> aircrafts = aircraftRegistryRepository.findByName(name);
        log.info("Aircraft {} found!!!", name);
        return aircrafts;
    }

    public void updateAircraft(BasicInfo aircraftInfo){
        log.info("aircraftInfo: {}", aircraftInfo);
        AircraftRegistryEntity aircraftRegistry = aircraftMapper.basicInfoToAircraftEntityMapper(aircraftInfo);
//        aircraftRegistryRepository.update(aircraftRegistry);
        log.info("It is not operational yet!!");
        log.info("Aircraft Updated!!!");
    }
}
