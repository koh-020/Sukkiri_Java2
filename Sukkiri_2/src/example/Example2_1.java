package example;

public class Example2_1 {
//	printsメソッド
//	第1引数の文字列を第2引数の回数だけ表示
//	第1引数には文字列情報を、第2引数には整数を指定
	
	public static void prints(Object a, Object b) {
		for (int i = 0; i < (Integer)b; i++) {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Object s = "こんにちは";
		s = new Hero();
		Object n = 1;
		prints(s, n);
	}
}
