package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args){
        VehicleFactory vehicleFactory = new VehicleFactory();
        long startTime = System.currentTimeMillis();

        //String[] types = {"car", "motorcycle","truck","car","motorcycle"};  car-10, motor-5, truck-15

        ExecutorService executor = Executors.newFixedThreadPool(3);
        String[] types = {"car", "car","car"};
        for(int i=0; i<types.length; i++){
            Runnable thread = new MyThread(types[i]);
            //thread.run();
            executor.execute(thread);
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");

        long endTime = System.currentTimeMillis();

        long duration = (endTime - startTime) / 1000;
        System.out.println(duration);
    }

}
