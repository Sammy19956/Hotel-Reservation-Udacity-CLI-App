package model;

import Enums.RoomType;

public interface IRoom {

    String getRoomNumber();
    Double getRoomPrice();
    RoomType getRoomType();
    boolean isFree();
}
