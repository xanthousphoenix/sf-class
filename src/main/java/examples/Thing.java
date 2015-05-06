package examples;

public class Thing {
	@MyAnnot(fruit="Banana") private String name;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@InvokeMe("one")
	public String configureThis(String s) {
		System.out.println("configureThis invoked with " + s);
		return "You said " + s;
	}

}
