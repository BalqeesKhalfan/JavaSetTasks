import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IntersectionTwoSets {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>();
        Set<Integer> setTwo = new HashSet<>();
        setOne.addAll(Arrays.asList(1,2,3,4,5,6,7,11));
        setTwo.addAll(Arrays.asList(2,4,7,9,5,44));
        System.out.println("Element of First Set:"+setOne);
        System.out.println("Element of Second Set:"+setTwo);

        ///find the intersection  of two sets
        Set<Integer> intersection = findIntersection(setOne, setTwo);

        System.out.println("intersection  of two sets is:"+intersection);

    }

    private static Set<Integer>findIntersection(Set<Integer> setOne, Set<Integer> setTwo){

        Set<Integer> intersection = new HashSet<>(setOne);
        intersection.retainAll(setTwo);
        return intersection;


    }

}
