import java.util.HashSet;
import java.util.Set;

public class ClearSet {
    public static void main(String[] args){
        Set<Integer> integerSet=new HashSet<>();// decleare set
        // add the elements to set
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(5);
        System.out.println("Set Elements before clear all elements : "+integerSet);//print set elements

        integerSet.clear();//to remove all elements on set

        if(integerSet.isEmpty()){
            System.out.println("Set is Empty");
        }
        else {
            System.out.println("Set is not Empty :  "+integerSet);
        }
    }
}
