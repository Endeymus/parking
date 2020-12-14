package com.endeymus.parking.models.parking;

import com.endeymus.parking.models.utils.ThingsboardParser;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Data
public class Parking {

    @Autowired
    private List<Floor> floors;

    @Autowired
    private ThingsboardParser parser;

    public Floor getFloor(int floor) {
        return floors.get(floor);
    }

    public List<Sensor> getAllSensors() {
        List<Sensor> list = new ArrayList<>();
        floors.forEach(floor -> {
            list.addAll(floor.getSensors());
        });
        return list;
    }

    public void updateAll() {
        floors.forEach(this::updateFloor);
    }

    public void updateFloor(Floor floor) {
        floor.getSensors().forEach(this::updateSensor);
    }

    private void updateSensor(Sensor sensor) {
        sensor.setBusy(parser.getStatus(sensor.getUUID()));
    }
}
