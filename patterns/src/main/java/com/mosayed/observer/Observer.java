package com.mosayed.observer;

/**
 * Observer.
 *
 * @author : Mo Sayed
 * @since : 3/30/2023
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
