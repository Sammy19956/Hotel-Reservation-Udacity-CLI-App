package api;

import model.Customer;
import model.IRoom;
import model.Reservation;

import java.util.Collection;
import java.util.Date;

public class HotelResource{

     public static Customer getCustomer(String email){
        return null;
     }

     public static void createACustomer(String email, String firstName, String lastName){

     }

     public static IRoom getRoom(String roomNumber){
        return null;
     }

     public Reservation bookARoom(String customerEmail, IRoom room, Date checkInDate, Date checkOutDate){
        return null;
     }

    public Collection<Reservation> getCustomersReservations(String customerEmail){
        return null;
    }

    public Collection<IRoom> findARoom(Date checkInDate, Date checkOutDate){
        return null;
    }
}
