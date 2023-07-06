package first;

public class TestDuck {
    public static void main(String[] args) {
        MallardDuck m1 = new MallardDuck();
        RedheadDuck rh1 = new RedheadDuck();
        RubberDuck rb1 = new RubberDuck();
        DecoyDuck d1 = new DecoyDuck();

        m1.fly();

        rh1.fly();
        rh1.quack();

        rb1.fly();
        rb1.quack();

        d1.display();
        d1.fly();
        d1.quack();
    }
}
