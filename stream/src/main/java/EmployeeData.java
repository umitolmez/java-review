import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@gmail.com", Arrays.asList("564749874","454876345466")),
                new Employee(101,"Umit","umit@gmail.com", Arrays.asList("5647429874","454876415466")),
                new Employee(102,"Peter","peter@gmail.com", Arrays.asList("5647149874","454876415466"))
        );
    }
}
