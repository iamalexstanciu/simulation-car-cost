package org.example;

public class PetrolVehicle extends  Vehicle implements CalculateCost{


    public PetrolVehicle(VehicleSize vehicleSize, CarType carType, int numberOfCylinders, int maximumSpeed) {
        super(vehicleSize, carType, numberOfCylinders);
        this.maximumSpeed = maximumSpeed;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    private int maximumSpeed;


    @Override
    public double calculateInsurance() {
        return 1500 + getVehicleSize() / 2 + getNumberOfCylinders() / 10;
    }

    @Override
    public double calculateConsumption() {
        return getMaximumSpeed() + getNumberOfCylinders() * 10 + getVehicleSize();
    }

    @Override
    public double calculateMaintenanceCost() {
        return getMaximumSpeed() + getNumberOfCylinders() * 10;
    }
}
