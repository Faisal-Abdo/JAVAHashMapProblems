import java.util.Map;
import java.util.HashMap;

public class EqualValues {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //map.put("a","Hi");
        map.put("b", "Hi");
        map.put("c", "Welcome");
        removeEquals(map);
    }

    public static void removeEquals(Map<String, String> stringMap) {
        if ((stringMap.containsKey("a") && stringMap.containsKey("b")) && (stringMap.get("a").equals(stringMap.get("b")))) {
            stringMap.remove("a");
            stringMap.remove("b");
        }

        System.out.println(stringMap);
    }
}
