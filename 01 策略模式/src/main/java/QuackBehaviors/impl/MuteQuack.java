package main.java.QuackBehaviors.impl;

import main.java.QuackBehaviors.QuackBehavior;

/**
 * Author: XLee
 * Date: 2021/8/12 19:23
 * Description:
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<<SILENCE>>");
    }
}
