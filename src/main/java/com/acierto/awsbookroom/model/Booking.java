package com.acierto.awsbookroom.model;

import java.util.Date;

public final class Booking {
    private String room;
    private Date timeslotFrom;
    private Date timeslotTo;
    private Person owner;

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getTimeslotFrom() {
        return timeslotFrom;
    }

    public void setTimeslotFrom(Date timeslotFrom) {
        this.timeslotFrom = timeslotFrom;
    }

    public Date getTimeslotTo() {
        return timeslotTo;
    }

    public void setTimeslotTo(Date timeslotTo) {
        this.timeslotTo = timeslotTo;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
