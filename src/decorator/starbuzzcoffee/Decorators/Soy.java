package decorator.starbuzzcoffee.Decorators;

import decorator.starbuzzcoffee.Components.Beverage;

/**
 * Author: XLee
 * Date: 2021/8/14 19:24
 * Description:
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + .15;
    }
}
