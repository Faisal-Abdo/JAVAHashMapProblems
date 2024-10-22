import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class WordsCount {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b","b"));
        countingWords(stringArray);
    }

    public static Map<String, Integer> countingWords(ArrayList<String> wordsArray) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String a : wordsArray) {
            Integer count = 0;
            for (String b : wordsArray) {
                if (a.equals(b)) {
                    count++;
                }
            }
            countMap.put(a, count);
        }
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
        return countMap;
    }
}