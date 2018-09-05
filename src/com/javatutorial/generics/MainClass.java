package com.javatutorial.generics;

import com.javatutorial.generics.model.*;
import com.javatutorial.generics.service.VehicleService;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jawad
 * @since 9/4/18 10:47 AM
 */
public class MainClass {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Bicycle bicycle = new Bicycle();
        Motorcycle motorcycle = new Motorcycle("Yamaha", "A005", "DBD", 20);
        Car car = new Car("Corolla", "3210");

        List<Cycle> cycles = new ArrayList<>();
        cycles.add(bicycle);
        cycles.add(motorcycle);

        List<Car> cars = new ArrayList<>();
        cars.add(car);

        VehicleService.showConfiguration(cycles);
        VehicleService.showConfiguration(cars);
    }
}
