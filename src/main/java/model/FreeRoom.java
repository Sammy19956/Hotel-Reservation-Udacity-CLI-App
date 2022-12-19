package model;

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
                "roomNumber='" + super.getRoomNumber() + '\'' +
                ", price=" + super.getRoomPrice() +
                ", roomType=" + super.getRoomType() +
                '}';
    }

}
