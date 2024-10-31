package com.pluralsight;
public class Vehicle {
    private double vin;
    private int year;
    private String make;
    private String model;
    private  String vehicleType;
    private String color;
    private  double mileage;
    private double price;

    public Vehicle(double vin, int year, String make, String model, String vehicleType, String color, double mileage, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }

    public double getVin() {
        return vin;
    }

    public double getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }


    public double getPrice() {
        return price;
    }

    public void setVin(double vin) {
        this.vin = vin;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
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
                ", mileage=" + mileage +
                ", price=" + price +
                '}';
    }
}
