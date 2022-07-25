package database;

import model.Meal;

import java.util.ArrayList;

public class MealPkgDatabase {
    public static ArrayList<Meal> mealPkgTable=new ArrayList<>();

    static {
        mealPkgTable.add(new Meal("M001",2500.00,"Local Meals"));
        mealPkgTable.add(new Meal("M002",4500.00,"Chinese Meals"));
        mealPkgTable.add(new Meal("M003",8500.00,"French Meals"));
    }
}
