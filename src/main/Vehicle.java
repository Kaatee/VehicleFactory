package main;

public class Vehicle {
    private int processTime;
    private double cost;
    private String type;

    public Vehicle(int processTime, double cost){
        this.cost = cost;
        this.processTime = processTime;
    }

    void process(){
        System.out.println("Proceed: " + this.getClass());
        try {
            Thread.sleep(getProcessTime()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    public int getProcessTime() {
        return processTime;
    }

    public double getCost() {
        return cost;
    }

    public String getType() {
        return type;
    }

}
