package businesspartners;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class TestCustomers {

	public static void main(String[] args) {
		List<Customer> lc = Arrays.asList(
				new Customer("123 Acacia", "Warwick", 12345, 123),
				new Customer("1 Market", "San Francisco", 94105, 34),
				new Customer("37 Downtown Lane", "Hillsboro", 42971, 97)
			);
		System.out.println("     Unsorted: " + lc);
		lc.sort((Comparator<Customer>)comparatorByMethodResult("getZip", (Integer o1, Integer o2) -> o1 - o2));
//		lc.sort((Comparator<Customer>)comparatorByMethodResult("getStreet", (String o1, String o2) -> o1.compareTo(o2)));
		System.out.println("Sorted by zip: " + lc);
		System.out.println(lc.get(0).getAddressLabel());
	}
	
	public static <T, U> Comparator comparatorByMethodResult(String methodName, BiFunction<T, U, Integer> compareMethod) {
		return (o1,o2) -> {
			try {
				return compareMethod.apply((T)o1.getClass().getMethod(methodName).invoke(o1), (U)o2.getClass().getMethod(methodName).invoke(o2));
			} catch (Exception e) {
				e.printStackTrace();
				return 0;
			}
		};
	}

}
