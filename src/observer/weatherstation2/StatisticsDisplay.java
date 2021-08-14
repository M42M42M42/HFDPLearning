package observer.weatherstation2;

import java.util.Observable;
import java.util.Observer;

/**
 * Author: XLee
 * Date: 2021/8/14 10:15
 * Description:
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("Current statistics: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure");
    }
}
