package patterns.strategy;

public class Duck {
    FlyBehavior flyBehavior;

    public Duck() {

    }

    public void run() {
        System.out.println("I am run!");
    }

    public void display() {
        System.out.println("I am duck!");
    }

    public void performFly() {
        flyBehavior.fly();
    }
}

