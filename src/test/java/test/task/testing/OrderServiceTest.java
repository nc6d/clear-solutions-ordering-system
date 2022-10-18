package test.task.testing;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import test.task.model.Dish;
import test.task.model.Order;
import test.task.model.enumeration.CuisineType;
import test.task.model.enumeration.DishType;
import test.task.preps.InitMenu;
import test.task.service.OrderService;

import java.util.List;

import static test.task.controller.Controller.menuService;

public class OrderServiceTest {

    @Test
    public void must_orderDishes_of_right_qty() {
        Order order = new Order();
        menuService = new InitMenu().init();

        List<Dish> courseDishes = menuService.getAllDishesBy(CuisineType.MEXICAN, DishType.DESSERT);
        List<Integer> orderList = List.of(0, 1, 2);
        orderList.forEach(dessert -> order.getDishes().add(courseDishes.get(dessert)));

        Assertions.assertEquals(order.getDishes().size(), orderList.size());

    }

    @Test
    public void must_proceed_even_if_drinks_not_ordered() {
        Order order = new Order();
        menuService = new InitMenu().init();
        OrderService orderService = new OrderService();

        List<Dish> courseDishes = menuService.getAllDishesBy(CuisineType.MEXICAN, DishType.DESSERT);
        List<Integer> orderList = List.of(0, 1, 2);
        orderList.forEach(dessert -> order.getDishes().add(courseDishes.get(dessert)));

        orderService.proceed(order);

        Assertions.assertEquals(order.getTotal(), orderList.size() * 6);

    }
}
