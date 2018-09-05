package com.javatutorial.generics.model;

/**
 * @author jawad
 * @since 9/5/18 11:11 AM
 */
public class Motorcycle extends Cycle {
    private String engine;
    private Integer fuelUsedPerDay;

    public Motorcycle(String name, String model, String engine, Integer fuelUsedPerDay) {
        super(name, model);
        this.engine = engine;
        this.fuelUsedPerDay = fuelUsedPerDay;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Integer getFuelUsedPerDay() {
        return fuelUsedPerDay;
    }

    public void setFuelUsedPerDay(Integer fuelUsedPerDay) {
        this.fuelUsedPerDay = fuelUsedPerDay;
    }
}
