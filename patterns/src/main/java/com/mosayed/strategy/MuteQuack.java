package com.mosayed.strategy;

/**
 * MuteQuack.
 *
 * @author : Mo Sayed
 * @since : 3/17/2023
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<Silence>>");
    }
}
