package businesspartners;

import java.util.Comparator;

import addresses.Addressable;

public class CompareByZip implements Comparator<Addressable> {

	@Override
	public int compare(Addressable o1, Addressable o2) {
		return o1.getZip() - o2.getZip();
	}

}
