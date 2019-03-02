package main;

public class Motorcycle extends Vehicle {

    public Motorcycle(){
        super(5, 600);
        System.out.println("Wyprodukowalem motor");
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
