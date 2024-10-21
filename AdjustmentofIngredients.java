import java.util.HashMap;
import java.util.Map;

public class AdjustmentofIngredients {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("ice cream","sprinkles");
        map.put("spinach","rum");
        map.put("salad","sauce");
        adjustingElements(map);
    }
    public static Map<String,String> adjustingElements(Map<String,String> ingredients){
        if(ingredients.containsKey("ice cream")){
            ingredients.put("yogurt",ingredients.get("ice cream"));
        }
        if (ingredients.containsKey("spinach")) {
            ingredients.replace("spinach","nuts");
        }
        System.out.println(ingredients);
        return ingredients;
    }
}
