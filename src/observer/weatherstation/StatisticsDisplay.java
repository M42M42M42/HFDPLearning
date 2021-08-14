package observer.weatherstation;

/**
 * Author: XLee
 * Date: 2021/8/14 9:44
 * Description:
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current statistics: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure");
    }


}
