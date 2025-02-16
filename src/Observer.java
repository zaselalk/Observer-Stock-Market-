/**
 * The Observer interface represents an observer in the Observer pattern.
 * It defines the update method that is called when the subject notifies its observers of a change.
 */
public interface Observer {
    /**
     * This method is called when the subject needs to notify the updates for the observer.
     *
     * @param stockPrice the updated stock price
     */
    void update(double stockPrice);
}
