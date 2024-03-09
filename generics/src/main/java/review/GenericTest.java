package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) throws Exception {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));
        teacherList.add(new Teacher("Adam", 103));

        //BEFORE GENERICS
        //printInfo(studentList);
        //printInfo(teacherList); //compiler error

        //AFTER GENERICS
        printInfos(studentList);
        printInfos(teacherList);

        System.out.println(getLastItem(studentList).getName());

        //USE MyUtils
        MyUtils<Student> obj1 = new MyUtils<>();
        obj1.printInfos(studentList);
        System.out.println(obj1.getLastItemName(studentList));

        MyUtils<Teacher> obj2 = new MyUtils<>();
        System.out.println(obj2.getLastItem(teacherList).getName());

        //How to limit Type
        MyUtils<String> stringObj= new MyUtils<>();

    }

    //write a method takes list of students, print each student and total count;
    public static void printInfo(List<Student> students ){
        for (Student student: students){
            System.out.println(student);
        }

        System.out.println("total count: " + students.size());
    }

    public static <T> void printInfos(List<T> list){
        for (T item: list){
            System.out.println(list);
        }

        System.out.println("total count: " + list.size());
    }

    //write a method that takes list and return last item of list
    public static <T> T getLastItem(List<T> list){
        return list.get(list.size()-1);
    }
}
