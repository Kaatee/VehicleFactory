package main;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.IOException;

import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.*;
import java.util.ArrayList;


public class XMLHandler {

    public ArrayList<String> deserialize() throws IOException {
        ArrayList<String> vehicleTypes = new ArrayList<>();

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("C:\\Users\\Kasia\\Desktop\\VehicleFactory\\src\\main\\orders.xml"));

            NodeList nList = document.getElementsByTagName("item");
            for (int temp = 0; temp < nList.getLength(); temp++)
            {
                Node node = nList.item(temp);
                Element eElement = (Element) node;
                vehicleTypes.add(eElement.getAttribute("type"));
            }

            return vehicleTypes;

        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }

        return null;
    }
}
