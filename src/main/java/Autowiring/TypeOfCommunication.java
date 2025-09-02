package Autowiring;

public class TypeOfCommunication {
	private Communication communication1;
	
	public void setCommunication(Communication communication1) {
		this.communication1=communication1;
	}
	public void present() {
		this.communication1.presentation();
	}
}
