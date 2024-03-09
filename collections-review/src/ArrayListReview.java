import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListReview {

    public static void main(String[] args) {
        //create arraylist
        List<Student> students = new ArrayList<>(); //we can switch implementations for ex: LinkedList<>();

        //add elements
        students.add(new Student(1,"Jose"));
        students.add(new Student(2,"Sayed"));
        students.add(new Student(3,"Nick"));
        students.add(new Student(4,"Umit"));

        System.out.println(students);

        //iteration
        //1. For loop with get(index)
        for(int i=0; i<students.size(); i++){
            System.out.println(students.get(i));
        }

        //2 Iterator
        //forward iteration
        System.out.println("PRINTING WITH ITERATOR");

        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        //backward iteration
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }
    }
}
