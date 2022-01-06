import entity.book_flight;
import functions.PackageCreator;
import functions.Transformer;
import functions.XmlReader;
import functions.XmlWriter;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PackageCreator.createPackage("ResultedXML");

        ArrayList<book_flight> book_flights = new ArrayList<>();
        book_flights.add(XmlReader.xmlReader("file"));

        for(book_flight book_fli: book_flights) {
            XmlWriter.xmlWriter(Transformer.transform(book_fli));
        }
    }
}
