package main;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args){

        ArrayList<String> vehicleTypes;

        while(true) {
            XMLHandler xml = new XMLHandler();
            try {
                Order order = Order.getInstance();
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                String line;
                String content="";

                while((line = reader.readLine())!=null) {
                    content+=line;
                    if(line.equals("</order>")) break;
                }

                Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new StringReader(content)));
                System.out.println("Skonczylem czytac zamowienie");

                long startTime = System.currentTimeMillis();
                vehicleTypes = xml.deserialize(doc);
                ExecutorService executor = Executors.newFixedThreadPool(3);

                for (int i = 0; i < vehicleTypes.size(); i++) {
                    Runnable thread = new MyThread(vehicleTypes.get(i));
                    executor.execute(thread);
                }

                executor.shutdown();
                while (!executor.isTerminated()) {}

                System.out.println("Totel cost: " + order.getTotalCost());
                long duration = (System.currentTimeMillis() - startTime) / 1000;
                System.out.println("Program execution time [s]: " + duration);

                order.destroy();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
