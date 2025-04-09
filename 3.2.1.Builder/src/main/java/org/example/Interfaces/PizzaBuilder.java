package org.example.Interfaces;

import org.example.Classes.Pizza;
import org.example.Components.Dough;
import org.example.Components.Ingredients;
import org.example.Components.Size;

public interface PizzaBuilder {
    PizzaBuilder changeSize(Size size);
    PizzaBuilder changeDough(Dough dough);
    PizzaBuilder addToppings(Ingredients topping);
    Pizza getPizza();

}
