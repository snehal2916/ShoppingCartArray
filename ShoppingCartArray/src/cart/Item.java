package cart;

public class Item {
private String name;
private int quantity;
private double totalprice;


public Item(String name ,int quantity,double price ) {
	this.name = name;
	this.quantity = quantity;
	 totalprice = quantity* price;
	  
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getQuantity() {
	return quantity;
}


public void setQuantity(int quantity) {
	this.quantity = quantity;
}


public double getTotalprice() {
	return totalprice;
}


public void setTotalprice(double totalprice) {
	this.totalprice = totalprice;
}

}
