package first;

public abstract class Duck {
    public void quack(){
        System.out.println("꽥꽥");
    }
    public void swim() {
        System.out.println("수영을 한다.");
    }
    abstract public void display();
    public void fly() {
        System.out.println("하늘을 난다~");
    }
}
