import java.util.HashMap;

public class Calories {
    private HashMap<String, Integer> calories;

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
}