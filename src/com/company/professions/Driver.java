package com.company.professions;

public class Driver extends Person{

    private int drivingExperience;

    public Driver() {

    }
    public Driver(String fullName, int drivingExperience) {
        super(fullName);
        this.drivingExperience=drivingExperience;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
    @Override
    public String toString() {
        return ""+getFullName()+
                ", Driving experience = "+drivingExperience;
    }
}
