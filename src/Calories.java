import java.util.HashMap;

public class Calories {
    private HashMap<String, Integer> calories;
    private int norm;
    private double activity;
    public void addCaloriesItem(String food, Integer amount) {
        calories.put(food, amount);
    }//per 100g

     public int getCalories(String key) {
        return calories.get(key);
    }
    public int getTotal(int... calories) {
        int total = 0;
        for(int cals: calories) {
            total += cals;
        }
        return total;
    }
    public int calcNorm(String sex, int weight, int height, int age, double activity) {
        double norm = 0;
        if(sex == "female") {
            norm = ((10 * weight) + (6.25 * height) - (5 * age) - 161) * activity;
        } else {
            norm = ((10 * weight) + (6.25 * height) - (5 * age) + 5) * activity;
        }
        this.norm = (int) norm;
        return (int) norm;
    }
}