/**
 * 1���� �迭 �����ϱ�
 * @author rnsfhlqhrekrl
 *
 */
public class ArrayInit {
	
	public static void main(String[] args) {
		// �⺻ Ÿ���� �迭 ��� ��� 1 ����
		int[] a = null; // ����
		// ����
		a = new int[5];
		// �ʱ�ȭ
		a[0] = 2; a[1] = 5; a[2] = 3; a[3] = 9; a[4] = 8;
		
		// ��� 2 ���� ���� �ʱ�ȭ
		int[] b = new int[] { 2, 5, 3, 9, 8 };
		
		// ��� 3 ���� ���� �ʱ�ȭ
		int[] c = { 2, 5, 3, 9, 8 };
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		int[] d = a; // ������ ���� ����
		a[4] = 55; // a�� ���� ������Ű�� d�� ���� �ٲ��?
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(d[i] + "\t");
		}
		System.out.println();
		int[] e = new int[5];
		System.arraycopy(d, 0, e, 0, d.length); 
		// value assignment 0�� ����
		
		d[4] = 100; // d�� ���� ������Ű�� e�� ���� �ٲ��?
		for(int i = 0; i < e.length; i++) {
			System.out.print(e[i] + "\t");
		} // �ٲ��� ����
	}
}
