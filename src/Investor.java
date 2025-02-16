public class Investor implements Observer {
    private final String name;
    private final double buyPrice;
    private final double sellPrice;

    /*
    * consturctor to intialize values
    * */
    Investor(String name, double buyPrice, double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }



    @Override
    public void update(double stockPrice) {
        if (stockPrice > sellPrice) {
            System.out.println("Investor " + name + " has been closed, Profit: $"+ (stockPrice - buyPrice));
        }
        else {
            System.out.println("Investor " + name + " has been opened");
        }
    }
}
