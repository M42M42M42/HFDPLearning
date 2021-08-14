package decorator.starbuzzcoffee.Components;

/**
 * Author: XLee
 * Date: 2021/8/14 19:30
 * Description:
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast";
    }

    public double cost() {
        return .99;
    }
}
