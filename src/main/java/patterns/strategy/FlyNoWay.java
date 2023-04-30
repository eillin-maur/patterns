package patterns.strategy;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I am not fly!");
    }
}
