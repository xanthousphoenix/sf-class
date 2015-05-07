package businesspartners;

import addresses.Addressable;

public class Customer implements Addressable {
	private String street;
	private String city;
	private int zip;
	
	@Override
	public String getStreet() {
		return street;
	}

	@Override
	public String getCity() {
		return city;
	}

	@Override
	public int getZip() {
		return zip;
	}

	@Override
	public String toString() {
		return "Customer [street=" + street + ", city=" + city + ", zip=" + zip
				+ "]";
	}

	public Customer(String street, String city, int zip) {
		super();
		this.street = street;
		this.city = city;
		this.zip = zip;
	}
}
