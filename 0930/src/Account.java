/**
 * ��ü�� Ŭ���� �����ϱ�
 * @author rnsfhlqhrekrl
 *
 */
public class Account {
	
	private double money = 500;
	
	public Account (double money) {
		this.money = money;
	} // �����ڿ� ���� �ʱ�ȭ
	public Account() {
		
	} // default �����ڿ� ���� �ʱ�ȭ
	public double getMoney() {
		return money;
	} // ���� �ܱ�
	public void withdraw(double amount) {
		if((amount > 0)&&(money - amount >= 0)) {
			money -= amount;
		}
	} // ���
	public void deposit(double amount) {
		if(amount > 0) {
			money += amount;
		}
	} // �Ա�
}
