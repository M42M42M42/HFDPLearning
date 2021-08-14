package decorator.starbuzzcoffee.Decorators;

import decorator.starbuzzcoffee.Components.Beverage;

/**
 * Author: XLee
 * Date: 2021/8/14 19:26
 * Description:
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .10;
    }
}
