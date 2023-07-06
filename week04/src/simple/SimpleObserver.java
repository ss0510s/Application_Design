package simple;

public class SimpleObserver implements Observer {
    private int value;
    private Subject simpleSubject;

    //생성자
    public SimpleObserver(Subject simpleSubject) {
        // subject를 멤버 변수에 저장
        this.simpleSubject = simpleSubject;
        // subject에 해당 객체를 observer로 등록
        simpleSubject.registerObserver(this);
    }

    public void update(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}
