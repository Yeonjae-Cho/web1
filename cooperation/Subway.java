package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	public void take(int money) { //����
		this.money+=money;
		passengerCount++;
	}
	
	public void showSubInfo() {
		System.out.println(lineNumber+"�� ����ö�� �°��� "+passengerCount+"���̰�, ������ "+money+"�Դϴ�.");
	}
}
