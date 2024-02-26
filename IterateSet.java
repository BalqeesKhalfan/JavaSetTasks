import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IterateSet {
    public static void main(String[] args){
        Set<String>  fruits=new HashSet<>();// decleare set
        // add the elements to set
        fruits.addAll(Arrays.asList("Banana","Apple","Cherry"));
          System.out.println("Set Elements:");
        // iterate all elements of set
        for(String fruit :fruits){
            System.out.println(fruit);

        }

    }
}
