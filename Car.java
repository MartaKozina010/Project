package com.company;

public class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    Car(int cylinder, String name) {
        engine = true;
        this.cylinder = cylinder;
        this.name = name;
        wheels = 4;
    }

    int getCylinder() {
        return cylinder;
    }

    String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine";
    }

    public void accelerate() {
        System.out.println("Car -> accelerate");
    }
}
