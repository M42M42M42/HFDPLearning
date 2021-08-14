package decorator.starbuzzcoffee.Components;

/**
 * Author: XLee
 * Date: 2021/8/14 19:18
 * Description:
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
