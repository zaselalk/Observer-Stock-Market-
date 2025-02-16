import java.util.ArrayList;

/**
 * The Stock class represents a stock in the stock market.
 * It implements the Subject interface and notifies its observers when the stock price changes.
 */
public class Stock implements Subject {
    private final ArrayList<Observer> observers;
    private String stockName;
    private float price;

    /**
     * Constructor to initialize the Stock object with the given stock name and price.
     *
     * @param stockName the name of the stock
     * @param price     the initial price of the stock
     */
    Stock(String stockName, float price) {
        this.stockName = stockName;
        this.price = price;
        observers = new ArrayList<>();
    }

    /**
     * Getter method for the stock name.
     *
     * @return the name of the stock
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * Setter method for the stock name.
     *
     * @param stockName the new name of the stock
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    /**
     * Getter method for the current price of the stock.
     *
     * @return the current price of the stock
     */
    public float getPrice() {
        return price;
    }

    /**
     * Setter method for the stock price.
     * It also notifies all registered observers about the price change.
     *
     * @param price the new price of the stock
     */
    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }

    /**
     * This method adds a new observer to the observer list.
     *
     * @param observer the observer to be added
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * This method removes the given observer from the observer list.
     *
     * @param observer the observer to be removed
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * This method notifies all registered observers about the stock price change.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);
        }
    }
}
