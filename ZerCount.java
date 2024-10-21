import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class ZerCount {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello", "Hi", "Mary"));
        countingWithZero(stringArray);
    }

    public static Map<String, Integer> countingWithZero(ArrayList<String> stringArrayList) {
        Map<String, Integer> stringMap = new HashMap<>();
        for (String str : stringArrayList) {
            stringMap.put(str, 0);
        }
        for (Map.Entry<String, Integer> entry : stringMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }

        return stringMap;
    }
}