package org.amangarg.cloudapp.service;

import org.amangarg.cloudapp.model.Citizen;
import org.amangarg.cloudapp.repo.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService {

    @Autowired
    CitizenRepository repository;


    public List<Citizen> addCitizens(List<Citizen> citizens){
        return repository.saveAll(citizens);
    }

    public Citizen findCitizenById(int id){
        return repository.findById(id).orElse(null);
    }

    public List<Citizen> findByBirthPlace(String birthPlace){
        return repository.getCitizensByBirthPlace(birthPlace);
    }

    public List<Citizen> findAllCitizens(){
        return repository.findAll();
    }
}
