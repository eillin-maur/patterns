package patterns.observer;

public class Observer implements Observable {
    private double attr;

    public Observer(Subject weatherSubject) {
        weatherSubject.registerObserver(this);
    }
    public void update(double attr) {
        this.attr = attr;
        System.out.println(this.attr);
    }
}
