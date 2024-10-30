package com.pluralsight;
public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private  String vehicleType;
    private String color;
    private  int odometer;
    private double priceRange;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double priceRange) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.priceRange = priceRange;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vin=" + vin +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", vehicleType='" + vehicleType + '\'' +
                ", color='" + color + '\'' +
                ", odometer=" + odometer +
                ", priceRange=" + priceRange +
                '}';
    }
}
