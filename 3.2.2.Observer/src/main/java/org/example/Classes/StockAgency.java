package org.example.Classes;

import org.example.Interfaces.StockMarketObserver;

public class StockAgency implements StockMarketObserver {

    private final String name;

    public StockAgency(String name){
        this.name = name;
    }

    public void update(String stockStatus) {
        System.out.printf("%s received update: %s%n", name, stockStatus);
    }
}
