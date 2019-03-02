package main;

public class Car extends Vehicle {

    public Car(){
        super(10, 1000);
        System.out.println("Wyprodukowalem samochod");
    }
/*
    @Override
    void process() {
        try {
            Thread.sleep(getProcessTime()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/
}
