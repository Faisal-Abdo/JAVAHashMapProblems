import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OneTimeSwap {
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
        swappingOneTime(randomArr);
    }

    public static void swappingOneTime(ArrayList<String> stringArray) {
        Map<Character, Integer> trackerMap = new HashMap<>();
        Map<Character, Integer> trackOccurence = new HashMap<>();
        String swap;
        Integer count = 1;
        for (Integer i = 0; i < stringArray.size(); i++) {
            Character firstChar = (stringArray.get(i)).charAt(0);
            if (trackerMap.containsKey(firstChar)) {
                if (trackOccurence.get(firstChar) < 2) {
                    Integer indexToSwap = trackerMap.get(firstChar);
                    swap = stringArray.get(i);
                    stringArray.set(i, stringArray.get(indexToSwap));
                    stringArray.set(indexToSwap, swap);
                    trackOccurence.replace(firstChar, count++); //notice here
                    trackerMap.remove(firstChar);
                }
            } else {
                trackOccurence.put(firstChar, count);
                trackerMap.put(firstChar, i);
            }
        }
        System.out.println(stringArray);
    }
}
