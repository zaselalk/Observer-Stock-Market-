
public interface Observer {
    /*
    * This method called when the subject need to notify the updates for observer
    * @params souble stockPrice
    * @return void
    * */
    void update(double stockPrice);
}
