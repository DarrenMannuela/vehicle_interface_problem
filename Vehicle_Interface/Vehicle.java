package com.company;

public abstract class Vehicle {
    String name;
    int maxPassenger;
    double maxSpeed;

    public Vehicle(String name, int maxPassenger, double maxSpeed) {
        this.name = name;
        this.maxPassenger = maxPassenger;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }


    public double getMaxSpeed() {
        return maxSpeed;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
