import java.util.*;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = obj.nextLine();
        countCharacters(str);
    }

    public static void countCharacters(String word) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        Map<Character, Integer> vowelsMap = new TreeMap<>(); //Tree so the answer is sorted
        Map<Character, Integer> consonantsMap = new TreeMap<>();
        word = word.toLowerCase();
        char[] stringToCharArray = word.toCharArray();
        List<Character> alphabeticArray = new ArrayList<>();
        for (Character a : stringToCharArray) {
            if (Character.isAlphabetic(a)) { //excludes non-alphabetic characters
                alphabeticArray.add(a);
            }
        }
        Collections.sort(alphabeticArray);
        for (Character b : alphabeticArray) {
            Integer occurence = 0;
            for (Character c : alphabeticArray) {
                if (b.equals(c)) {
                    occurence++;
                }
            }
            if (vowels.contains(b)) {
                vowelsMap.put(b, occurence);
            } else {
                consonantsMap.put(b, occurence);
            }
        }
        System.out.println(vowelsMap);
        System.out.println(consonantsMap);
    }
}