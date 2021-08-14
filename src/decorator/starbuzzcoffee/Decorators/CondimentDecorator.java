package decorator.starbuzzcoffee.Decorators;

import decorator.starbuzzcoffee.Components.Beverage;

/**
 * Author: XLee
 * Date: 2021/8/14 19:17
 * Description:
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
