package employee;

public class Employee {

	int empNo;
	String empName;
	double salary;
	Address address;
	
	public Employee(int empNo, String empName, double salary, Address address) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
		
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Double getSalary() {
		return salary;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Employee #: " + empNo + " Name: " + empName +
				" Salary: " + salary + " Address: " + address;				
	}
	
	
}
