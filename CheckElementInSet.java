import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckElementInSet {
    public static void main(String[] args){
        Set<String> names=new HashSet<>();// decleare set
        // add the elements to set
        names.addAll(Arrays.asList("Balqees","Ali","Asma","Marwa"));
        System.out.println("Set : "+names);
        // Check if "John" is present in the Set
        if (names.contains("John")) {
            System.out.println("Found John");
        } else {
            System.out.println("John is not in the Set");
        }

    }
}
