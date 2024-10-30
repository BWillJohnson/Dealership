package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class userInterface {
    private DealerShip dealerShip;

    public userInterface() {

    }

    public void display() {
        init();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Welcome to CarWorld Enterprise");
            System.out.println("Choose an option");
            System.out.println("1) Search within price range.");
            System.out.println("2) Search within make and model");
            System.out.println("3) Search within year range");
            System.out.println("4) Search within certain color");
            System.out.println("5) Search within a certain mileage");
            System.out.println("6) Search within a certain vehicle type");
            System.out.println("7) Search all vehicles");
            System.out.println("8) Add vehicle");
            System.out.println("9) Remove vehicle");
            System.out.println("X) Exit");
            String input = scanner.nextLine().trim();
            switch (input.toLowerCase()) {
                case "1" -> processGetByPriceRequest();
                case "2" -> processGetByMakeModelRequest();
                case "3" -> processGetByYearRequest();
                case "4" -> processGetByYColorRequest();
                case "5" -> processGetByMileageRequest();
                case "6" -> processGetByVehicleTypeRequest();
                case "7" -> processGetAllVehiclesRequest();
                case "8" -> processAddVehiclesRequest();
                case "9" -> processRemoveVehicleRequest();
                case "X" -> running = false;
                default -> System.out.println("Invalid option");
            }
        }
        scanner.close();
    }

    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByYColorRequest() {
    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {
        List<Vehicle> allVehicles = dealerShip.getAllVehicles();
        displayVehicles(allVehicles);
    }

    public void processAddVehiclesRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

    private void init() {
        DealerShipFile_Manager fileManager = new DealerShipFile_Manager();
        dealerShip = fileManager.getDealerShip();
    }

    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}