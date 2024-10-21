import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class FirstLastChar {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello", "Mary"));
        pairingCharacters(stringArray);
    }

    public static Map<String, String> pairingCharacters(ArrayList<String> stringArray) {
        Map<String, String> firstAndLast = new HashMap<>();
        for (String str : stringArray) {
            Character first = str.charAt(0);
            Character last = str.charAt(str.length() - 1);
            firstAndLast.put(first.toString(), last.toString());
        }
        for (Map.Entry<String, String> entry : firstAndLast.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
        return firstAndLast;
    }
}