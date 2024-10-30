package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.List;

public class DealerShipFile_Manager {
    private static final String FILE_NAME = "dealership.csv";


    public DealerShip getDealerShip(){
        DealerShip dealerShip = null;
        List<Vehicle> vehicles = new ArrayList<>();
        try  {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = reader.readLine())!=null)
            {
                String[] parts= line.split("\\|");
                if (parts.length == 3){
                    String name = parts[0];
                    String address = parts[1];
                    String cell = parts[2];
                    dealerShip = new DealerShip(name,address,cell);



                }
            }

            while ((line = reader.readLine())!=null){
                String[] parts= line.split("\\|");
                if (parts.length == 8){
                    int vin = Integer.parseInt(parts[0]);
                    int year = Integer.parseInt(parts[1]);
                    String make = parts[2];
                    String model = parts[3];
                    String vehicleType = parts[4];
                    String color = parts[5];
                    int odometer = Integer.parseInt(parts[6]);
                    double price = Double.parseDouble(parts[7]);

                    Vehicle vehicle = new Vehicle(vin,year,make,model,vehicleType,color,odometer,price);
                    vehicles.add(vehicle);
                }

            }
        } catch (Exception e) {
            System.err.println("Notice the file doesn't exist!");
        }

        for (Vehicle vehicle : vehicles) {
            dealerShip.addVehicle(vehicle);
        }
        return dealerShip;
    }
    public void saveDealerShip(String dealerShip){

        System.out.println(FILE_NAME);

    }




}
