package iterator;

import java.util.Iterator;

public class TestCrudeList {

	public static void main(String[] args) {
		CrudeList<String> cls = new CrudeList<>();
		cls.add("Fred");
		cls.add("Jim");
		cls.add("Sheila");
		System.out.println(cls.toString());
		
		for (String s : cls) {
			System.out.println("> " + s);
		}
		
		Iterator<String> i1 = cls.iterator();
		Iterator<String> i2 = cls.iterator();
		System.out.println("i1: " + i1.next());
		System.out.println("i2:                 " + i1.next());
		System.out.println("i2:                 " + i1.next());
		System.out.println("i1: " + i1.next());
		System.out.println("i1: " + i1.next());
		System.out.println("i2:                 " + i1.next());
		
	}

}
