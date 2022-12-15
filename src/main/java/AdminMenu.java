import java.util.Scanner;

public class AdminMenu {

    public static void printAdminMenu() {
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
                System.out.println("See all customers");
                break;
            case 2:
                System.out.println("See all rooms");
                break;
            case 3:
                System.out.println("See all reservations");
                break;
            case 4:
                System.out.println("Add a room");
                break;
            case 5:
                System.out.println("Back to main menu");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
