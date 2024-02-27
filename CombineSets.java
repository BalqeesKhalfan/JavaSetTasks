import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CombineSets {
    public static void main(String[] args){
        HashSet<Integer> unionSet = new HashSet<>();
        Set<Integer> setOne = new HashSet<>();
        setOne.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("Elements set one : " + setOne);
        Set<Integer> setTwo = new HashSet<>();
        setTwo.addAll(Arrays.asList(2,4,8,9));
        System.out.println("Elements set two : " + setTwo);
        Set<Integer> setThree = new HashSet<>();
        setThree.addAll(Arrays.asList(6,7,8,4));
        System.out.println("Elements set theree: " + setThree);
        //combine all elements of all sets
        unionSet.addAll(setOne);
        unionSet.addAll(setTwo);
        unionSet.addAll(setThree);

        // Print the unionSet containing all unique elements combined
        System.out.println("Union of sets: " + unionSet);

    }

}
