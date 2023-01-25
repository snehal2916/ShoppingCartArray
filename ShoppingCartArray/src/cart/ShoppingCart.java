package cart;

public class ShoppingCart {
private Item[]cart;
private double totalprice;
private int storedItem;

public ShoppingCart() {        //constructor 
	cart = new Item[10];
}
public ShoppingCart(int cartsize) {      //constructor
	cart = new Item[cartsize];
}

public void addItem(Item input ) {
	if(storedItem <cart.length) {
	cart[storedItem] = input;
	storedItem++;
	}
	else {
		System.out.println("Shopping Cart is full ");
	}
		
}
public double calculateTotalPrice() { 
	for (int i=0;i<cart.length;i++) {
		totalprice += cart[1].getTotalprice();
		
	}
	return totalprice;
	
}
}
