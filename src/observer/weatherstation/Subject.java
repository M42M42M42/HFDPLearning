package observer.weatherstation;

/**
 * Author: XLee
 * Date: 2021/8/14 9:23
 * Description:
 */
public interface Subject {
    void registerObserver(Observer o);
    void removerObserver(Observer o);
    void notifyObservers();
}
