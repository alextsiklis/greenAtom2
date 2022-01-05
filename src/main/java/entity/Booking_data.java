package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement(name = "booking_data")
@XmlAccessorType(XmlAccessType.FIELD)
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
