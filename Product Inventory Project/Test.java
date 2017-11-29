import java.util.concurrent.ThreadLocalRandom;

public class Test {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();

		for(int i = 0; i < 999999; i++) {
			String insert_string = String.format("v%06d", i+1);
			double insert_double = ThreadLocalRandom.current().nextDouble(1, 101);
			int insert_int = ThreadLocalRandom.current().nextInt(1, 1001);
			inventory.add_product(insert_double, insert_string, insert_int);
		}

		inventory.get_info("v000001");
		inventory.get_all();
		inventory.get_value();
		
	}
}