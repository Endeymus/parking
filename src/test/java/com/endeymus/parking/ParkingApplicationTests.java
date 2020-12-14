package com.endeymus.parking;

import com.endeymus.parking.configs.Floor1;
import com.endeymus.parking.configs.Floor2;
import com.endeymus.parking.configs.MainConfig;
import com.endeymus.parking.models.parking.Floor;
import com.endeymus.parking.models.parking.Parking;
import com.endeymus.parking.models.parking.Sensor;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ParkingApplicationTests {


    private static ApplicationContext context;

    @BeforeAll
    static void beforeAll() {
        context = new AnnotationConfigApplicationContext(MainConfig.class);
    }

    @Test
    void contextLoads() {
        Parking parking = (Parking) context.getBean("parking");

        parking.getFloors().forEach(System.out::println);
    }

    @Test
    void findAllFree() {
        Parking parking = (Parking) context.getBean("parking");

//        parking.findAllFree().forEach(System.out::println);
    }

    @Test
    void findFreeFromFloor1Test() {
        Parking parking = (Parking) context.getBean("parking");

//        parking.findAllFromFloor(0).forEach(System.out::println);
    }

    @Test
    void findAllFromFloor1() {
        Parking parking = (Parking) context.getBean("parking");

//        System.out.println(parking.findAllFromFloor(0));
    }

    @Test
    void annotationFloorTest(@Autowired @Floor2 Floor floor) {
        floor.getSensors().forEach(System.out::println);
    }

    @Test
    void getStatusFromFloor(@Autowired @Floor1 Floor floor) {
        Parking parking = (Parking) context.getBean("parking");

        parking.updateFloor(floor);
        floor.getSensors().forEach(System.out::println);
    }
}
