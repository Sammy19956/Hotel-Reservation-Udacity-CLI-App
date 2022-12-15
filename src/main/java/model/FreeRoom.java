package model;

import Enums.RoomType;

public class FreeRoom extends Room {

    public FreeRoom(String roomNumber, Double roomPrice, RoomType enumeration) {
        super(roomNumber, 0.0, enumeration);
    }

    @Override
    public boolean isFree() {
        return true;
    }

    @Override
    public String toString() {
        return "FreeRoom{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", roomType=" + roomType +
                '}';
    }

}
