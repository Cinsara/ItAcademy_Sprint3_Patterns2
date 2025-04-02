package org.example.Classes;

import org.example.Interfaces.StockMarketObservable;
import org.example.Interfaces.StockMarketObserver;

import java.util.ArrayList;
import java.util.List;

public class Broker implements StockMarketObservable {

    private final List<StockMarketObserver> observers = new ArrayList<>();

    @Override
    public void addObserver(StockMarketObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockMarketObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String stockStatus) {
        for (StockMarketObserver observer : observers) {
            observer.update(stockStatus);
        }
    }

    public void setStockStatus(String stockStatus) {
        System.out.printf("\nBroker: %s%n", stockStatus);
        notifyObservers(stockStatus);
    }
}
