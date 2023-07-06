package first;

public class DecoyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("wooden duck");
    }

    @Override
    public void fly(){
        //do nothing
    }

    @Override
    public void quack(){
        //do nothing
    }
}
