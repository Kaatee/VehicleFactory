package main;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {


    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        //String[] types = {"car", "motorcycle","truck","car","motorcycle"};  //car-10, motor-5, truck-15
        //String[] types = {"car", "car","car"};

        System.out.println("\n\nSerialization");
        XMLHandler xml = new XMLHandler();
        try {
            ArrayList<String> vehicleTypes;
            vehicleTypes = xml.deserialize();

            ExecutorService executor = Executors.newFixedThreadPool(3);

            for(int i=0; i<vehicleTypes.size(); i++){
                Runnable thread = new MyThread(vehicleTypes.get(i));
                executor.execute(thread);
            }

            executor.shutdown();
            while (!executor.isTerminated()) {
            }
            System.out.println("\nFinished all threads");

            long duration = (System.currentTimeMillis() - startTime) / 1000;
            System.out.println("Program execution time: " + duration);

        } catch (IOException e) {
            e.printStackTrace();
        }






///////////////////////////////////////////////////////////

        //////////////////////////////////////
    }

}
