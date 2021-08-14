package strategy.miniducksimulator;


import strategy.miniducksimulator.FlyBehaviors.impl.FlyNoWay;
import strategy.miniducksimulator.QuackBehaviors.impl.Squeak;

/**
 * Author: XLee
 * Date: 2021/8/12 19:35
 * Description:
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a model duck!");
    }
}
