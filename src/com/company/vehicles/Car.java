package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String carBrand;
    private String carClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car() {

    }
    public Car(String carBrand, String carClass, double weight, Driver driver, Engine engine) {
        this.carBrand=carBrand;
        this.carClass=carClass;
        this.weight=weight;
        this.driver=driver;
        this.engine=engine;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine motor) {
        this.engine = motor;
    }

    public void start() {
        System.out.println("Go");
    }
    public void stop() {
        System.out.println("Stop");
    }
    public void turnRight() {
        System.out.println("Turn right");
    }
    public void turnLeft() {
        System.out.println("Turn left");
    }
    @Override
    public String toString() {
        return "Car{ Brand = "+carBrand+
                ", CarClass = '"+carClass+"'"+
                ", Weight = "+weight+
                 ", Driver = " + driver +
                ", Engine = " + engine + " }";
    }

}
