package example;
import java.util.Optional;

public class Example2_14 {
//	文字列sを文字列cで挟んで装飾するメソッド
//	文字列sがnull又は長さ0の場合はnullを返す
//	戻り値は「nullの可能性がある」ことを示す為
//	単なるStringではなくOptional<String>とする
	
	public static Optional<String> decorate(String s, char c) {
		String r;
		if (s == null || s.length() == 0) {
			r = null;
		} else {
			r = c + s + c;
		}
		return Optional.ofNullable(r);
	}
	
	
	public static void main(String[] args) {
		Optional<String> s = decorate("", '*');
		System.out.println(s.orElse("nullの為処理できません"));
	}
	
}
