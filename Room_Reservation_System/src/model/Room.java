package model;

public class Room {
    private String RoomId;
    private String RoomType;
    private double RoomPrice;
    private String Availability;

    public Room() {
    }

    public Room(String roomId, String roomType, double roomPrice, String availability) {
        RoomId = roomId;
        RoomType = roomType;
        RoomPrice = roomPrice;
        Availability = availability;
    }

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String roomId) {
        RoomId = roomId;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public double getRoomPrice() {
        return RoomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        RoomPrice = roomPrice;
    }

    public String getAvailability() {
        return Availability;
    }

    public void setAvailability(String availability) {
        Availability = availability;
    }

    @Override
    public String toString() {
        return "Room{" +
                "RoomId='" + RoomId + '\'' +
                ", RoomType='" + RoomType + '\'' +
                ", RoomPrice=" + RoomPrice +
                ", Availability='" + Availability + '\'' +
                '}';
    }
}

