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
        Map<Character, Integer> trackerMap = new HashMap<>();
        String swap;
        for (Integer i = 0; i < stringArray.size(); i++) {
            Character firstChar = (stringArray.get(i)).charAt(0);
            if (trackerMap.containsKey(firstChar)) {
                Integer indexToSwap = trackerMap.get(firstChar);
                swap = stringArray.get(i);
                stringArray.set(i, stringArray.get(indexToSwap));
                stringArray.set(indexToSwap, swap);
                trackerMap.remove(firstChar);
            } else {
                trackerMap.put(firstChar, i);
            }
        }
        System.out.println(stringArray);
    }
}