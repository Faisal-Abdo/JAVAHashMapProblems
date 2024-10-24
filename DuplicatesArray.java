import java.util.*;

//2, 3, 4, 2, 5, 6, 4, 3, 7, 3
public class DuplicatesArray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        ArrayList<Integer> randomArr = new ArrayList<>();
        while (true) {
            System.out.print("Enter any number (enter -1 to stop): ");
            Integer numbers = obj.nextInt();
            if (numbers == -1) {
                break;
            }
            randomArr.add(numbers);
        }
        findDuplicatesInfo(randomArr);
    }

    public static void findDuplicatesInfo(List<Integer> integerArray) {
        Map<Integer, List<Integer>> mapsOfDuplicateLocationsList = new HashMap<>();
        for (int i = 0; i < integerArray.size(); i++) {
            Integer num = integerArray.get(i);
            List<Integer> duplicatesLocationsList = new ArrayList<>();
            if (!mapsOfDuplicateLocationsList.containsKey(num)) {
                for (int j = i + 1; j < integerArray.size(); j++) {
                    if (num - integerArray.get(j) == 0) {
                        duplicatesLocationsList.add(j);
                    }
                }
                if (duplicatesLocationsList.size() > 0) {
                    mapsOfDuplicateLocationsList.put(num, duplicatesLocationsList);
                }
            }
        }
        Integer sumOfDuplicates = 0;
        for (Map.Entry<Integer, List<Integer>> x : mapsOfDuplicateLocationsList.entrySet()) {
            System.out.println("Number: " + x.getKey() + " has "
                    + x.getValue().size() + " Duplicates at positions " + x.getValue());
            sumOfDuplicates += x.getKey();
        }
        System.out.println("Sum of duplicates: " + sumOfDuplicates);
    }
}
