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
        Scanner response = new Scanner(System.in);
        System.out.println("Enter minimum price: ");
        double minPrice = response.nextDouble();
        System.out.println("Enter your maximum price: ");
        double maxPrice = response.nextDouble();

        List<Vehicle> vehicles = dealerShip.getVehiclesByPrice(minPrice, maxPrice);
        displayVehicles(vehicles);

        response.close();
    }

    public void processGetByMakeModelRequest() {
        Scanner response = new Scanner(System.in);
        System.out.println("Enter make: ");
        String make = response.nextLine();
        System.out.println("Enter model: ");
        String model = response.nextLine();

        List<Vehicle> vehicles = dealerShip.getVehiclesByMakeModel(make, model);
        displayVehicles(vehicles);

        response.close();
    }

    public void processGetByYearRequest() {
        Scanner response = new Scanner(System.in);
        System.out.println("Enter previous year: ");
        double vehiclePreviousYear = response.nextDouble();
        System.out.println("Enter preferred year");
        double currentYear = response.nextDouble();
        List<Vehicle> vehicles = dealerShip.getVehiclesByYear(vehiclePreviousYear,currentYear);
        displayVehicles(vehicles);

        response.close();
    }

    public void processGetByYColorRequest() {
        Scanner response = new Scanner(System.in);
        System.out.println("Enter Color: ");
        String colorOfVehicle = response.nextLine();
        List<Vehicle> vehicles = dealerShip.getVehiclesByColor(colorOfVehicle);
        displayVehicles(vehicles);

        response.close();
    }

    public void processGetByMileageRequest() {
        Scanner response = new Scanner(System.in);
        System.out.println("Enter Mileage: ");
        double vehicleMileage = response.nextDouble();
        List<Vehicle> vehicles = dealerShip.getVehiclesByMileage(vehicleMileage);
        displayVehicles(vehicles);

        response.close();
    }

    public void processGetByVehicleTypeRequest() {
        Scanner response = new Scanner(System.in);
        System.out.println("Enter VehicleType: ");
        String vehicleType = response.nextLine();
        List<Vehicle> vehicles = dealerShip.getVehicleByType(vehicleType);
        displayVehicles(vehicles);

        response.close();
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