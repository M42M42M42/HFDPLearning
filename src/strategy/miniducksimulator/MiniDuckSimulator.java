package strategy.miniducksimulator;


import strategy.miniducksimulator.FlyBehaviors.impl.FlyRocketPowered;

/**
 * Author: XLee
 * Date: 2021/8/12 19:25
 * Description:
 */
public class MiniDuckSimulator {
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
