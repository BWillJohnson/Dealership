package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class userInterface {
    private DealerShip dealerShip;

    public userInterface() {

    }

    public void display(Scanner scanner) {
        init();
        Scanner myScan = new Scanner(System.in);

        boolean input = true;
        while (input) {
            System.out.println("Dealership \n");
            System.out.println("Choose an option:");
            System.out.println("1) processGetByPriceRequest");
            System.out.println("2) processGetByMakeModelRequest");
            System.out.println("3) processGetByYearRequest");
            System.out.println("4) processGetByColorRequest");
            System.out.println("5) processGetByMileageRequest");
            System.out.println("6) processGetByVehicleTypeRequest");
            System.out.println("7) processGetAllVehiclesRequest");
            System.out.println("8) processAddVehiclesRequest");
            System.out.println("9) processRemoveVehicleRequest");
            System.out.println("10) Thank you for choosing CarWorld enterprise. \n");

            String scan = scanner.nextLine();
            scanner.nextLine();

            switch (scan) {
                case "1":
                    processGetByPriceRequest();
                    break;
                case "2":
                    processGetByMakeModelRequest();
                    break;
                case "3":
                    processGetByYearRequest();
                    break;
                case "4":
                    processGetByYColorRequest();
                    break;
                case "5":
                    processGetByMileageRequest();
                    break;
                case "6":
                    processGetByVehicleTypeRequest();
                    break;
                case "7":
                    processGetAllVehiclesRequest();
                    break;
                case "8":
                    processAddVehiclesRequest();
                    break;
                case "9":
                    processRemoveVehicleRequest();
                    break;
                case "10":
                    System.out.println("Thank you for choosing CarWorld enterprise.");
                default:
                    System.out.println("Notice! Invalid input!");
            }
        }
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
    private void displayVehicles(List <Vehicle> vehicles){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicles);
        }
    }
}