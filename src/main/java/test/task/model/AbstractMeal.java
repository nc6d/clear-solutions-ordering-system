package test.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import test.task.model.enumeration.CuisineType;

@Data
@Getter
@AllArgsConstructor
public abstract class AbstractMeal {
    private String name;
    private double price;
    private CuisineType cuisine;


}
