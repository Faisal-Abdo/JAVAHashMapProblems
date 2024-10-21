import java.util.Map;
import java.util.HashMap;

public class LengthyValues {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a","Hey");
        map.put("b","greetings");
        map.put("c","What up");
        modifyingMap(map);
    }

    public static Map<String, String> modifyingMap(Map<String, String> stringMap) {
        Integer lengthOfa = stringMap.get("a").length();
        Integer lengthOfb = stringMap.get("b").length();
        if (lengthOfa > lengthOfb) {
            stringMap.put("c", stringMap.get("a"));
        } else if (lengthOfa < lengthOfb) {
            stringMap.put("c", stringMap.get("b"));
        } else if (lengthOfa == lengthOfb) {
            stringMap.replace("a", "");
            stringMap.replace("b", "");
        }
        System.out.println(stringMap);
        return stringMap;
    }
}
