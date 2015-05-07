package businesspartners;

import java.util.Comparator;

public class CompareBySpend implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		long diff = (o1.totalSpend - o2.totalSpend);
		if (diff > 0) return 1;
		if (diff < 0) return -1;
		return 0;
	}

}
