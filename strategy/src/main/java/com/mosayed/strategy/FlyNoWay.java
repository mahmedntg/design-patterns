package com.mosayed.strategy;

/**
 * FlyNoWay.
 *
 * @author : Mo Sayed
 * @since : 3/17/2023
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
