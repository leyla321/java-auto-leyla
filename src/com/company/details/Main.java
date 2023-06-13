package com.company.details;

import com.company.professions.Driver;
import com.company.professions.Person;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Lucifer Morningstar", 35);
        Engine engine = new Engine(250, "General motors");
        Car car = new Car("Lamborghini", "A class", 225, driver, engine);
        Lorry lorry = new Lorry("Mazda", "E class", 522, driver, engine, 1000);
        SportCar sportCar = new SportCar("Porch", "A class", 505, driver, engine, 150);

        System.out.println(driver);
        System.out.println(engine);
        System.out.println(car);
        System.out.println(lorry);
        System.out.println(sportCar);

        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();

    }
}
