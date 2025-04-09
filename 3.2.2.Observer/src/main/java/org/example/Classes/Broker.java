package org.example.Classes;

import org.example.Interfaces.StockMarketObservable;
import org.example.Interfaces.StockMarketObserver;

import java.util.ArrayList;
import java.util.List;

public class Broker implements StockMarketObservable {

    private final List<StockMarketObserver> agencies = new ArrayList<>();

    @Override
    public void addObserver(StockMarketObserver observer) {
        agencies.add(observer);
    }

    @Override
    public void removeObserver(StockMarketObserver observer) {
        agencies.remove(observer);
    }

    @Override
    public void notifyObservers(String stockStatus) {
        for (StockMarketObserver observer : agencies) {
            observer.update(stockStatus);
        }
    }

    public void setStockStatus(String stockStatus) {
        System.out.printf("\nBroker: %s%n", stockStatus);
        notifyObservers(stockStatus);
    }
}
