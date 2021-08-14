package decorator.starbuzzcoffee.Components;

/**
 * Author: XLee
 * Date: 2021/8/14 19:16
 * Description:
 */
public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }
    Size size = Size.TALL;
    String description = "Unknown beverage";


    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
