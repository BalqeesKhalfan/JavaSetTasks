import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ModifySet {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();
        setOne.addAll(Arrays.asList(1,2,3,4,5,6,7,11));
        setTwo.addAll(Arrays.asList(2,4,7,9,5,44));
        System.out.println("Element of First Set:"+setOne);
        System.out.println("Element of Second Set:"+setTwo);

        // Modify set1 to remove elements not found in set2
        modifySet(setOne, setTwo);

        // Print the modified set
        System.out.println("Modified setOne: " + setOne);

    }
    // Function to modify the first set by removing elements not found in the second set
    private static void modifySet(Set<Integer> setOne, Set<Integer> setTwo) {
        setOne.retainAll(setTwo);
    }

}
