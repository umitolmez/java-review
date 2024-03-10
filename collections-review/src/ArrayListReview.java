import java.util.*;

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
        System.out.println("printing backward.....");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).previous());
        }

        //3. for each loop
        System.out.println("printing for each loop.....");
        for(Student student : students) System.out.println(student);

        //4. Lambda
        System.out.println("printing with lambda.....");
        students.forEach(student -> System.out.println(student));  //multipleparameter: (student, teacher -> ....

        //sorting elements in list
        System.out.println("Printing with sorted List by comp......");
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);

        Collections.sort(students, new sortByNameDesc());
        System.out.println(students);
    }

    static class sortByIdDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o2.id-o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2){
            return o1.name.compareToIgnoreCase(o2.name);
        }
    }
}
