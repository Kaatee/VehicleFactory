package main;

import java.io.IOException;
import org.w3c.dom.*;
import java.util.ArrayList;


public class XMLHandler {

    public ArrayList<String> deserialize(Document document) throws IOException {
        ArrayList<String> vehicleTypes = new ArrayList<>();

        NodeList nList = document.getElementsByTagName("item");
        for (int temp = 0; temp < nList.getLength(); temp++)
        {
            Node node = nList.item(temp);
            Element eElement = (Element) node;
            vehicleTypes.add(eElement.getAttribute("type"));
        }

        return vehicleTypes;
    }
}
