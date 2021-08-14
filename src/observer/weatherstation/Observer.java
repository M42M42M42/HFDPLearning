package observer.weatherstation;

/**
 * Author: XLee
 * Date: 2021/8/14 9:25
 * Description:
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}

