package functions;

import entity.BookFlight;
import entity.book_flight;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Transformer {
    public static BookFlight transform(book_flight book_fli) {
        BookFlight bookFlight = new BookFlight();

        String oldDateString = book_fli.getCustomer().getBookingData().getData();
        SimpleDateFormat oldDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        SimpleDateFormat newDateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        Date date = null;
        try {
            date = oldDateFormat.parse(oldDateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        bookFlight.setDate(newDateFormat.format(date));
        bookFlight.setPassenger(book_fli.getCustomer().getFirstname() + " " + book_fli.getCustomer().getSurname());
        bookFlight.setFlightClass(book_fli.getCustomer().getBookingData().getFlight_class());
        bookFlight.setFlight(book_fli.getCustomer().getBookingData().getConnection());
        LogCreator.logCreator("Информация обработана");
        return bookFlight;
    }
}
