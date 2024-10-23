import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"
public class StringSwap {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<String> randomArr = new ArrayList<>();
        while (true) {
            System.out.print("Enter your desired String (enter exit to stop): ");
            String letters = obj.nextLine();
            if (letters.equals("exit")) {
                break;
            }
            randomArr.add(letters);
        }
        findMatchingStrings(randomArr);
    }

    public static void findMatchingStrings(ArrayList<String> stringArray) {
        Map<String, Character> trackerMap = new HashMap<>();
        ArrayList<String> newArray = new ArrayList<>(stringArray);
        Character currentChar;
        String swap;
        String currentString;
        String previousString;
        Integer currentCharSwap = 0;
        for (Integer i = 0; i < stringArray.size(); i++) {
            if (!trackerMap.containsKey(stringArray.get(i))) {
                trackerMap.put(stringArray.get(i), (stringArray.get(i)).charAt(0));
            }
            for (Integer j = i + 1; j < stringArray.size(); j++) {
                currentString = stringArray.get(j);
                currentChar = (stringArray.get(j)).charAt(0);
                if (trackerMap.containsValue(currentChar)) {
                    trackerMap.clear();
                    swap = stringArray.get(i);
                    previousString = currentString;
                    currentString = swap;
                    newArray.set(i,previousString);
                    newArray.set(j,currentString);
                    break;
                }
            }
        }
        System.out.println(newArray);
    }
}