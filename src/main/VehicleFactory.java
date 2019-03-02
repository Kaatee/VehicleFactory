package main;

public class VehicleFactory {
    public Vehicle createVehicle(String type){
        Vehicle vehicle;
        if(type.equals("car")){
            vehicle = new Car();
        }
        else if(type.equals("motorcycle")){
            vehicle = new Motorcycle();
        }
        else if(type.equals("truck")){
            vehicle = new Truck();
        }
        else{
            vehicle = null;
        }

        return vehicle;
    }
}
