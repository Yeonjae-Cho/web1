package cooperationex;

public class StarCoffee {

	int money;
	
	public String brewing(int money) {
		
		this.money+=money;
		if(money==Coffee.staramericano) {
			return "�� �ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money==Coffee.starlatte) {
			return "�� �ٹ� �󶼸� �����߽��ϴ�.";
		}
		else
			return null;
		
	}
	
}
