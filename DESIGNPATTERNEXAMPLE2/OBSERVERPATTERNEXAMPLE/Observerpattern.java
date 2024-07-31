public class Observerpattern {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket("TechCorp", 100.00, 100.00);

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        System.out.println("Changing stock price to $105.00");
        stockMarket.setPrice(105.00);
        stockMarket.setValue(117.00);

        System.out.println("\nChanging stock price to $110.00");
        stockMarket.setPrice(110.00);
        stockMarket.setValue(130.00);

        stockMarket.deregisterObserver(mobileApp);

        System.out.println("\nChanging stock price to $120.00");
        stockMarket.setPrice(120.00);
        stockMarket.setValue(140.00);
    }
}
