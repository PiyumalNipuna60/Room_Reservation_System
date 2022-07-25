package model;

public class ReservedRooms {
    private String Id;
    private String GuestId;
    private String RoomId;
    private String MealId;
    private String Date;

    public ReservedRooms() {
    }

    public ReservedRooms(String id, String guestId, String roomId, String mealId, String date) {
        Id = id;
        GuestId = guestId;
        RoomId = roomId;
        MealId = mealId;
        Date = date;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getGuestId() {
        return GuestId;
    }

    public void setGuestId(String guestId) {
        GuestId = guestId;
    }

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String roomId) {
        RoomId = roomId;
    }

    public String getMealId() {
        return MealId;
    }

    public void setMealId(String mealId) {
        MealId = mealId;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "ReservedRooms{" +
                "Id='" + Id + '\'' +
                ", GuestId='" + GuestId + '\'' +
                ", RoomId='" + RoomId + '\'' +
                ", MealId='" + MealId + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
