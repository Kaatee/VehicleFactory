package main;

public class Vehicle {
    private int processTime;
    private double cost;

    public Vehicle(int processTime, double cost){
        this.cost = cost;
        this.processTime = processTime;
    }

    void process(){
        try {
            Thread.sleep(getProcessTime()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Skonczylem produkowac"+this.getClass());
    };

    public int getProcessTime() {
        return processTime;
    }

    public double getCost() {
        return cost;
    }

}
