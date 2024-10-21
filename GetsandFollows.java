import java.util.HashMap;
import java.util.Map;

public class GetsandFollows {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "there");
        map.put("c", "Yo");
        passingValues(map);
    }
    public static Map<String,String> passingValues(Map<String,String> stringMap){
        if(stringMap.containsKey("a") && !stringMap.containsKey("b")){
            stringMap.put("b",stringMap.get("a"));
        }
        if(stringMap.containsKey("b") && !stringMap.containsKey("a")){
            stringMap.put("a",stringMap.get("b"));
        }
        System.out.println(stringMap);
        return stringMap;
    }
}
