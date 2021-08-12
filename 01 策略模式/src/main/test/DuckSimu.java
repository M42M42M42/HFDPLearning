package main.test;

import main.java.Duck;
import main.java.FlyBehaviors.impl.FlyRocketPowered;
import main.java.MallardDuck;
import main.java.ModelDuck;

/**
 * Author: XLee
 * Date: 2021/8/12 19:25
 * Description:
 */
public class DuckSimu {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("");

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        System.out.println("");

        model.setFlyBehavior(new FlyRocketPowered());
        System.out.println("----After set fly behavior----");
        model.performFly();
    }
}
