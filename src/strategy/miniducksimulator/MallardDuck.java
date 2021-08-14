package strategy.miniducksimulator;


import strategy.miniducksimulator.FlyBehaviors.impl.FlyWithWings;
import strategy.miniducksimulator.QuackBehaviors.impl.Quack;

/**
 * Author: XLee
 * Date: 2021/8/12 19:27
 * Description:
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm a real Marrlard Duck!");
    }
}
