package com.endeymus.parking.controllers;

import com.endeymus.parking.models.parking.Floor;
import com.endeymus.parking.models.parking.Parking;
import com.endeymus.parking.models.parking.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/floor")
@Controller
public class FloorController {

    @Autowired
    private Parking parking;

    @GetMapping("/{id}")
    public String show(@PathVariable int id, Model model) {
        Floor floor = parking.getFloor(id - 1);

        parking.updateFloor(floor);

        model.addAttribute("sensors", floor.getSensors());
        model.addAttribute("title", "Парквочный уровень " + id);
        return "operator/show";
    }
    @GetMapping("/all")
    public String all(Model model) {
        parking.updateAll();
        List<Sensor> allSensors = parking.getAllSensors();
        model.addAttribute("sensors", allSensors);
        return "operator/show";
    }
    @GetMapping("/redirect")
    public String redirect() {
        return "redirect:https://demo.thingsboard.io/dashboards/ad7ed530-3e48-11eb-8cad-3d8873d86e51";
    }
}
