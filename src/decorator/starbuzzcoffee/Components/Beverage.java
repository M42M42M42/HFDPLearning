package decorator.starbuzzcoffee.Components;

/**
 * Author: XLee
 * Date: 2021/8/14 19:16
 * Description:
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
