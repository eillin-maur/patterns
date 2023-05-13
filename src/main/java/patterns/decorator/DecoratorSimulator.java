package patterns.decorator;

public class DecoratorSimulator {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", $" + beverage.cost());

        Beverage beverage_milk = new Milk(beverage);
        System.out.println(beverage_milk.getDescription() + ", $" + beverage_milk.cost());
    }
}
