package setterInjection;

public class Employee {
	private int Id;
	private String name;
	private Address address;
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", address=" + address.getCity() + ","+ address.getCountry()+"]";
	}
	
	
	
}
