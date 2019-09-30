
public class AccountMain {
	
	public static void main(String[] args) {
		
		Account acc1 = new Account(1000); //계좌생성
		acc1.deposit(3000); // 저축
		acc1.deposit(2000);
		acc1.withdraw(500);
		System.out.println(acc1.getMoney());
	}
}
