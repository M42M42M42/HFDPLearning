package decorator.starbuzzcoffee.Decorators;

import decorator.starbuzzcoffee.Components.Beverage;

/**
 * Author: XLee
 * Date: 2021/8/14 19:22
 * Description:
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
