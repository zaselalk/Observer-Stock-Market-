/**
 * The Subject interface represents a subject in the Observer pattern.
 * It defines methods for registering, removing, and notifying observers.
 */
public interface Subject {
    /**
     * This method registers a new observer to the subject.
     *
     * @param observer the observer to be registered
     */
    void registerObserver(Observer observer);

    /**
     * This method removes an existing observer from the subject.
     *
     * @param observer the observer to be removed
     */
    void removeObserver(Observer observer);

    /**
     * This method notifies all registered observers about a change in the subject.
     */
    void notifyObservers();
}
