package com.endeymus.parking.models.parking;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sensor {

    private String UUID;
    private String name;
    private boolean busy;
    private int floor;

}
