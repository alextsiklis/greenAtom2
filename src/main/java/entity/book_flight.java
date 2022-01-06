package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@XmlRootElement(name = "book_flight", namespace = "urn:aeroflot.ru")
@XmlAccessorType(XmlAccessType.FIELD)
public class book_flight {

    @XmlElement(name = "customer")
    private Customer customer;
}
