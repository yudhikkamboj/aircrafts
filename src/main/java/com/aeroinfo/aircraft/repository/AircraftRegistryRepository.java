package com.aeroinfo.aircraft.repository;

import com.aeroinfo.aircraft.entity.AircraftRegistryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AircraftRegistryRepository extends CrudRepository<AircraftRegistryEntity, String> {

    List<AircraftRegistryEntity> findByName(String name);
}
