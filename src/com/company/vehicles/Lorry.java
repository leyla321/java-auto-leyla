package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private double carryingCapacity;

    public Lorry() {

    }
    public Lorry(String carBrand, String carClass, double weight, Driver driver, Engine engine, double carryingCapacity) {
        super(carBrand, carClass, weight, driver, engine);
        this.carryingCapacity=carryingCapacity;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    @Override
    public String toString() {
        return "Car Brand = "+getCarBrand()+
                ", Car Class = "+getCarClass()+
                ", Car weight = "+getWeight()+
                ", Driver = " +getDriver()+
                ", Engine = "+getEngine()+
                ", Carrying capacity = "+carryingCapacity;
    }
}
