package main;

public class Main {


    public static void main(String[] args){
        VehicleFactory vehicleFactory = new VehicleFactory();
        long startTime = System.currentTimeMillis();
        //String[] types = {"car", "motorcycle","truck","car","motorcycle"};
        String[] types = {"car", "car","car"};
        for(int i=0; i<types.length; i++){
            MyThread thread = new MyThread(types[i]);
            thread.run();
        }
        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime) / 1000;
        System.out.println(duration);
    }

}
