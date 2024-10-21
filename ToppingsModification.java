import java.util.HashMap;
import java.util.Map;

public class ToppingsModification {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ice cream", "hot fudge");
        map.put("cake", "strawberry");
        updateToppings(map);
    }
    public static Map<String,String> updateToppings(Map<String,String> toppings){
        toppings.put("Bread","Butter");
        if(toppings.containsKey("ice cream")){
            toppings.replace("ice cream","cherry");
        }
        System.out.println(toppings);
        return toppings;
    }
}
