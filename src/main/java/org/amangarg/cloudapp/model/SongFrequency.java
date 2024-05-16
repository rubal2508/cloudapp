package org.amangarg.cloudapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SongFrequency {
    private int songId;
    private int freq;
}
