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

@XmlRootElement(name = "BookFlight")
@XmlAccessorType(XmlAccessType.FIELD)
public class BookFlight {
    @XmlElement(name = "Date")
    private String date;

    @XmlElement(name = "Flight")
    private String flight;

    @XmlElement(name = "Passenger")
    private String passenger;

    @XmlElement(name = "Class")
    private String FlightClass;
}
