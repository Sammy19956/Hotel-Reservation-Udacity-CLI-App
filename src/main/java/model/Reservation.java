package model;

public class Reservation {
    public Customer customer;
    public IRoom room;
    public String checkInDate;
    public String checkOutDate;

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", room=" + room +
                ", checkInDate='" + checkInDate + '\'' +
                ", checkOutDate='" + checkOutDate + '\'' +
                '}';
    }
}
