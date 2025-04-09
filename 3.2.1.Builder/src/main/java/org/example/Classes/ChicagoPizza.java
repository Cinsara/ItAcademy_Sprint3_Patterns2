package org.example.Classes;

import org.example.Components.Dough;
import org.example.Components.Ingredients;
import org.example.Components.Size;
import org.example.Interfaces.PizzaBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChicagoPizza implements PizzaBuilder {
    private final Pizza pizza;

    public ChicagoPizza() {
        this.pizza = new Pizza(
                Size.LARGE,
                Dough.THICK,
                new ArrayList<>(Arrays.asList(
                        Ingredients.MOZZARELLA,
                        Ingredients.TOMATO,
                        Ingredients.PEPPERONI,
                        Ingredients.MUSHROOMS,
                        Ingredients.SALAMI
                ))
        );
    }

    @Override
    public PizzaBuilder changeSize(Size size) {
        pizza.setSize(size);
        return this;
    }

    @Override
    public PizzaBuilder changeDough(Dough dough) {
        pizza.setDough(dough);
        return this;
    }

    @Override
    public PizzaBuilder addToppings(Ingredients ingredient) {
        if (!pizza.getIngredients().contains(ingredient)) {
            pizza.getIngredients().add(ingredient);
        }
        return this;
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}