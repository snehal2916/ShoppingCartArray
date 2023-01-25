package cart;

public class TestCart {
public static void main(String [] args) {
	Item pen = new Item ("cello" , 3 , 15);
	Item laptop = new Item ("dell" , 1 , 25000);
	Item mobile = new Item ("samsung" , 1, 15000);
	Item bottle = new Item ("milton" , 1 , 1200);
	Item bag = new Item ("nike" , 1 , 1250);
	
	ShoppingCart online = new ShoppingCart();
	online.addItem(pen);
	online.addItem(laptop);
	online.addItem(mobile);
	online.addItem(bottle);
	online.addItem(bag);
	
	
	System.out.println(online.calculateTotalPrice());
}
}
