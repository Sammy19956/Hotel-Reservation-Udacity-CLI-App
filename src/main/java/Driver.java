import Menu.MainMenu;
import api.CustomExceptions;
import model.*;

import java.util.ArrayList;
import java.util.Collection;

public class Driver {
    public static void main(String[] args) throws CustomExceptions {

        Collection<Room> rooms = new ArrayList<>();

//        Customer customer = new Customer("John", "Doe", "sasdfgmail.com");

        MainMenu.printMenu();

        Room freeRoom = new FreeRoom("101", 0.0, RoomType.SINGLE);

//        System.out.println(freeRoom.isFree());


    }

}

