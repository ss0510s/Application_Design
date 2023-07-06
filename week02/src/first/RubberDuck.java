package first;

public class RubberDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("squeak!");
    }
    @Override
    public void display() {
        System.out.println("rubber yellow duck");
    }

    @Override
    public  void fly() {
        //do nothing
    }
}
