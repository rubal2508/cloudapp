package org.amangarg.cloudapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Party {

    @Id
    private int partyId;
    private String venue;
}
