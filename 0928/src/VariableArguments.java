/**
 * Variable Arguments(...) 사용하기
 * 메서드의 아규먼트 
 * Java 5부터 추가
 * @author rnsfhlqhrekrl
 *
 */
public class VariableArguments {
	
	public static void main(String[] args) {
		print(2,3,4,5,6);
		int[] aa = { 5,4,1,3,12,0,7,3};
		print(aa);
		int a = 4;
		print(a); // 배열이 아니어도 가능
		String[] sNames = { "소철", "무궁화", "개나리", "철쭉"};
		print(sNames);
		print("동백");
		Flower flo = Flower.LILY;
		print(flo);
		print(Flower.values());
		String s = "Welcome to the Java Programming";
		// String[] ss = s.split(""); -> String[] 리턴
		print(s.split(""));
	}
	
	public static void print(int ... p) {
		for(int en : p) {
			System.out.printf("[%d]", en);
		}
		System.out.printf("%n");
	}
	
	public static void print(String ... p) {
		for(String en : p) {
			System.out.printf("[%s]",en);
		}
		System.out.printf("%n");
	}
	public static void print(Flower ... p) {
		for(Flower en : p) {
			System.out.printf("[%s]",en);
			// en.toString() --> en.name()
		}
		System.out.printf("%n");
		
	}
}
