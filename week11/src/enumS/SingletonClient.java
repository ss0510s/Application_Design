package enumS;

public class SingletonClient {
	public static void main(String[] args) {
		Singleton singleton = Singleton.UNIQUE_INSTANCE;
		System.out.println(singleton.getDescription());

		Fruits fruit = Fruits.APPLE;
		if(Fruits.APPLE == fruit) {
			System.out.println(Fruits.APPLE + " 냠냠~");
		}
	}
}
