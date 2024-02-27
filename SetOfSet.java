import java.util.HashSet;
import java.util.Set;

public class SetOfSet {

    public static  void main(String[] args){
        Set<Set<Integer>> setOfSets = new HashSet<>();

        // Create some HashSet<Integer> objects and add them to the setOfSets
        Set<Integer> setOne = new HashSet<>();
        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOfSets.add(setOne);
        Set<Integer> setTwo = new HashSet<>();
        setTwo.add(2);
        setTwo.add(3);
        setTwo.add(4);
        setOfSets.add(setTwo);
        Set<Integer> setThree = new HashSet<>();
        setThree.add(2);
        setThree.add(3);
        setThree.add(4);
        setOfSets.add(setThree);
        // Create a HashSet to store the unique integers
        Set<Integer> uniqueIntegers = new HashSet<>();
        for (Set<Integer> set : setOfSets) {
            uniqueIntegers.addAll(set);
        }
        System.out.println("Unique Integers : "+uniqueIntegers);
    }
}
