public class Customer extends User {
	
	private String name;
	Address address;
	
	public Customer(String name, Address address) {
	    this.name = name;
	    this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String updateName) {
		this.name = updateName;
	}

	@Override
	public String toString() {
		return "Customer [User Name : " + name + ", Address: " + address + "]";
	}
}