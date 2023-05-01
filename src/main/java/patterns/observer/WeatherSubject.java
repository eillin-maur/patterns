package patterns.observer;

import java.util.ArrayList;

public class WeatherSubject implements Subject {
    public ArrayList<Observer> observers;
    private double attr;

    public WeatherSubject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for (Observer observer: observers) {
            observer.update(attr);
        }
    }

    public void setAttr(double attr) {
        this.attr = attr;
        notifyObserver();
    }
}
