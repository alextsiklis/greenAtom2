package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booking_data", propOrder = {
        "airline",
        "connection",
        "data",
        "flight_class"
})
public class Booking_data {
    @XmlElement(name = "airline")
    private String airline;

    @XmlElement(name = "connection")
    private String connection;

    @XmlElement(name = "class")
    private String flight_class;

    @XmlElement(name = "data")
    private String data;
}
