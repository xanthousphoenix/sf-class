package businesspartners;

import java.util.Arrays;
import java.util.List;

public class TestCustomers {

	public static void main(String[] args) {
		List<Customer> lc = Arrays.asList(
				new Customer("123 Acacia", "Warwick", 12345),
				new Customer("1 Market", "San Francisco", 94105),
				new Customer("37 Downtown Lane", "Hillsboro", 42971)
			);
		System.out.println("Unsorted: " + lc);
		lc.sort(new CompareByZip());
		System.out.println("  Sorted: " + lc);
		
	}

}
