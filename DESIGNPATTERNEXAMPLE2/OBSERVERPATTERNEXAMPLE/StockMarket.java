import java.util.ArrayList;
import java.util.List;
public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;
    private double value;

    public StockMarket(String stockName, double price, double value) {
        this.stockName = stockName;
        this.price = price;
        this.value = value;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public void setValue(double value) {
        this.value = value;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price, value);
        }
    }
}