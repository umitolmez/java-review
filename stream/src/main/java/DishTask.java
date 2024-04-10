import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {
        System.out.println("Print all dish's name that has less than 400 calories");
        DishData.getALl().stream()
                .filter(dish -> dish.getCalories()<400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("Print the lenght of the name of each dish");
        DishData.getALl().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);


        System.out.println("Print three high caloric dish names (>300)");
        DishData.getALl().stream()
                .filter(dish -> dish.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Print all dish name that are below 400 calories in sorted");
        DishData.getALl().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(comparing(Dish::getCalories))   //Comparator.comparing asc
                .map(Dish::getName)
                .forEach(System.out::println);


    }
}
