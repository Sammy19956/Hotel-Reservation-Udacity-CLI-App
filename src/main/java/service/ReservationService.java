package service;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class ReservationService {


//    Collections collections = new Collections();

    public static void addRoom(IRoom room) {
    }

    public static IRoom getARoom(String roomId) {
        return null;
    }

    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        return null;
    }

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        return null;
    }

    public static Collection<Reservation> getCustomersReservation(Customer customer) {
        return null;
    }

    public static void printAllReservation() {
    }
}
