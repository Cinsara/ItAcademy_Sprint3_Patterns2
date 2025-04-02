package org.example.Classes;

import org.example.Components.Dough;
import org.example.Components.Ingredients;
import org.example.Components.Size;
import org.example.Interfaces.PizzaBuilder;

import java.util.ArrayList;
import java.util.List;

public class GreekPizza implements PizzaBuilder {
    private Size size;
    private Dough dough;
    private final List<Ingredients> ingredients = new ArrayList<>();

    @Override
    public PizzaBuilder changeSize(Size size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder changeDough(Dough dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder addToppings(Ingredients ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    @Override
    public PizzaBuilder removeToppings(Ingredients ingredient){
        ingredients.remove(ingredient);
        return this;
    }

    @Override
    public Pizza getPizza() {
        return new Pizza(size,dough,new ArrayList<>(ingredients));
    }
}
