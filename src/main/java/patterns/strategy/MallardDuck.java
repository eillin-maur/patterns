package patterns.strategy;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
    }

    public void setBehavior(FlyBehavior behavior) {
        flyBehavior = behavior;
    }
}
