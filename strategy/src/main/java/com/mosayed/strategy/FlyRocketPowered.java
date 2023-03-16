package com.mosayed.strategy;

/**
 * FlyRocketPowered.
 *
 * @author : Mo Sayed
 * @since : 3/17/2023
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
