package com.aeroinfo.aircraft.service;

import com.aeroinfo.aircraft.entity.AircraftRegistryEntity;
import com.aeroinfo.aircraft.mapper.AircraftMapper;
import com.aeroinfo.aircraft.model.BasicInfo;
import com.aeroinfo.aircraft.repository.AircraftRegistryRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@Slf4j
@AllArgsConstructor
public class AircraftRegistryService {

    private final AircraftRegistryRepository aircraftRegistryRepository;
    private final AircraftMapper aircraftMapper;
    private final RedisTemplate redisTemplate;

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
        if(redisTemplate.opsForValue().get(name) != null){
            log.info("Aircraft {} found in redis!!!", name);
            return (List<AircraftRegistryEntity>) redisTemplate.opsForValue().get(name);
        }

        List<AircraftRegistryEntity> aircrafts = aircraftRegistryRepository.findByAircraftType(name);
        log.info("Aircraft {} found!!!", name);
        redisTemplate.opsForValue().set(name, aircrafts);
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
