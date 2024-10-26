package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class DealerShip {
    private String name;
    private String address;
    private String cell;

    private static ArrayList<DealerShip> inventory = new ArrayList<>();


    public DealerShip(String name, String address, String cell) {
        this.name = name;
        this.address = address;
        this.cell = cell;
        this.inventory = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return getVehiclesByPrice(min,max);
    }
    public List<Vehicle> getVehiclesByMakeModel(String make,String model){
        return getVehiclesByMakeModel(make,model);
    }
    public List<Vehicle> getVehiclesByYear(int min,int max){
        return getVehiclesByYear(min,max);
    }
    public List<Vehicle> getVehiclesByColor(String color){
        return getVehiclesByColor(color);
    }
    public List<Vehicle> getVehiclesByMileage(int min, int max){
        return getVehiclesByMileage(min,max);
    }
    public List<Vehicle> getVehicleByType(String vehicleType){
        return getVehicleByType(vehicleType);
    }
    public List<Vehicle> getAllVehicles() {
        return getAllVehicles();
    }
    public void addVehicle() {

    }
    public void removeVehicle(){
    }
    @Override
    public String toString() {
        return name + " | " + address + " | " + cell;
    }
}
