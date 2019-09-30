
public class AccountInstanceMain {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account();
		Account acc2 = new Account(1000);
		Account acc3 = new Account(1000);
		
		System.out.println(acc2 == acc3);
		System.out.println(acc3.equals(acc3));
		
		// Accout 타입의 객체 생성
		// 키워드 new로 생성한 모든 객체는 고유하며, 각각의 객체는 레퍼런스로 구분
	}
}
