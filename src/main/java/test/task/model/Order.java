package test.task.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Order {
    List<Dish> dishes = new ArrayList<>();
    List<Drink> drinks = new ArrayList<>();
    double total;
}
