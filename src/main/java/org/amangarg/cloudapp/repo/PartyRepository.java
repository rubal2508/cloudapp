package org.amangarg.cloudapp.repo;

import org.amangarg.cloudapp.model.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Integer> {
}
