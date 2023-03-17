import java.util.HashMap;

public class Calories {
    private HashMap<String, Integer> calories;

    public void addCaloriesItem(String food, Integer amount) {
        calories.put(food, amount);
    }

    public Object getCalories() {
        return calories.clone();
    }

}