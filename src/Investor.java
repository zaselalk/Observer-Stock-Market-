/**
 * The Investor class represents an investor who observes stock price changes.
 * It implements the Observer interface and updates its state based on stock price changes.
 */
public class Investor implements Observer {
    private final String name;
    private final double buyPrice;
    private final double sellPrice;

    /**
     * Constructor to initialize the Investor object with the given name, buy price, and sell price.
     *
     * @param name      the name of the investor
     * @param buyPrice  the price at which the investor buys the stock
     * @param sellPrice the price at which the investor sells the stock
     */
    Investor(String name, double buyPrice, double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    /**
     * This method is called when the stock price changes.
     * It updates the investor's state based on the new stock price.
     *
     * @param stockPrice the new stock price
     */
    @Override
    public void update(double stockPrice) {
        if (stockPrice > sellPrice) {
            System.out.println("Investor " + name + " has been closed, Profit: $" + (stockPrice - buyPrice));
        } else {
            System.out.println("Investor " + name + " has been opened");
        }
    }
}
