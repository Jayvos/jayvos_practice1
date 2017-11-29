public class Test {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();

		inventory.add_product(14.50, "v000001", 7);

		inventory.get_info("v000001");
	}
}