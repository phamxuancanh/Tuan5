package org.example.Adapter_Pattern;

public class Main {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();

        String jsonData = "{ \"name\": \"Lê Thanh Hải\", \"age\": 23 }";
        String xmlResult = adapter.convert(jsonData);
        System.out.println("JSON to XML:\n" + xmlResult);

        String xmlData = "<name>Lê Thanh Hải</name><age>23</age>";
        String jsonResult = adapter.convert(xmlData);
        System.out.println("XML to JSON:\n" + jsonResult);
    }
}
