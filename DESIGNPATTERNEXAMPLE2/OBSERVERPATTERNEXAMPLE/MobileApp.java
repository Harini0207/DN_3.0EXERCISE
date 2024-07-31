public class MobileApp implements Observer {
    @Override
    public void update(String stockName, double price, double value) {
        System.out.println("MobileApp: Stock " + stockName + " is now $" + price + " and value $" + value);
    }
}