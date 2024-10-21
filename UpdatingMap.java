import java.util.HashMap;
import java.util.Map;

public class UpdatingMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a","aaa");
        //map.put("b", "xyz");
        map.put("c", "ccc");
        map.put("d", "ddd");
        modifyB(map);
    }

    public static Map<String, String> modifyB(Map<String, String> randomMap) {
        randomMap.remove("c");
        if (randomMap.containsKey("a")) {
            randomMap.put("b", randomMap.get("a"));
        }
        System.out.println(randomMap);
        return randomMap;
    }
}