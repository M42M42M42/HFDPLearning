package decorator.starbuzzcoffee.Components;

/**
 * Author: XLee
 * Date: 2021/8/14 19:19
 * Description:
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "HouseBlend";
    }

    public double cost() {
        return .89;
    }
}
