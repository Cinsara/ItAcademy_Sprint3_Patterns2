package org.example.Classes;

import org.example.Components.Dough;
import org.example.Components.Ingredients;
import org.example.Components.Size;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private Size size;
    private Dough dough;
    private final List<Ingredients> ingredients;

    public Pizza(Size size, Dough dough, ArrayList<Ingredients> ingredients) {
            this.size = size;
            this.dough = dough;
            this.ingredients = ingredients;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void addTopping(Ingredients topping){
        this.ingredients.add(topping);
    }

    public void removeTopping(Ingredients topping){
        this.ingredients.remove(topping);
    }

    public String toString(){
        return "\n - Size: %s\n - Dough: %s\n - Toppings: %s".formatted(this.size, this.dough, this.ingredients);
    }
}
