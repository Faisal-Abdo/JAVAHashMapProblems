import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class GroupOfStrings {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("aa", "bb", "cc", "aAA", "cCC", "d"));
        groupingStrings(stringArray);
    }

    public static Map<String, String> groupingStrings(ArrayList<String> stringArr) {
        Map<String, String> groupingMap = new HashMap<>();
        String emptyStr = "";
        for (Integer i = 0; i < stringArr.size(); i++) {
            emptyStr = stringArr.get(i);
            Character firstChar = (stringArr.get(i)).charAt(0);
            for (Integer j = i + 1; j < stringArr.size(); j++) {
                Character secondChar = (stringArr.get(j)).charAt(0);
                if (firstChar.equals(secondChar)) {
                    emptyStr += stringArr.get(j);
                }
            }
            if (!groupingMap.containsKey(firstChar.toString())) {
                groupingMap.put(firstChar.toString(), emptyStr);
            }

        }
        for (Map.Entry<String, String> entry : groupingMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
        return groupingMap;
    }
}