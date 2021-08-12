package main.java;

import main.java.FlyBehaviors.FlyBehavior;
import main.java.QuackBehaviors.QuackBehavior;

/**
 * Author: XLee
 * Date: 2021/8/12 19:12
 * Description:
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim!");
    }
}
