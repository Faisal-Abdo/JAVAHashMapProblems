import java.util.HashMap;
import java.util.Map;

public class ToppingShenanigans {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("potato", "mayonesse");
        map.put("salad", "soya sauce");
        map.put("spinach", "sauce");
        passingIngredients(map);
    }

    public static Map<String, String> passingIngredients(Map<String, String> ingredients) {
        if (ingredients.containsKey("potato")) {
            ingredients.put("fries", ingredients.get("potato"));
        }
        if (ingredients.containsKey("salad")) {
            ingredients.put("spinach", ingredients.get("salad"));
        }
        System.out.println(ingredients);
        return ingredients;
    }
}
