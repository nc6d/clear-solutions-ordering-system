package test.task.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import test.task.model.enumeration.CuisineType;
import test.task.model.enumeration.DishType;

@Getter
@Setter
public class Dish extends AbstractMeal {
    private DishType dishType;

    @Builder
    public Dish(String name, double price, CuisineType cuisine, DishType dishType) {
        super(name, price, cuisine);
        this.dishType = dishType;
        this.setPrice(price);
    }
}