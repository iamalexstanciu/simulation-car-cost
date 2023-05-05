package org.example;

import java.util.ArrayList;
import java.util.List;

public class DrivingCost {
    private List<Vehicle> vehicle;

    public DrivingCost(Vehicle vehicle) {
        this.vehicle = new ArrayList<>();
    }

    public double calculateTotalCostForGivenMonths(int months, int distance) {
        double costPerVehicle = 0;
        for (Vehicle v : vehicle) {
            if (v instanceof CalculateCost c) {
                costPerVehicle = months * c.calculateMaintenanceCost() + (c.calculateInsurance() / 12) + (c.calculateConsumption() * distance) / 100;
            }
        };
        return costPerVehicle;
    }
}
