package patterns.observer;

public class ObserverSimulator {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        Observer observer = new Observer(weatherSubject);
        weatherSubject.setAttr(10.10);
    }
}
