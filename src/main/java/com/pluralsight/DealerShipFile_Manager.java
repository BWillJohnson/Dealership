package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class DealerShipFile_Manager {
    private static final String FILE_NAME = "dealership.csv";


    public DealerShip getDealerShip() {
        DealerShip dealerShip = null;
        List<Vehicle> vehicles = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] enterpriseParts = line.split("\\|");
                if (enterpriseParts.length == 3) {
                    String name = enterpriseParts[0];
                    String address = enterpriseParts[1];
                    String cell = enterpriseParts[2];
                    dealerShip = new DealerShip(name, address, cell);
                }
            }

            while ((line = reader.readLine()) != null) {
                String[] carParts = line.split("\\|");
                if (carParts.length == 8) {
                    int vin = Integer.parseInt(carParts[0]);
                    int year = Integer.parseInt(carParts[1]);
                    String make = carParts[2];
                    String model = carParts[3];
                    String vehicleType = carParts[4];
                    String color = carParts[5];
                    int mileage = Integer.parseInt(carParts[6]);
                    double price = Double.parseDouble(carParts[7]);

                    Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, mileage, price);
                    vehicles.add(vehicle);
                }

            }
            for (Vehicle vehicle : vehicles) {
                dealerShip.addVehicle(vehicle);
            }
        } catch (Exception e) {
            System.err.println("Notice the file doesn't exist!");
            e.printStackTrace();
        }
        return dealerShip;
    }
    public void saveDealerShip(DealerShip dealerShip){
        List<Vehicle>inventory = dealerShip.getInventory();
        try(BufferedWriter write = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Vehicle vehicle : inventory) {
                String line = vehicle.getVin() + "," + vehicle.getMake() + ", " + vehicle.getModel() + ", " + vehicle.getVehicleType()
                        + ", " + vehicle.getColor() + ", " + vehicle.getMileage() + ", " + vehicle.getPrice();
            }

        }catch (Exception e){
            System.err.println("Notice trouble writing to file!");
        }

    }
}
