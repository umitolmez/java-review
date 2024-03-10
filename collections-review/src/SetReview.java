import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
        Set<Student> mySet = new HashSet<>();

        //2. add an element
        mySet.add(new Student(7, "Name7"));
        mySet.add(new Student(8, "Name8"));
        mySet.add(new Student(9, "Name9"));
        mySet.add(new Student(9, "Name9")); //true

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));
        System.out.println(numSet);

        System.out.println("first repeating: " + firstRepeatingChar("java developer"));
    }

    public static Character firstRepeatingChar(String str){
        //create hashSet
        Set<Character> chars = new HashSet<>();

        //iteration return ch if add return false
        for(Character ch : str.toCharArray()) if(!chars.add(ch)) return ch;
        return null;
    }
}
