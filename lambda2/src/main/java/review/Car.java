package review;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder

public class Car {

    private String make;
    private int topSpeed;
    private int year;


}
