package dcl;

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5
//

public class Singleton {
	private volatile static Singleton uniqueInstance;
 
	private Singleton() {}

	// Double-checked
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) { // 처음만 동기화 -> 병목현상 방지
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	public void print() {
		System.out.println("Double-checked!");
	}
}
