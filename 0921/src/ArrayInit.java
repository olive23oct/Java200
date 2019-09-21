/**
 * 1차원 배열 이해하기
 * @author rnsfhlqhrekrl
 *
 */
public class ArrayInit {
	
	public static void main(String[] args) {
		// 기본 타입의 배열 사용 방법 1 선언
		int[] a = null; // 선언
		// 정의
		a = new int[5];
		// 초기화
		a[0] = 2; a[1] = 5; a[2] = 3; a[3] = 9; a[4] = 8;
		
		// 방법 2 선언 정의 초기화
		int[] b = new int[] { 2, 5, 3, 9, 8 };
		
		// 방법 3 선언 정의 초기화
		int[] c = { 2, 5, 3, 9, 8 };
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
		
		int[] d = a; // 참조에 의한 대입
		a[4] = 55; // a의 값을 변동시키면 d의 값이 바뀔까?
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(d[i] + "\t");
		}
		System.out.println();
		int[] e = new int[5];
		System.arraycopy(d, 0, e, 0, d.length); 
		// value assignment 0은 숫자
		
		d[4] = 100; // d의 값을 변동시키면 e의 값이 바뀔까?
		for(int i = 0; i < e.length; i++) {
			System.out.print(e[i] + "\t");
		} // 바뀌지 않음
	}
}
