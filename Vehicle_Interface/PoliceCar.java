package com.company;

public class PoliceCar extends Vehicle implements LandVehicle, IsEmergency{

    private final String licensePlate;
    private final String officer;
    private final double mileage;
    private final double fuelTank;
    private final int numberSeats;

    public PoliceCar(String name, int maxPassenger, double maxSpeed, String licensePlate, String officer, double mileage, double fuelTank, int numberSeats) {
        super(name, maxPassenger, maxSpeed);
        this.licensePlate = licensePlate;
        this.officer = officer;
        this.mileage = mileage;
        this.fuelTank = fuelTank;
        this.numberSeats = numberSeats;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getOfficer() {
        return officer;
    }

    public double getMileage() {
        return mileage;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    @Override
    public void soundSiren() {
        System.out.println("CaR gO bRbRBR");

    }

    @Override
    public void drive() {
        System.out.println("Drive on");

    }

    @Override
    public void setNumWheels(int numWheels) {

    }

    @Override
    public int getNumWheels() {
        return 0;
    }



    @Override
    public String toString() {
        return "PoliceCar{" +
                "licensePlate='" + licensePlate + '\'' +
                ", officer='" + officer + '\'' +
                ", mileage=" + mileage +
                ", fuelTank=" + fuelTank +
                ", numberSeats=" + numberSeats +
                ", name='" + name + '\'' +
                ", maxPassenger=" + maxPassenger +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
