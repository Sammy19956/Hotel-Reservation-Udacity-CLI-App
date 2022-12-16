package service;

import api.AdminResource;
import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;
import java.util.*;

public class ReservationService {
    static Collection<Reservation> reservations = new HashSet<>();
//    static Collection<Room>  availableRooms = new ArrayList<>();

    static Room foundRoom;
    public static void addRoom(Room room) {
        AdminResource.rooms.add(room);
    }

    public static Room getARoom(String roomNumber) {

        for(Room room: AdminResource.rooms) {
            if(room.getRoomNumber().equals(roomNumber)) {
                foundRoom = room;
            }
        }
        return foundRoom;
    }

    public static Reservation reserveARoom(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        Reservation reservation = new Reservation(customer, room, checkInDate.toString(), checkOutDate.toString());
        reservations.add(reservation);
        for(Room foundRoom2: AdminResource.rooms) {
            if(foundRoom2.getRoomNumber().equals(room.getRoomNumber())) {
                AdminResource.rooms.remove(foundRoom2);
            }
        }
        System.out.println("Reservation of " + reservation.getRoom().getRoomNumber() + " has been reserved successfully");
        return reservation;
    }

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        List<IRoom> reservedRooms = new ArrayList<>();
        for(Reservation reservation: reservations) {
           if(reservation.getCheckInDate().equals(checkInDate.toString()) && reservation.getCheckOutDate().equals(checkOutDate.toString())) {
               System.out.println(reservation.getRoom().getRoomNumber() + " is reserved");
                reservedRooms.add(reservation.getRoom());
           }
        }
        return reservedRooms;
    }

    public static Collection<Reservation> getCustomersReservation(Customer customer) {
        Collection<Reservation> customerReservations = new ArrayList<>();
        for(Reservation reservation: reservations) {
            if(reservation.customer.equals(customer)) {
                 customerReservations.add(reservation);
            }
        }
        return customerReservations;
    }

    public static void printAllReservation() {
        System.out.println(reservations);
    }
}
