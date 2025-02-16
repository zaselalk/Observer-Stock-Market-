//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create a stock
        Stock stock = new Stock("TechLanka", 23.2F);

        // create investors
        Investor investor1 = new Investor("Saman",20.2,25.4);
        Investor investor2 = new Investor("Sunil",16.5,19.4);
        Investor investor3 = new Investor("Chamar",25.3,28.4);

        // register
        stock.registerObserver(investor1);
        stock.registerObserver(investor2);
        stock.registerObserver(investor3);

        // price change simulate
        stock.setPrice(20);
        stock.setPrice(13);

    }
}