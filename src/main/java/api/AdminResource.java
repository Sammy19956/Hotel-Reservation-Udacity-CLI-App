package api;

import model.Customer;
import model.IRoom;
import model.Room;
import model.RoomType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class AdminResource {

    public static Collection <Room> rooms = new ArrayList<>();
    public static Customer getCustomer(String email) {
        return null;
    }

    public static Room addRoom() {
        System.out.println("Enter room number: ");

        Scanner scanner2 = new Scanner(System.in);
        String roomNumber = scanner2.nextLine();

        System.out.println("Enter room price: ");
        double roomPrice = scanner2.nextDouble();

        System.out.println("Enter room type: \n1. SINGLE \n2. DOUBLE");
        Scanner scanner3 = new Scanner(System.in);
        RoomType roomType = null;
        int roomOption = scanner3.nextInt();
        switch(roomOption){
            case 1:
                roomType = RoomType.SINGLE;
                break;
            case 2:
                roomType = RoomType.DOUBLE;
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        rooms.add(new Room(roomNumber, roomPrice, roomType));
        return new Room(roomNumber, roomPrice, roomType);
    }

    public static Collection<Room> getAllRooms() {
      return rooms;
    }

    public Collection<Customer> getAllCustomers() {
        return null;
    }

    public void displayAllReservations() {

    }

}
