import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExploreSetUniqueness {
    public static void main(String[] args){
        Set<Integer> integerSet=new HashSet<>();// decleare set
        // add the elements to set
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);
        System.out.println("Set Elements before add the duplicat elements : "+integerSet);//print set elements

        // adding other elements
        Integer[] otherIntegers={2,4,4,6,6};
        integerSet.addAll(Arrays.asList(otherIntegers));
        System.out.println("Set Elements Affter  add the duplicat elements : "+integerSet);

    }
}
