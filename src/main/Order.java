package main;

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Order implements Serializable {
    private ArrayList<Vehicle> listOfVehicles;
    private double totalCost;
    private String type;////


    public Order(){
        this.totalCost = 0;
        this.listOfVehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        this.listOfVehicles.add(vehicle);
        this.totalCost += vehicle.getCost();
    }

    public ArrayList<Vehicle> getListOfVehicles() {
        return listOfVehicles;
    }

    public double getTotalCost() {
        return totalCost;
    }

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
