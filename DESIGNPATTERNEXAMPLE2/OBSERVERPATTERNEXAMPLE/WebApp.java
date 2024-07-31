public class WebApp implements Observer {
    @Override
    public void update(String stockName, double price, double value) {
        System.out.println("WebApp: Stock " + stockName + " is now $" + price + " and value $" + value);
    }
}