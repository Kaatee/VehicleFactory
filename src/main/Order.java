package main;

import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable { //singleton

    private static Order instance;

    private ArrayList<Vehicle> listOfVehicles;
    private double totalCost;


    private Order(){}

    public static Order getInstance(){
        if(instance==null) {
            instance = new Order();
            instance.totalCost = 0;
            instance.listOfVehicles = new ArrayList<>();
        }
        return instance;
    }

    public synchronized void addVehicle(Vehicle vehicle){
        this.listOfVehicles.add(vehicle);
        this.totalCost += vehicle.getCost();
    }

    public ArrayList<Vehicle> getListOfVehicles() {
        return listOfVehicles;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
