package org.example.Controller;

import org.example.Classes.Broker;
import org.example.Classes.StockAgency;

public class Controller {
    public static void start(){

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
    }
}
