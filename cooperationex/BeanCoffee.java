package cooperationex;

public class BeanCoffee {

	int money;
	
	public String brewing(int money) {
		
		this.money+=money;
		if(money==Coffee.beanamericano) {
			return "��ٹ� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money==Coffee.beanlatte) {
			return "��ٹ� �󶼸� �����߽��ϴ�.";
		}
		else
			return null;
		
	}
}
