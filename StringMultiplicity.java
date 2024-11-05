import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class StringMultiplicity {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "c"));
        System.out.print(findMultiplicity(stringArray));
    }

    public static Map<String, Boolean> findMultiplicity(ArrayList<String> strings) {
        Map<String, Boolean> stringMap = new HashMap<>();
        for (String a : strings) {
            boolean isMultiple = false;
            Integer count = 0;
            for (String b : strings) {
                if (a.equals(b)) {
                    count++;
                }
            }
            if (count > 1) {
                isMultiple = true;
            }
            stringMap.put(a, isMultiple);
        }
        return stringMap;
    }
}
