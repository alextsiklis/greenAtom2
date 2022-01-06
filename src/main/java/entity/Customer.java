package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customer", propOrder = {
        "firstname",
        "surname",
        "bookingData",
})
public class Customer {
    @XmlElement(name = "surname")
    private String surname;

    @XmlElement(name = "firstname")
    private String firstname;

    @XmlElement(name = "booking_data")
    private Booking_data bookingData = new Booking_data();
}
