package com.cbfacademy.cars;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Showroom showroom = new Showroom(); // creating a new instance of the Showroom class i.e  Creating a Showroom object
        List<Car> cars = showroom.getCars(); // To get the list of cars

        // Print details for each car
        for (Car car : cars) {
            System.out.println("Make: " + car.getMake());
            System.out.println("Model: " + car.getModel());
            System.out.println("Color: " + car.getColour());
            System.out.println("Year: " + car.getYear());
            System.out.println("------");
        }
        ;
    }
}


