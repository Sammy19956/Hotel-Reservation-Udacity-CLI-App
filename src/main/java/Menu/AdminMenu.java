package Menu;

import api.AdminResource;
import api.CustomExceptions;
import service.CustomerService;
import service.ReservationService;
import service.utils;

import java.util.Scanner;
public class AdminMenu {

    public static void printAdminMenu() throws CustomExceptions {
        System.out.println("Welcome to the Admin Menu");
        System.out.println("Please select an option from the list below");
        System.out.println("1. See all customers");
        System.out.println("2. See all rooms");
        System.out.println("3. See all reservations");
        System.out.println("4. Add a room");
        System.out.println("5. Back to main menu");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println(CustomerService.getAllCustomers());
                utils.exitAdminMenu();
                break;

            case 2:
                System.out.println(AdminResource.getAllRooms());
                utils.exitAdminMenu();
                break;

            case 3:
                ReservationService.printAllReservation();
                utils.exitAdminMenu();
                break;
            case 4:
                AdminResource.addRoom();
                AdminMenu.printAdminMenu();
                break;
            case 5:
                MainMenu.printMenu();
                break;
            default:
                System.out.println("Invalid option");
                AdminMenu.printAdminMenu();
                break;
        }

    }
}
