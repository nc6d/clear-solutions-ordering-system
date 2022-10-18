package test.task.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import test.task.model.enumeration.CuisineType;

@Getter
@Setter
public class Drink extends AbstractMeal {

    private boolean iceCubes;
    private boolean lemon;

    @Builder
    public Drink(String name, double price, CuisineType cuisine) {
        super(name, price, cuisine);
    }

    @Override
    public double getPrice() {

        double additionPrice = super.getPrice();
        if (iceCubes && lemon) additionPrice += 1;
        if (iceCubes) additionPrice += 0.5;
        if (lemon) additionPrice += 0.7;

        return additionPrice;
    }


}
