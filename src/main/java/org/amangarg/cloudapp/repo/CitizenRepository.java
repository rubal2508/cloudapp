package org.amangarg.cloudapp.repo;

import org.amangarg.cloudapp.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitizenRepository extends JpaRepository<Citizen, Integer> {
    List<Citizen> getCitizensByBirthPlace(String birthPlace);
}
