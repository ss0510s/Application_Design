package second;

public class TestDuck {
    public static void main(String[] args) {
        MallardDuck m1 = new MallardDuck();
        RedheadDuck rh1 = new RedheadDuck();
        RubberDuck rb1 = new RubberDuck();
//        DecoyDuck d1 = new DecoyDuck();
        Duck d1 = new DecoyDuck();

        m1.display();
        m1.fly();
        m1.quack();

        rh1.display();
        rh1.fly();
        rh1.quack();

        rb1.display();
        rb1.quack();

        d1.display();
    }
}
