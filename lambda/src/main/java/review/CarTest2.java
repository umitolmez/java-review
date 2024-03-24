package review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest2 {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

//        carList.add(new Car("Toyota",140,1998));
//        carList.add(new Car("Audi",200,2008));
//        carList.add(new Car("BMW",210,2020));
//        carList.add(new Car("Nissan",150,2018));

        carList.add(Car.builder().make("Toyota").topSpeed(140).year(1998).build());
        carList.add(Car.builder().make("Audi").topSpeed(200).year(2008).build());
        carList.add(Car.builder().make("BMW").topSpeed(210).year(2020).build());
        carList.add(Car.builder().make("Nissan").topSpeed(150).year(2018).build());

        List<Car> newCars = filterCars(carList, car -> car.getYear() > 2015);

        System.out.println(newCars);


    }

    private static List<Car> filterCars(List<Car> carList, Predicate<Car> predicate) {

        List<Car> result = new ArrayList<>();

        for (Car car : carList) {
            if(predicate.test(car)){
                result.add(car);
            }

        }

        return result;
    }
}
