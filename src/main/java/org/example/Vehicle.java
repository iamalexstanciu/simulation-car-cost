package org.example;

import java.util.Random;

abstract class Vehicle {
    private int vehicleSize;
    private CarType carType;
    private int numberOfCylinders;
    private Random r = new Random();

    public Vehicle( VehicleSize vehicleSize, CarType carType, int numberOfCylinders) {
        this.vehicleSize = switch(vehicleSize) {
            case SUBCOMPACT -> this.vehicleSize = r.nextInt(2830 - 2405) + 2830;
            case COMPACT -> this.vehicleSize = r.nextInt(3110 - 2830) + 3110;
            case MID_SIZE -> this.vehicleSize = r.nextInt(3395 - 3115) + 3395;
            case LARGE -> this.vehicleSize = r.nextInt(5000 - 3400) + 5000;
        };
        this.carType = carType;
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(int vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }
}
