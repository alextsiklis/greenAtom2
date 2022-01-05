package functions;

import entity.BookFlight;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class XmlWriter {

    public static void xmlWriter(BookFlight book) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(BookFlight.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            Date date = new Date();
            File requestFile = new File(String.format("ResultedXML/%tF.xml", date));
            marshaller.marshal(book, requestFile);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
