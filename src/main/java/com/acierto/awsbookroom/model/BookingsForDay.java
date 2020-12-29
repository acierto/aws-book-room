package com.acierto.awsbookroom.model;

import java.util.Date;

public class BookingsForDay {

    private Date day;

    private Booking booking;

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
