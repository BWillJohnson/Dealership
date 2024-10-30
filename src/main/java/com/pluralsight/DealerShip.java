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
        List<Vehicle>vehiclePrices = new ArrayList<>();
        double lowerPrice = 0;
        double higherPrice = 0;
        for (Vehicle vehicle : inventory) {
            if (vehiclePrices.equals(lowerPrice) && vehiclePrices.equals(higherPrice)){
                System.out.println(lowerPrice-higherPrice);
            }
        }

        return getVehiclesByPrice(min,max);
    }
    public List<Vehicle> getVehiclesByMakeModel(String make,String model){
        return getVehiclesByMakeModel(make,model);
    }
    public List<Vehicle> getVehiclesByYear(double min,double max){
        return getVehiclesByYear(min,max);
    }
    public List<Vehicle> getVehiclesByColor(String color){
        return getVehiclesByColor(color);
    }
    public List<Vehicle> getVehiclesByMileage(double min, double max){
        return getVehiclesByMileage(min,max);
    }
    public List<Vehicle> getVehicleByType(String vehicleType){
        return getVehicleByType(vehicleType);
    }
    public List<Vehicle> getAllVehicles() {
        return inventory;
    }
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
        System.out.println(vehicle + "Notice Vehicle has been added to Dealership inventory.");
    }
    public void removeVehicle(Vehicle vehicle){

    }
    @Override
    public String toString() {
        return name + " | " + address + " | " + cell;
    }


}
