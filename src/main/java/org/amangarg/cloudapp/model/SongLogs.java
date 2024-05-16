package org.amangarg.cloudapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class SongLogs {
    @Id
    private int logId;
    private int personId;
    private int songId;
    private long timeStamp;
}
