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

    /*
    * The price of soy varies based upon the size of beverage.
    * */
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if(beverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if(beverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
}
