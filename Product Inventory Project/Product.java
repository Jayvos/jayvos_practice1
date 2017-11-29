

public class Product {
	private double price;
	private String id;
	private int quantity;
	public Product next;

	Product(double price, String id, int quantity) {
		this.price = price;
		this.id = id;
		this.quantity = quantity;
		next = null;
	}

	double get_price() {
		return price;
	}

	String get_id() {
		return id;
	} 

	int get_quantity() {
		return quantity;
	}


}