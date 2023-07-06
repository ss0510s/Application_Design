package second;

public class RedheadDuck extends Duck implements Flayble, Quakable{

    @Override
    public void display() {
        System.out.println("아메리칸 흰죽지 룩");
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
