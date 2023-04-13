package com.mosayed.strategy;

/**
 * ModelDuck.
 *
 * @author : Mo Sayed
 * @since : 3/17/2023
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println(("I'm a model duck"));
    }
}
