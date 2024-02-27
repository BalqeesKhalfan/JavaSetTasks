import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CloneHashSet {
    public static void main(String[] args){
        // Create the original HashSet
        Set<String> originalSet = new HashSet<>();
        originalSet.addAll(Arrays.asList("Asma","Ahmed","Ali","Hamed","Muna"));
        // Clone the original HashSet
        Set<String> clonedSet = new HashSet<>(originalSet);

        // Add a new element to the cloned HashSet
        clonedSet.add("Balqees");
        // Print both sets
        System.out.println("Original HashSet: " + originalSet);
        System.out.println("Shallow Copy HashSet: " + clonedSet);
    }
}
