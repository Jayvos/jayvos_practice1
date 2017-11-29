
public class Inventory {
	Product product;

	Inventory() {
		product = null;
	}

	void add_product(double price, String id, int quantity) {
		Product prev_product = product;
		product = new Product(price, id, quantity);
		product.next = prev_product;
	} 

	void get_info(String id) {
		Product traverse_node = product;

		while (traverse_node != null) {
			if (id.equals(traverse_node.get_id())) {
				System.out.printf("Info of product %s:\n",traverse_node.get_id());
				System.out.printf("\tPrice: %9.2f\n", traverse_node.get_price());
				System.out.printf("\tQuantity: %6d\n", (traverse_node.get_quantity()));
				break;
			}
		}
	}
}