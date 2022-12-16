package service;

import api.AdminResource;
import model.Customer;
import model.IRoom;
import model.Reservation;
import model.Room;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReservationService {
    public static Collection<Reservation> reservations = new CopyOnWriteArrayList<>();
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
        for(Room foundRoom2: AdminResource.rooms) {
            if(foundRoom2.getRoomNumber().equals(room.getRoomNumber())) {
                ReservationService.reservations.add(reservation);
                AdminResource.rooms.remove(foundRoom2);
            }
        }
        System.out.println("Reservation of room " + reservation.getRoom().getRoomNumber() + " was successful");
        return reservation;
    }

    public static Collection<IRoom> findRooms(Date checkInDate, Date checkOutDate) {
        List<IRoom> reservedRooms = new ArrayList<>();
        for(Reservation reservation: ReservationService.reservations) {
           if(reservation.getCheckInDate().equals(checkInDate.toString()) && reservation.getCheckOutDate().equals(checkOutDate.toString())) {
               System.out.println(reservation.getRoom().getRoomNumber() + " is reserved");
                reservedRooms.add(reservation.getRoom());
           }
        }
        return reservedRooms;
    }

    public static Collection<Reservation> getCustomersReservations(Customer customer) {
        Collection<Reservation> customerReservations = new CopyOnWriteArrayList<>();
        for(Reservation reservation: reservations) {
            if(reservation.getCustomer().equals(customer)) {
                customerReservations.add(reservation);
            }
        }

        return customerReservations;
    }

    public static void printAllReservation() {
        System.out.println(reservations);
    }
}
