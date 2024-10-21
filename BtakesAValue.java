import java.util.HashMap;
import java.util.Map;

public class BtakesAValue {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("b", "xyz");
        map.put("c", "ccc");
        modifyAandB(map);
    }

    public static Map<String, String> modifyAandB(Map<String, String> randomMap) {
        if (randomMap.containsKey("a")) {
            randomMap.put("b", randomMap.get("a"));
            randomMap.replace("a", "");
        }
        System.out.println(randomMap);
        return randomMap;
    }
}