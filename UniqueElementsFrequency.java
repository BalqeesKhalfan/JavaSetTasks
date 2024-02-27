import java.util.*;

public class UniqueElementsFrequency {
    public static List<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 1, 8, 3, 7, 2,1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 1,8,3,7, 2));
    public static Set<Integer> numbers = new HashSet<>(numbersList);

    public static void main(String[] args) {
        for (Integer x : numbers) {
            System.out.println(x + " has : " + occurrences(x) + " occurrences in list");
        }
    }

    public static Integer occurrences(Integer numberToFind) {
        int count = 0;
        for (Integer number : numbersList) {
            if (number.equals(numberToFind)) {
                count++;
            }
        }
        return count;
    }
    }