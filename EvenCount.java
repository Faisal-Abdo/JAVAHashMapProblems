import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class EvenCount {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "a", "d", "a", "a", "a", "b"));
        findEvenCount(stringArray);
    }

    public static Map<Character, String> findEvenCount(ArrayList<String> stringArr) {
        Map<Character, String> evenCountMap = new HashMap<>();
        for (String a : stringArr) {
            Integer count = 0;
            String storingString = "";
            for (String b : stringArr) {
                if (a.equals(b)) {
                    count++;
                    if (count % 2 == 0) {
                        storingString += a;
                        evenCountMap.put(a.charAt(0), storingString);
                    }
                }
            }
        }
        for (Map.Entry<Character, String> entry : evenCountMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
        return evenCountMap;
    }
}