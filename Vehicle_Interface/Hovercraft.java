package com.company;

public class Hovercraft extends Vehicle implements LandVehicle, SeaVessel {
    public Hovercraft(String name, int maxPassenger, double maxSpeed) {
        super(name, maxPassenger, maxSpeed);
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

    @Override
    public void launch() {

    }

    @Override
    public double getDisplacement() {
        return 0;
    }

    @Override
    public void setDisplacement(double displacement) {

    }
}
