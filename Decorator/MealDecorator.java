package Decorator;

public class MealDecorator extends Meal {

    protected Meal meal;

    public MealDecorator(Meal meal) {

        this.meal = meal;
    }

    void prepareMeal() {

        System.out.println("Przygotowuję nowy posiłek ");
    }


}
