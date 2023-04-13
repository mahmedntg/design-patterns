package com.mosayed.strategy;

/**
 * MallardDuck.
 *
 * @author : Mo Sayed
 * @since : 3/17/2023
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
