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
                System.out.println("Find and reserve a room");
                break;
            case 2:
                System.out.println("See my reservations");
                break;
            case 3:
                System.out.println("Create an account");
                break;
            case 4:
                AdminMenu.printAdminMenu();
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

    }
}
