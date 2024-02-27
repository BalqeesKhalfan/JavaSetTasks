import java.util.HashSet;
import java.util.Set;

public class RemoveElementFromIntegerSet {
    public static void main(String[] args){
        Set<Integer> integerSet=new HashSet<>();// decleare set
        // add the elements to set
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);

        System.out.println("Set Elements before remove 3 : "+integerSet);//print set elements
        integerSet.remove(3);
        System.out.println("Set Elements after remove 3 : "+integerSet);//print set elements
    }
}
