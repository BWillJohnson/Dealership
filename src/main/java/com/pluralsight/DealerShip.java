package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class DealerShip {
    private final String name;
    private final String address;
    private final String cell;
    private final List<Vehicle> inventory;

    public DealerShip(String name, String address, String cell) {
        this.name = name;
        this.address = address;
        this.cell = cell;
        this.inventory = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        List<Vehicle> vehiclePrices = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                vehiclePrices.add(vehicle);
            }
        }
        return vehiclePrices;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> vehiclesByMakeModel = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                vehiclesByMakeModel.add(vehicle);
            }
        }
        return vehiclesByMakeModel;
    }

    public List<Vehicle> getVehiclesByYear(double min, double max) {
        List<Vehicle> vehiclesByYear = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
           double year = vehicle.getYear();
            if (year >= min && year <= max) {
                vehiclesByYear.add(vehicle);
            }
        }
        return vehiclesByYear;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> vehiclesByColor = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                vehiclesByColor.add(vehicle);
            }
        }
        return vehiclesByColor;
    }

    public List<Vehicle> getVehiclesByMileage(double minVehicleMileage, double maxVehicleMileage) {
        List<Vehicle> vehiclesByMileage = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            double mileage = vehicle.getMileage();
            if (mileage >= minVehicleMileage && mileage <= maxVehicleMileage) {
                vehiclesByMileage.add(vehicle);
            }
        }
        return vehiclesByMileage;
    }

    public List<Vehicle> getVehiclesByType(String vehicleType) {
        List<Vehicle> vehiclesByType = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)) {
                vehiclesByType.add(vehicle);
            }
        }
        return vehiclesByType;
    }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(inventory); // Return a copy for safety
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
        System.out.println(vehicle + " - Notice: Vehicle has been added to Dealership inventory.");
    }

    public void removeVehicle(Vehicle vehicle) {
        if (inventory.remove(vehicle)) {
            System.out.println(vehicle + " - Notice: Vehicle has been removed from Dealership inventory.");
        } else {
            System.out.println("Vehicle not found in inventory.");
        }
    }

    @Override
    public String toString() {
        return name + " | " + address + " | " + cell;
    }
}
