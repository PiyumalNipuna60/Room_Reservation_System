package database;

import model.Room;

import java.util.ArrayList;

public class RoomDataBase {
    public static ArrayList<Room> rooms=new ArrayList<>();

    static {
        rooms.add(
                new Room("001", "Single", 2500.00,"True")
        );
        rooms.add(
                new Room("002", "Double", 3500.00,"True")
        );
        rooms.add(
                new Room("003", "Triple", 4500.00,"True")
        );
        rooms.add(
                new Room("004", "Quad", 5500.00,"True")
        );
    }
}
