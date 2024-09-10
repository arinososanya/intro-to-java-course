package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom { // Defining a public class named Showroom

    private List<Car> cars; // Declaring a private instance variable named 'cars' of type List<Car>. I am essentially telling the compiler that cars will hold a list of objects belonging to the Car class.

    public Showroom() { // To define a public constructor with no arguments
        this.cars = new ArrayList<>(); // Initialising the 'cars' list with a new empty ArrayList object
        cars.add(new Car("Volvo", "V40", "blue", 2012)); // Using the .add method to add a new Car object into the Set Collection (ArrayList) with details to the 'cars' list. The set add() function adds the element only if the specified element is not already present in the set else the function returns False if the element is already present in the Set.
        cars.add(new Car("Porsche", "Panamera", "red", 2009)); // Adding another Car object with details to the 'cars' list
        cars.add(new Car("Audi", "A3", "grey", 2018));
    }

    public void setCars(List<Car> cars) { // To define a public set method named 'setCars' that takes a List<Car> argument
        this.cars = cars; // Assigns the argument 'cars' to the instance variable 'cars' (overrides the existing list)
    }

    public List<Car> getCars() { // Defines a public method named 'getCars' that returns a List<Car>
        return this.cars; // Returning the current value of the instance variable 'cars'. This method provides a copy of the current list stored in the cars instance variable. This is helpful to prevent unintended modifications to the original list from outside the class.
    }
}




// Note: What is the relationship between the Showroom class and the Car class?
// They have a composition relationship. I.e a Showroom contains multiple Car objects.