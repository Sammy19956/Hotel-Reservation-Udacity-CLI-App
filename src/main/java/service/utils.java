package service;

import Menu.AdminMenu;
import Menu.MainMenu;
import api.CustomExceptions;

import java.util.Scanner;

public class utils {
    public static void exitAdminMenu() throws CustomExceptions {
        System.out.println("Enter 1 to go back to admin menu or 2 to exit");
        Scanner scanner = new Scanner(System.in);
        int option2 = scanner.nextInt();
        switch (option2) {
            case 1:
                AdminMenu.printAdminMenu();
                ;
                break;
            case 2:
                System.out.println("Exit Successful!!!");
                System.exit(0);
        }
    }

        public static void exitMainMenu() throws CustomExceptions {
        System.out.println("Enter 1 to go back to main menu or 2 to exit");
        Scanner scanner = new Scanner(System.in);
        int option2 = scanner.nextInt();
        switch (option2){
            case 1: MainMenu.printMenu();
                break;
            case 2: System.out.println("Exit Successful!!!");
                System.exit(0);
        }
    }
}
