import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class StringLength {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Hello", "Hi", "Mary"));
        returnStringLength(stringArray);
    }
    public static Map<String,Integer> returnStringLength(ArrayList<String> stringArr){
        Map<String,Integer> stringLength = new HashMap<>();
        for(String a:stringArr){
            stringLength.put(a,a.length());
        }
        for (Map.Entry<String, Integer> entry : stringLength.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
        return stringLength;
    }
}