package com.company;

public class Frigate extends Vehicle implements SeaVessel {
    private double displacement;

    public Frigate(String name, int maxPassenger, double maxSpeed, double displacement) {
        super(name, maxPassenger, maxSpeed);
        this.displacement = displacement;
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
