package test.task.testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import test.task.model.Dish;
import test.task.model.Drink;
import test.task.model.enumeration.CuisineType;
import test.task.model.enumeration.DishType;
import test.task.service.MenuService;

import java.util.ArrayList;
import java.util.List;

public class MenuServiceTest {
    MenuService menuService = new MenuService();




    @Test
    public void must_addItem() {
        menuService.addItem(Drink.builder()
                .name("Test")
                .price(6)
                .cuisine(CuisineType.POLISH)
                .build());

        Assertions.assertFalse(menuService.getAllDrinksBy(CuisineType.POLISH).isEmpty());

    }

    @Test
    public void must_getAllDishesByCuisineAndCourse() {
        List<Dish> dishes = menuService.getAllDishesBy(CuisineType.MEXICAN, DishType.COURSE);
        dishes.forEach(dish -> Assertions.assertEquals(dish.getDishType(), DishType.COURSE));
        dishes.forEach(dish -> Assertions.assertEquals(dish.getCuisine(), CuisineType.MEXICAN));
    }

    @Test
    public void must_getAllDrinksByCuisine() {
        List<Drink> drinks = menuService.getAllDrinksBy(CuisineType.ITALIAN);
        drinks.forEach(drink -> Assertions.assertEquals(drink.getCuisine(), CuisineType.ITALIAN));
    }
}
