package main.java.FlyBehaviors.impl;

import main.java.FlyBehaviors.FlyBehavior;

/**
 * Author: XLee
 * Date: 2021/8/12 19:20
 * Description:
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly...");
    }
}
