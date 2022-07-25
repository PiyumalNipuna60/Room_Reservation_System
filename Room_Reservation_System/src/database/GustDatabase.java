package database;

import model.Guest;

import java.util.ArrayList;

public class GustDatabase {
    public static ArrayList<Guest> GuestTable = new ArrayList<>();

    static {
        GuestTable.add(
                new Guest("Nipuna", "199907502281", "0752563986", "nipuna@gmail.com", "Galle"));
        GuestTable.add(
                new Guest("kasun", "187907502281", "0782563986", "kasun@gmail.com", "Colombo"));
        GuestTable.add(
                new Guest("malindu", "132517502281", "0722563986", "malindu@gmail.com", "Matara"));
    }
}
