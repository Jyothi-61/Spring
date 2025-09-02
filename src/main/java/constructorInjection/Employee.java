package constructorInjection;

public class Employee {
	private int Id;
	private String name;
	private Address address;
	public Employee(int id, String name, Address address) {
		
		this.Id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", address=" + address.getCity() + ","+ address.getCountry()+"]";
	}
	
	
	
}
