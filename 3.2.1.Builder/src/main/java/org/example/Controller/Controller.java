package org.example.Controller;

import org.example.Classes.*;
import org.example.Components.Dough;
import org.example.Components.Ingredients;
import org.example.Components.Size;
import org.example.Director.PizzaMaster;
import org.example.Interfaces.PizzaBuilder;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {
    public static void start() {
        PizzaBuilder meatPizzaBuilder = new MeatPizza();
        PizzaMaster pizzaMaster = new PizzaMaster(meatPizzaBuilder);

        Pizza meatPizzaCustom = pizzaMaster.makePizza(Size.LARGE, Dough.CLASSIC, Ingredients.OLIVES);

        meatPizzaCustom.addTopping(Ingredients.BASIL);
        meatPizzaCustom.addTopping(Ingredients.OREGANO);

        System.out.println("Your pizza is ready! Enjoy :)");
        System.out.println(meatPizzaCustom);

        PizzaBuilder greekPizzaBuilder = new GreekPizza();
        Pizza greekPizzaCustom = new PizzaMaster(greekPizzaBuilder)
                .makePizza(Size.SMALL, Dough.THIN, Ingredients.ONION);

        greekPizzaCustom.addTopping(Ingredients.OLIVE_OIL);

        System.out.println("\nYour second pizza is ready!");
        System.out.println(greekPizzaCustom);
    }
}