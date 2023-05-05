package org.example;

public class ElectricVehicle implements CalculateCost{
    public CarType getCarType() {
        return carType;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPowerOfBattery() {
        return powerOfBattery;
    }

    private CarType carType;
    private int capacity;
    private double powerOfBattery;
    public ElectricVehicle( int capacity, double powerOfBattery) {
        this.carType = CarType.ELECTRIC;
        this.capacity = capacity;
        this.powerOfBattery = powerOfBattery;
    }

    @Override
    public double calculateInsurance() {
        return 1000 + getCapacity();
    }

    @Override
    public double calculateConsumption() {
        return getPowerOfBattery() * 2;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 500;
    }
}
