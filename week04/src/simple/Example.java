package simple;

public class Example {

    public static void main(String[] args) {
        // Subject 생성
        SimpleSubject simpleSubject = new SimpleSubject();
        // Observers 생성 & 구독
        SimpleObserver simpleObserver1 = new SimpleObserver(simpleSubject);
        SimpleObserver simpleObserver2 = new SimpleObserver(simpleSubject);
        SimpleObserver simpleObserver3 = new SimpleObserver(simpleSubject);

        // 값 업데이트 후 모든 observer 에게 알림
        simpleSubject.setValue(1);
        simpleSubject.setValue(2);
//        simpleObserver1.display();

        // 구독 해지
        simpleSubject.removeObserver(simpleObserver1);
        simpleSubject.removeObserver(simpleObserver2);
        simpleSubject.removeObserver(simpleObserver3);
    }
}
