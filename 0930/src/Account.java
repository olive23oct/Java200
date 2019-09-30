/**
 * 객체와 클래스 이해하기
 * @author rnsfhlqhrekrl
 *
 */
public class Account {
	
	private double money = 500;
	
	public Account (double money) {
		this.money = money;
	} // 생성자에 의한 초기화
	public Account() {
		
	} // default 생성자에 의한 초기화
	public double getMoney() {
		return money;
	} // 현재 잔금
	public void withdraw(double amount) {
		if((amount > 0)&&(money - amount >= 0)) {
			money -= amount;
		}
	} // 출금
	public void deposit(double amount) {
		if(amount > 0) {
			money += amount;
		}
	} // 입금
}
