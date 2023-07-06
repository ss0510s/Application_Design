package classic;

public class SingletonClient {
	public static void main(String[] args) {
//		Singleton sig = new Singleton(); // 에러: 접근 제한
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		System.out.println(singleton.getDescription());
		Singleton singleton2 = Singleton.getInstance();
		System.out.println(singleton2); // singleton1과 singleton2의 메모리 번지가 같음
		System.out.println(singleton2.getDescription());

	}
}
