package strategy.miniducksimulator.FlyBehaviors.impl;

import strategy.miniducksimulator.FlyBehaviors.FlyBehavior;

/**
 * Author: XLee
 * Date: 2021/8/12 19:39
 * Description:
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
