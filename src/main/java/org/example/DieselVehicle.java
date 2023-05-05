package org.example;

public class DieselVehicle extends Vehicle implements CalculateCost {
    public DieselVehicle(VehicleSize vehicleSize, CarType carType, int numberOfCylinders) {
        super(vehicleSize, carType, numberOfCylinders);
    }

    @Override
    public double calculateInsurance() {
        return 1700 + getNumberOfCylinders() * 10;
    }

    @Override
    public double calculateConsumption() {
        return getVehicleSize();
    }

    @Override
    public double calculateMaintenanceCost() {
        return 250 + getNumberOfCylinders() * 7;
    }
}
