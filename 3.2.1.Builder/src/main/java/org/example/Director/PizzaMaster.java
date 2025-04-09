package org.example.Director;

import org.example.Classes.Pizza;
import org.example.Components.Dough;
import org.example.Components.Ingredients;
import org.example.Components.Size;
import org.example.Interfaces.PizzaBuilder;

import java.util.List;

public class PizzaMaster {
    private final PizzaBuilder pizzaBuilder;

    public PizzaMaster(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makePizza(Size size, Dough dough, Ingredients ingredients){
        this.pizzaBuilder.changeSize(size);
        this.pizzaBuilder.changeDough(dough);
        this.pizzaBuilder.addToppings(ingredients);
        return this.pizzaBuilder.getPizza();
    }
}
