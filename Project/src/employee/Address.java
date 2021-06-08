package employee;

public class Address {

	String City;
	String State;
	
	public Address(String City, String State) {
		this.City = City;
		this.State = State;
	}
	
	public void setCity(String City) {
		this.City = City;
	}
	
	public String getCity() {
		return City;
	}
	
	public void State(String State) {
		this.State = State;
	}
	
	public String getState() {
		return State;
	}
	
	@Override
	public String toString() {
		return City + ", " + State;
	}
	
}
