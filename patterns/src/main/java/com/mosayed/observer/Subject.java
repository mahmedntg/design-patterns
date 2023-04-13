package com.mosayed.observer;

/**
 * Subject.
 *
 * @author : Mo Sayed
 * @since : 3/30/2023
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
