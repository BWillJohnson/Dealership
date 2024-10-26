package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class DealerShipFile_Manager {
    private static final String FILE_NAME = "dealership.csv";
    private static final List<Vehicle>inventory = new ArrayList<Vehicle>();
    private static List<DealerShip> dealerShip;


    public DealerShip getDealerShip(String fileName){
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
                    DealerShip dealerShip1 = new DealerShip(name,address,cell);
                    dealerShip.add(dealerShip1);

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
                    inventory.add(vehicle);
                }

            }
        } catch (Exception e) {

        }
        return getDealerShip(FILE_NAME);
    }
    public void saveDealerShip(String dealerShip){
        System.out.println(FILE_NAME);

    }




}
