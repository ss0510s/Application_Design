package IO;

import java.io.*;

public class InputTest {
	public static void main(String[] args) throws IOException {
		int c;
		InputStream in = null;

		try {
			//wrapping
			in = 
				new LowerCaseInputStream( 
					new BufferedInputStream(
						new FileInputStream("test.txt")));

			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // try/catch 문이 종료된 후, 무조건 실행
			if (in != null) { in.close(); }
		}
		System.out.println();
		// try resource: try 구문이 끝나면 자원을 자동으로 해제
		// () -> 괄호 내의 부분은 try 구문 안에서만 사용한 뒤, 자동으로 메모리 삭제
		try (InputStream in2 = 
				new LowerCaseInputStream(
					new BufferedInputStream(
						new FileInputStream("test.txt"))))
		{
			while((c = in2.read()) >= 0) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
