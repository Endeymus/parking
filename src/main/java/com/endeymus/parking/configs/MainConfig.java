package com.endeymus.parking.configs;

import com.endeymus.parking.models.parking.Floor;
import com.endeymus.parking.models.parking.Sensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
@ComponentScan({"com.endeymus.parking"})
public class MainConfig {

    //-------------------------------FLOOR1------------------------------------
    @Bean
    @Floor1
    public Sensor sensor11() {
        return new Sensor(
                "limVrMf7qTjlGoEkmz01",
                "A-1",
                false,
                1
        );
    }
    @Bean
    @Floor1
    public Sensor sensor21() {
        return new Sensor(
                "n1a33Hhe3kEHtPTU7e94",
                "A-2",
                false,
                1
        );
    }
    @Bean
    @Floor1
    public Sensor sensor31() {
        return new Sensor(
                "U7MKQ7z9bdWyUHpPtXJY",
                "A-3",
                false,
                1
        );
    }

    //-------------------------------FLOOR2------------------------------------
    @Bean
    @Floor2
    public Sensor sensor12() {
        return new Sensor(
                "GiILnAKpB5OReDKp9GhS",
                "B-1",
                true,
                2
        );
    }
    @Bean
    @Floor2
    public Sensor sensor22() {
        return new Sensor(
                "XUitKr2cP68oicpUnIY7",
                "B-2",
                true,
                2
        );
    }
    @Bean
    @Floor2
    public Sensor sensor32() {
        return new Sensor(
                "Oqza6Q1VVi0JvDihOlhJ",
                "B-3",
                true,
                2
        );
    }

    //-------------------------------FLOOR3------------------------------------
    @Bean
    @Floor3
    public Sensor sensor13() {
        return new Sensor(
                "KQmAsfmIiRyfhNYgpm5S",
                "C-1",
                false,
                1
        );
    }
    @Bean
    @Floor3
    public Sensor sensor23() {
        return new Sensor(
                "C79vucdmmiM2VDzowsP7",
                "C-2",
                false,
                1
        );
    }
    @Bean
    @Floor3
    public Sensor sensor33() {
        return new Sensor(
                "mgTwmb8ANBh7Ky7Wrk0I",
                "C-3",
                false,
                1
        );
    }
    //-------------------------------FLOOR4------------------------------------
    @Bean
    @Floor4
    public Sensor sensor14() {
        return new Sensor(
                "GWh9WIwDZnFzgFaKT3la",
                "D-1",
                false,
                1
        );
    }
    @Bean
    @Floor4
    public Sensor sensor24() {
        return new Sensor(
                "SalWQubdDT61eWBVeitC",
                "D-2",
                false,
                1
        );
    }
    @Bean
    @Floor4
    public Sensor sensor34() {
        return new Sensor(
                "O9K5PXWAzKnmCycK2iKC",
                "D-3",
                false,
                1
        );
    }
    //-------------------------------FLOOR5------------------------------------
    @Bean
    @Floor5
    public Sensor sensor15() {
        return new Sensor(
                "fGRxcHdAP5hoR4yLzgxB",
                "F-1",
                false,
                1
        );
    }
    @Bean
    @Floor5
    public Sensor sensor25() {
        return new Sensor(
                "jB4dAbh02fCouC9Sm8RQ",
                "F-2",
                false,
                1
        );
    }
    @Bean
    @Floor5
    public Sensor sensor35() {
        return new Sensor(
                "VOG66OcPpZhLDAuQXPYN",
                "F-3",
                false,
                1
        );
    }


    @Bean
    @Floor1
    public Floor floor1(@Autowired @Floor1 List<Sensor> sensors) {
        return new Floor(
                sensors,
                1
        );
    }
    @Bean
    @Floor2
    public Floor floor2(@Autowired @Floor2 List<Sensor> sensors) {
        return new Floor(
                sensors,
                2
        );
    }
    @Bean
    @Floor3
    public Floor floor3(@Autowired @Floor3 List<Sensor> sensors) {
        return new Floor(
                sensors,
                3
        );
    }
    @Bean
    @Floor4
    public Floor floor4(@Autowired @Floor4 List<Sensor> sensors) {
        return new Floor(
                sensors,
                4
        );
    }
    @Bean
    @Floor5
    public Floor floor5(@Autowired @Floor5 List<Sensor> sensors) {
        return new Floor(
                sensors,
                5
        );
    }
}
