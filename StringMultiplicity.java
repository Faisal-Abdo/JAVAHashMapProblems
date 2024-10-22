import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class StringMultiplicity {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "c"));
        findMultiplicity(stringArray);
    }

    public static Map<String, Boolean> findMultiplicity(ArrayList<String> stringArr) {
        Map<String, Boolean> stringMap = new HashMap<>();
        for (String a : stringArr) {
            boolean flag = false;
            Integer count = 0;
            for (String b : stringArr) {
                if (a.equals(b)) {
                    count++;
                }
            }
            if (count > 1) {
                flag = true;
            }
            stringMap.put(a, flag);
        }
        for (Map.Entry<String, Boolean> entry : stringMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
        return stringMap;
    }
}