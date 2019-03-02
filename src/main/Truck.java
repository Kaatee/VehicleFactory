package main;

public class Truck extends Vehicle {
    public Truck(){
        super(15,2000);
        System.out.println("Wyprodukowalem ciezarowke");
    }/*
    @Override
    void process() {
        try {
            Thread.sleep(getProcessTime()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
}
