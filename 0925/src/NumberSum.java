/**
 * 규칙이 있는 수의 홀수 합, 짝수 합 구하기
 * @author rnsfhlqhrekrl
 *
 */
public class NumberSum {
	
	public static void main(String[] args) {
		int toNum = 10;
		
		int sum = sumAn(toNum, 1, 2); // 등차수열
		System.out.println("등차수열 sum =" + sum);
		
		int sum2 = sumBn(toNum, 1, 2);
		System.out.println("등비수열 sum = " + sum2);
		
		int sum3 = sumCn(toNum, 2, 3, -2);
		System.out.println("점화식 sum = " + sum3);
	}
	
	public static int numAn(int start, int n, int d) {
		return (start + n * d);
	}
	
	public static int sumAn(int n, int start, int d) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("[" + numAn(start, i, d) + "]");
			sum += numAn(start, i, d);
		}
		return sum;
	}
	public static int numBn(int start, int n, int r) {
		int nums = 1;
		for(int i = 0; i < n; i++) {
			nums *= start * r;
		}
		return nums;
	}
	public static int sumBn(int n, int start, int r) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("[" + numBn(start, i, r) + "]");
			sum =+ numBn(start, i, r);
		}
		return sum;
	}
	public static int numCn(int n, int start, int a, int d) {
		// An + 1 = a * An + d 점화식
		for(int i = 0; i < n; i++) {
			start = a * start + d;
		}
		return start;
	}
	public static int sumCn(int n, int start, int a, int d) {
		int sum = 0;
		for(int i = 0; i < n; i++) {
			System.out.println("[" + numCn(i, start, a, d) + "]");
			sum =+ numCn(i, start, a, d);
		}
		return sum;
	}
}
