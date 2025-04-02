package org.example.Controller;

import org.example.Classes.*;
import org.example.Director.PizzaMaster;
import org.example.Interfaces.PizzaBuilder;

import java.util.Arrays;

public class Controller {
    public static void start() {

        PizzaMaster pizzaMaster = new PizzaMaster();

        Pizza chicagoPizzaConstructor = pizzaMaster.makeChigagoPizza(new ChicagoPizza());
        System.out.println("Chicago Pizza: " + chicagoPizzaConstructor);

        Pizza greekPizzaConstructor = pizzaMaster.makeGreekPizza(new GreekPizza());
        System.out.println("Greek Pizza: " + greekPizzaConstructor);

        Pizza margheritaPizzaConstructor = pizzaMaster.makeMargheritaPizza(new MargheritaPizza());
        System.out.println("Margherita Pizza: " + margheritaPizzaConstructor);

        Pizza meatPizzaConstructor = pizzaMaster.makeMeatPizza(new MeatPizza());
        System.out.println("Meat Pizza: " + meatPizzaConstructor);
    }
}