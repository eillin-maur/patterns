package patterns.strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();

        mallardDuck.setBehavior(new FlyNoWay());
        mallardDuck.performFly();
    }
}
