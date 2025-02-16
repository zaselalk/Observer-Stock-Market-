import java.util.ArrayList;

public class Stock implements Subject {
    private final ArrayList<Observer> observers;
    private String stockName;
    private float price;

    Stock(String stockName, float price) {
        this.stockName = stockName;
        this.price = price;
        observers = new ArrayList<>();
    }

    /*
     * getter method for Stockname
     * @return String
     * */
    public String getStockName() {
        return stockName;
    }

    /*
     * Setter method for StockName
     * @return void
     * */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    /*
     * getter method for current price of the stock
     * @return float
     * */
    public float getPrice() {
        return price;
    }

    /*
     * Setter method for stock price
     * @return void
     * */
    public void setPrice(float price) {
        this.price = price;

        notifyObservers();
    }


    /*
     * This method add new observer to the observer list
     * */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /*
     * This method remove the given observer from the List
     * */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /*
     * This method notify all the registered observers
     *
     * */
    @Override
    public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(price);
            }
    }
}
