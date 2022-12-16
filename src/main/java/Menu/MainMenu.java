package Menu;

import model.Customer;
import model.Room;
import service.ReservationService;
import service.utils;
import service.CustomerService;
import java.util.Date;
import java.util.Scanner;

public class MainMenu {

    public static void printMenu() {
        System.out.println("Welcome to the Hotel Reservation System");
        System.out.println("Please select an option from the list below");
        System.out.println("1. Find and reserve a room");
        System.out.println("2. See my reservations");
        System.out.println("3. Create an account");
        System.out.println("4. Admin");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter the room number you want to reserve");
                Scanner scanner1 = new Scanner(System.in);
                String roomNumber = scanner1.nextLine();
                System.out.println("Enter your email");
                String email = scanner1.nextLine();
                Customer customer = CustomerService.getCustomer(email);
                Room foundRoom = ReservationService.getARoom(roomNumber);
                System.out.println(foundRoom);
                if(foundRoom != null) {
                    ReservationService.reserveARoom(customer, foundRoom, new Date(), new Date());
                    utils.exitMainMenu();
                }else{
                    System.out.println("Room not available");
                    utils.exitMainMenu();
                }
                break;
            case 2:
                System.out.println("Enter you email ");
                Scanner scanner3 = new Scanner(System.in);
                String email2 = scanner3.nextLine();
                Customer foundCustomer = CustomerService.getCustomer(email2);
                if(foundCustomer != null){
                    System.out.println("Your reservations are: " + ReservationService.getCustomersReservations(foundCustomer));
                utils.exitMainMenu();

                } else{
                    System.out.println("Customer not found");
                    utils.exitMainMenu();
                }
                break;

            case 3:
                System.out.println("Create an account");
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Enter your first name: ");
                String firstName = scanner2.nextLine();
                System.out.println("Enter your last name: ");
                String lastName = scanner2.nextLine();
                System.out.println("Enter your email: ");
                String email3 = scanner2.nextLine();
                CustomerService.addCustomer(firstName, lastName, email3);
                System.out.println("Account created successfully");
                utils.exitMainMenu();
                break;

            case 4:
                AdminMenu.printAdminMenu();
                break;
            case 5:
                System.out.println("Exit Successful!!!");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
}
}
