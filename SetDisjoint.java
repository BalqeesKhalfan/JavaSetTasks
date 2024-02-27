import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDisjoint {
    public static void main(String[] args) {
        Set<String> setOne = new HashSet<>();
        Set<String> setTwo = new HashSet<>();
        setOne.addAll(Arrays.asList("Apple","Orange","Grapes"));
        setTwo.addAll(Arrays.asList("Banana","Strawberry","Cherry"));
        System.out.println("Element of First Set:"+setOne);
        System.out.println("Element of Second Set:"+setTwo);

        // Check if the sets are disjoint
        boolean isDisjoint = Collections.disjoint(setOne, setTwo);

        // Print the result
        if (isDisjoint) {
            System.out.println("Disjoint");
        } else {
            System.out.println("Not Disjoint");
        }



    }

}
