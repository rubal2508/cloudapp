package org.amangarg.cloudapp.controller;

import org.amangarg.cloudapp.model.Citizen;
import org.amangarg.cloudapp.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @PostMapping("/citizens")
    public List<Citizen> addCitizens(@RequestBody List<Citizen> citizens){
        return citizenService.addCitizens(citizens);
    }

    @GetMapping("/citizens/{id}")
    public Citizen findCitizenById(@PathVariable int id){
        return citizenService.findCitizenById(id);
    }

    @GetMapping("/citizens")
    public List<Citizen> findByBirthPlace(@RequestParam String birthPlace){
        return citizenService.findByBirthPlace(birthPlace);
    }

    @GetMapping("/citizens/all")
    public List<Citizen> findAllCitizens(){
        return citizenService.findAllCitizens();
    }
}
