package simple;

import java.util.*;

public class SimpleSubject implements Subject {
    private List<Observer> observers; //observer 들을 저장할 리스트
    private int value = 0;

    public SimpleSubject() {
        // List <-(상속)- ArrayList
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    // 상태변화
    public void notifyObservers() {
        for (Observer observer : observers) { // 모든 observer에게
            observer.update(value); // observer에게 알림
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
