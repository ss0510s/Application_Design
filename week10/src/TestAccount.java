class Job implements Runnable {
    Account account = new Account();
    @Override
    public void run() {
        while(account.balance > 0) {
//            int cash = (int)(Math.random() * 3 + 1) * 10000;
            int cash = 10000;
            account.withDraw(cash);
        }
    }
}

class Account {
    int balance = 20000;

    // 동기화 -> 하나의 쓰레드가 실행시 다른 쓰레드는 접근 불가능(대기)
    public synchronized void withDraw(int cash) {
        if(balance >= cash) {
            try{
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + " 인출 금액 : "+cash);
                Thread.sleep(1000);
                balance = balance - cash;
                System.out.println(t.getName() + " 잔고 : "+balance);
            }catch (Exception err) {
                throw new RuntimeException();
            }
        }
    }
}

public class TestAccount {
    public static void main(String[] args) {
        Job j = new Job();
        // 멀티쓰레드
        Thread daddy = new Thread(j);
        Thread mommy = new Thread(j);
        Thread me = new Thread(j);

        daddy.setName("마이클 조던");
        mommy.setName("오프라 윈프리");
        me.setName("김인하");

        // 쓰레드 간 경쟁적으로 사용될 수 있음
        daddy.start();
        mommy.start();
        me.start();
    }
}
