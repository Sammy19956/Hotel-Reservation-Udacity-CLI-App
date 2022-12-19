package api;

import model.*;

import java.util.Collection;
import java.util.Scanner;

public class AdminResource {
    public static Customer getCustomer(String email) {
        return null;
    }

    public static void addRoom() throws CustomExceptions {
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
        Room room = new Room(roomNumber, roomPrice, roomType);
        Room.roomList.add(room);
//        for (int i = 0; i < Room.roomList.size(); i++) {
//            if(Room.roomList.get(i).getRoomNumber().equals(room.getRoomNumber())){
//                throw new CustomExceptions("Room already exists");
//            } else{
//                Room.roomList.add(room);
//            }
//        }
        }

    public static Collection<Room> getAllRooms() {
      return Room.roomList;
    }

    public Collection<Customer> getAllCustomers() {
        return null;
    }

    public static void displayAllReservations() {
        System.out.println(Reservation.reservationList);
    }

}
