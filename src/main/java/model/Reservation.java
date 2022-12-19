package model;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Reservation {
    public  Customer customer;
    public  IRoom room;
    public  String checkInDate;
    public  String checkOutDate;
    public static List<Reservation> reservationList = new CopyOnWriteArrayList<>();


    public Reservation(Customer customer, IRoom room, String checkInDate, String checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public Customer getCustomer() {
        return customer;
    }
    public IRoom getRoom() {
        return room;
    }
    public String getCheckInDate() {
        return checkInDate;
    }
    public String getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer.toString() +
                ", room=" + room.toString() +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }
}
