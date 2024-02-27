import java.util.*;

public class UniqueElementsFrequency {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 1,8,3,7, 2);
        // Create a HashSet to store unique elements
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        // Print each unique number along with its occurrences
        printUniqueNumbersWithCount(numbers);
    }
    // Function to print each unique number along with its occurrences
    private static void printUniqueNumbersWithCount(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        for (Integer number : uniqueNumbers) {
            int occurrences = countOccurrences(numbers, number);
            System.out.println("Number: " + number + ", Occurrences: " + occurrences);
        }
    }
    // Helper function to count occurrences of each  a number in the list
    private static int countOccurrences(List<Integer> numbers, int target) {
        int count = 0;
        for (Integer number : numbers) {
            if (number == target) {
                count++;
            }
        }
        return count;
    }
}