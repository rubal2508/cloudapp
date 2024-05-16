package org.amangarg.cloudapp.model;

import lombok.Data;

import java.util.List;

@Data
public class PersonSongDTO {
    private int personId;
    private List<SongFrequency> frequencyList;
}
