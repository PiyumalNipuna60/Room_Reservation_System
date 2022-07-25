package model;

public class Meal {
    private String mealId;
    private Double mealCharge;
    private String mealType;

    public Meal() {
    }

    public Meal(String mealId, Double mealCharge, String mealType) {
        this.mealId = mealId;
        this.mealCharge = mealCharge;
        this.mealType = mealType;
    }

    public String getMealId() {
        return mealId;
    }

    public void setMealId(String mealId) {
        this.mealId = mealId;
    }

    public Double getMealCharge() {
        return mealCharge;
    }

    public void setMealCharge(Double mealCharge) {
        this.mealCharge = mealCharge;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "mealId='" + mealId + '\'' +
                ", mealCharge=" + mealCharge +
                ", mealType='" + mealType + '\'' +
                '}';
    }
}
