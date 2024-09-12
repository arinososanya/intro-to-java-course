package com.cbfacademy.cars;

public class Car {

    private String make;
    private String model;
    private int year;
    private String colour;

    // Constructor
    public Car(String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

        // Getter methods. These methods access and return values of fields
        public String getMake() {
            return this.make;
        }

        public String getModel() {
            return this.model;
        }

        public int getYear () {
            return this.year;
        }

        public String getColour () {
            return this.colour;

        }

// Setter Method
        public void setColour(String colour) {
            this.colour = colour;
        }

        // Instantiate three Car objects. The new Car object would typically go in the main method or another method where you want to create and use the object.
        public String getDetails(){
            return "Car Details" + this.make + this.model + this.colour + this.year; // Returns the car details, including the make, model, colour and year
        }

        }
