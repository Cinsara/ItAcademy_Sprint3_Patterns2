package org.example.Interfaces;

public interface StockMarketObservable {
    void addObserver(StockMarketObserver observer);
    void removeObserver(StockMarketObserver observer);
    void notifyObservers(String stockStatus);
}
