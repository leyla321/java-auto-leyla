package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private double maxSpeed;

    public SportCar() {

    }
    public SportCar(String carBrand, String carClass, double weight, Driver driver, Engine engine, double maxSpeed) {
        super(carBrand, carClass, weight, driver, engine);
        this.maxSpeed=maxSpeed;
    }
    public double getSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Car Brand = "+getCarBrand()+
                ", Car Class = "+getCarClass()+
                ", Car weight = "+getWeight()+
                ", Driver = " +getDriver()+
                ", Engine = "+getEngine()+
                ", Max Speed = "+getSpeed();
    }
}
