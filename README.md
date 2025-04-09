# 🏛️ Design Patterns in Java

This repository contains Java implementations of two classic design patterns: **Builder** and **Observer**, following Gradle project structure.

## Patterns Implemented 🛠️

### 🍕 Level 1: Builder Pattern (Pizza Order System)
A flexible pizza ordering system demonstrating the Builder pattern.

#### Key Components:
- `Pizza` - The product class with size, dough, and toppings
- `PizzaBuilder` - Interface defining the construction steps
- `GreekPizza`, `ChicagoPizza` - Concrete builders
- `PizzaMaster` - Director class that orchestrates the building process

#### How to Run:
You only need to use start() in the main. This method is in the controller, that have this estructure:
        
        PizzaMaster pizzaMaster = new PizzaMaster();
        Pizza chicagoPizzaConstructor = pizzaMaster.makeChigagoPizza(new ChicagoPizza());
        System.out.println("Chicago Pizza: " + chicagoPizzaConstructor);

        Pizza greekPizzaConstructor = pizzaMaster.makeGreekPizza(new GreekPizza());
        System.out.println("Greek Pizza: " + greekPizzaConstructor);

        Pizza margheritaPizzaConstructor = pizzaMaster.makeMargheritaPizza(new MargheritaPizza());
        System.out.println("Margherita Pizza: " + margheritaPizzaConstructor);

        Pizza meatPizzaConstructor = pizzaMaster.makeMeatPizza(new MeatPizza());
        System.out.println("Meat Pizza: " + meatPizzaConstructor);

# 📈 Level 2: Observer Pattern (Stock Market System)

A stock market notification system demonstrating the Observer pattern.

#### Key Components:
- `StockMarketObservable` - Interface for the observable (Broker).
- `StockMarketObserver` - Interface for observers (Agencies).
- `Broker` - Concrete observable that tracks market changes.
- `StockAgency` - Concrete observers receiving updates.

#### How to Run:
You only need to use start() in the main. This method is in the controller, that have this estructure:

        Broker broker = new Broker();
        StockAgency stockAgencyFerman = new StockAgency("Ferman");
        StockAgency stockAgencyDamian = new StockAgency("Damian");
        StockAgency stockAgencyBlunder = new StockAgency("Blunder");

        broker.addObserver(stockAgencyFerman);
        broker.addObserver(stockAgencyDamian);
        broker.addObserver(stockAgencyBlunder);

        broker.setStockStatus("The stock market goes down.");
        broker.setStockStatus("The stock market goes up.");

        broker.removeObserver(stockAgencyDamian);
        broker.setStockStatus("The stock Agency Damian ceases its activity. " +
                "The stock market remains stable.");
