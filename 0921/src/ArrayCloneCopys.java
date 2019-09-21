/**
 *  clone을 이용한 배열 복사하기
 * @author rnsfhlqhrekrl
 *
 */
public class ArrayCloneCopys {
	
	public static void main(String[] args) {
		
		int[] a = {8,5,2,4,6,3,7,9};
		int[] b = {8,5,2,4,6,3,7,9};
		int[] c = a; //reference assignment copy
		int[] d = new int[b.length];
		System.arraycopy(b, 0, d, 0, b.length);
		// value assignment copy
		// clone을 지원하지 않으면 CloneNotSupportedException 발생
		int[] e = (int[])b.clone();
		/*
		 * 배열 b를 복사할 때 b.clone 메서드를 사용할 수 있다.
		 * b.clone 메서드는 멤버 메서드로 b의 배열을 얕은 복사(shallow copy) 하여
		 * Object로 리턴한다.
		 * 이때 필요한 타입은 1차원 배열이므로 캐스팅하여 (int[])b.clone()으로 사용한다.
		 */
		print(e);
		b[4] = -2;
		print(e);
		
		int[][] fa = {{4,5,6,7}, {6,7,8,9}};
		int[][] fb = (int[][])fa.clone();
		fa[0][0] = -1;
		print(fb); 
		// 1차원 배열 clone -> value assignment copy
		// 2차원 배열 clone -> reference assignment copy
		// 2차원 배열을 value assignment copy 시키기 위해서
		int[][] fc = new int[fa.length][fa[0].length];
		for(int i = 0; i < fa.length; i++) {
			fc[i] = (int[])fa[i].clone();
		}
		fa[0][0] = -5;
		print(fc); 
		print(fa);
		// fc는 fa의 변화에 영향을 받지 않는다
		// 2차원 배열의 clone은 참조에 의한 대입 복사이므로 배열 fa의 값을 바꾸면
		// 클론된 배열 fb는 영향을 받는다
		// 그러나 2차원 배열을 1차원 배열 단위로 클론하면 값에 의한 대입 복사가 된다
  	}
	public static void print(int[] p) {
		for(int i = 0; i < p.length; i++) {
			System.out.print("[" + p[i] + "]");
		} 
		System.out.println();
	}
	
	public static void print(int[][] p) {
		for(int i = 0; i < p.length; i++) {
			for(int j = 0; j < p[i].length; j++) {
				System.out.print("[" + p[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();
	}
}
