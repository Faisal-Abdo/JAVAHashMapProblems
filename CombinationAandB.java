import java.util.HashMap;
import java.util.Map;

public class CombinationAandB {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "Hi");
        map.put("b", "there");
        combineAandB(map);
    }
    public static Map<String,String> combineAandB(Map<String, String> combination){
        if(combination.containsKey("a") &&  combination.containsKey("b")){
            combination.put("ab",combination.get("a")+combination.get("b"));
        }
        System.out.println(combination);
        return combination;
    }
}
