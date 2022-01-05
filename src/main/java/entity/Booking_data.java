package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@XmlType(name = "booking_data")
public class Booking_data {
    @XmlElement(name = "airline")
    private String airline;

    @XmlElement(name = "connection")
    private String connection;

    @XmlElement(name = "class")
    private String flight_class;

    @XmlElement(name = "date")
    private String data;
}
