package functions;

import entity.book_flight;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlReader {

    public static book_flight xmlReader(String filename) {
        String path = "src/main/resources/" + filename + ".xml";
        File file = new File(path);

        book_flight book = null;
        try {
            JAXBContext context = JAXBContext.newInstance(book_flight.class);
            Unmarshaller unMarshaller = context.createUnmarshaller();
            book = (book_flight) unMarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        System.out.println(book);
        return book;
    }
}
