package example;
import java.util.function.Function;

public class Example3_2 {
	public static Integer len(String s) {
		return s.length();
	}
	
	public static void main(String[] args) {
		Function<String, Integer> func = Example3_2::len;
		int a = func.apply("Java");
		System.out.println("文字列「Java」は" + a + "文字です");
	}
}
