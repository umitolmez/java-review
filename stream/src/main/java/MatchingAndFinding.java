import java.util.Optional;

public class MatchingAndFinding {

    public static void main(String[] args) {
        //ALL MATCH
        boolean isHealty = DishData.getALl().stream().allMatch(dish -> dish.getCalories()<1000);
        System.out.println(isHealty);

        //ANY MATCH
        if(DishData.getALl().stream().anyMatch(Dish::isVegetarian))
            System.out.println("The menu is vegetarian");

        //NONE MATCH
        boolean isHealty2 = DishData.getALl().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealty2);

        //FIND ANY
        Optional<Dish> dish = DishData.getALl().stream()
                .filter(Dish::isVegetarian)
                .findAny();

        System.out.println(dish.get());

        //FIND FIRST
        Optional<Dish> dish2 = DishData.getALl().stream()
                .filter(Dish::isVegetarian)
                .findFirst();

        System.out.println(dish2.get());
    }

}
