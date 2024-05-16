package org.amangarg.cloudapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Person {

    @Id
    private int id;
    private int partyId;
    private String name;
}
