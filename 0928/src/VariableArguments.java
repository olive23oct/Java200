/**
 * Variable Arguments(...) ����ϱ�
 * �޼����� �ƱԸ�Ʈ 
 * Java 5���� �߰�
 * @author rnsfhlqhrekrl
 *
 */
public class VariableArguments {
	
	public static void main(String[] args) {
		print(2,3,4,5,6);
		int[] aa = { 5,4,1,3,12,0,7,3};
		print(aa);
		int a = 4;
		print(a); // �迭�� �ƴϾ ����
		String[] sNames = { "��ö", "����ȭ", "������", "ö��"};
		print(sNames);
		print("����");
		Flower flo = Flower.LILY;
		print(flo);
		print(Flower.values());
		String s = "Welcome to the Java Programming";
		// String[] ss = s.split(""); -> String[] ����
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
