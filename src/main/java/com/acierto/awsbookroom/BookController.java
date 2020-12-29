package com.acierto.awsbookroom;

import com.acierto.awsbookroom.model.BookingsForDay;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class BookController {

    @RequestMapping(path="/bookings/today")
    public BookingsForDay getBookingsForToday() {
        return new BookingsForDay();
    }
}
