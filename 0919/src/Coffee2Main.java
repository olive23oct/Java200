
public class Coffee2Main {
	
	public static void main(String[] args) {
		
		int myMoney1 = 800;
		int cups = Coffee2Main.coffee(myMoney1);
		Coffee2Main.printCoffee(cups);
				
		int myMoney2 = 150;
		int cups2 = coffee(myMoney2);
		printCoffee(cups2);

	}
	
	public static int coffee(int money) {
		int cups = 0;
		if(money > 0) {
			cups = money / 200;
		}else if(money == 0) {
			cups = 0;
		}else{
			cups = -1;
		}
		
		return cups;
	}
	
	public static void printCoffee(int cups) {
		if(cups > 0) {
			System.out.println("Ŀ��" + cups + "�� �Դϴ�.");
			
		}else{
			System.out.println("�׼��� ���ڶ��ϴ�");
		}
	}
}
