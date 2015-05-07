package iterator;

public class TestCrudeList {

	public static void main(String[] args) {
		CrudeList<String> cls = new CrudeList<>();
		cls.add("Fred");
		cls.add("Jim");
		cls.add("Sheila");
		System.out.println(cls.toString());
	}

}
