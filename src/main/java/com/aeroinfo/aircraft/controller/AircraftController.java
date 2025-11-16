package com.aeroinfo.aircraft.controller;

import com.aeroinfo.aircraft.entity.AircraftRegistryEntity;
import com.aeroinfo.aircraft.model.BasicInfo;
import com.aeroinfo.aircraft.service.AircraftRegistryService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/aircraft")
@AllArgsConstructor
public class AircraftController {

    private final AircraftRegistryService aircraftService;

    @GetMapping("/get")
//    public ResponseEntity<List<AircraftRegistryEntity>> getAircraft(@RequestParam("name") String name){
    public ResponseEntity<List<AircraftRegistryEntity>> getAircraft(){
        List<AircraftRegistryEntity> aircraftDetails = aircraftService.getAllAircrafts();
        return new ResponseEntity<>(aircraftDetails, HttpStatus.OK);
    }

    @GetMapping("/getAircraft")
    public ResponseEntity<List<AircraftRegistryEntity>> getAircraft(@RequestParam("name") String name){
        List<AircraftRegistryEntity> aircraftDetails = aircraftService.getAircraftsByName(name);
        return new ResponseEntity<>(aircraftDetails, HttpStatus.OK);
    }


    @PostMapping("/saveNew")
    public ResponseEntity<String> saveAircraft(@RequestBody BasicInfo aircraftInfo){
        aircraftService.saveAircraft(aircraftInfo);
        return new ResponseEntity<>("saved", HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAircraft(@RequestBody BasicInfo aircraftInfo){
        aircraftService.updateAircraft(aircraftInfo);
        return new ResponseEntity<>("updated", HttpStatus.OK);
    }

}
