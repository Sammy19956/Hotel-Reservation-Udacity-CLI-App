package model;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Room implements IRoom {

    private final String roomNumber;
    private final Double price;
    private final RoomType roomType;
    private boolean isFree;

    public static final List<Room> roomList = new CopyOnWriteArrayList<>();

    public Room(String roomNumber, Double price, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
    }

    @Override
    public String getRoomNumber() {
        return this.roomNumber;
    }

    @Override
    public Double getRoomPrice() {
        return this.price;
    }

    @Override
    public RoomType getRoomType() {
        return this.roomType;
    }

    @Override
    public boolean isFree() {
        return this.isFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", roomType=" + roomType +
                '}';
    }
}
