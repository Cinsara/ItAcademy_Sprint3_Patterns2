package org.example.Director;

import org.example.Classes.Pizza;
import org.example.Components.Dough;
import org.example.Components.Ingredients;
import org.example.Components.Size;
import org.example.Interfaces.PizzaBuilder;

import java.util.List;

public class PizzaMaster {

    public Pizza makeChigagoPizza(PizzaBuilder pizzaBuilder){
        return pizzaBuilder.changeSize(Size.LARGE)
                .changeDough(Dough.THICK)
                .addToppings(Ingredients.MOZZARELLA)
                .addToppings(Ingredients.TOMATO)
                .addToppings(Ingredients.PEPPERONI)
                .getPizza();
    }

    public Pizza makeGreekPizza(PizzaBuilder pizzaBuilder){
        return pizzaBuilder.changeSize(Size.SMALL)
                .changeDough(Dough.THIN)
                .addToppings(Ingredients.MOZZARELLA)
                .addToppings(Ingredients.TOMATO)
                .addToppings(Ingredients.OLIVES)
                .addToppings(Ingredients.PEPPERONI)
                .getPizza();
    }

    public Pizza makeMargheritaPizza(PizzaBuilder pizzaBuilder){
        return pizzaBuilder.changeSize(Size.MEDIUM)
                .changeDough(Dough.THIN)
                .addToppings(Ingredients.MOZZARELLA)
                .addToppings(Ingredients.TOMATO)
                .getPizza();
    }

    public Pizza makeMeatPizza(PizzaBuilder pizzaBuilder){
        return pizzaBuilder.changeSize(Size.LARGE)
                .changeDough(Dough.THICK)
                .addToppings(Ingredients.MOZZARELLA)
                .addToppings(Ingredients.TOMATO)
                .addToppings(Ingredients.PEPPERONI)
                .addToppings(Ingredients.HAM)
                .getPizza();
    }
}
