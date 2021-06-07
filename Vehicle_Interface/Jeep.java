package com.company;

public class Jeep extends Vehicle implements LandVehicle{
    private int numWheels;

    public Jeep(String name, int maxPassenger, double maxSpeed, int numWheels) {
        super(name, maxPassenger, maxSpeed);
        this.numWheels = numWheels;
    }

    @Override
    public void drive() {

    }

    @Override
    public void setNumWheels(int numWheels) {

    }

    @Override
    public int getNumWheels() {
        return 0;
    }
}
