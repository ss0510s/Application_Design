package second;

public class MallardDuck extends Duck implements Flayble, Quakable{

    @Override
    public void display() {
        System.out.println("청둥오리 룩");
    }

    @Override
    public void fly() {
        System.out.println("오리 하늘을 날다~");
    }

    @Override
    public void quack(){
        System.out.println("꽥꽥");
    }
}
