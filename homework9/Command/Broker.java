package Command;

import java.util.ArrayList;
import java.util.List;

// 创建命令调用类
public class Broker {
	private List<Order> orderList =  new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	
	public void placeOrders() {
		for(Order order : orderList) {
			order.execute();
		}
		orderList.clear();
	}

}
