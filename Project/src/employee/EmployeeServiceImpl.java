package employee;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

	static List<Employee> team = new ArrayList<Employee>() {

			private static final long serialVersionUID = 1L;
			{
			add(new Employee(1, "Samuel", 5000, new Address("Longview", "TX")));
			add(new Employee(2, "David", 3500, new Address("Tyler", "TX")));
			}
	};

	public void displayAllEmployees() {
		for(Employee emp : team) {
			System.out.println(emp.toString());
		}
	}

	public double calculateYearlySalary(int id) {
		double Yearly = 0;
		for(Employee emp : team) {
			if(emp.getEmpNo() == id) {
				Yearly = emp.getSalary()*12;
			}
		}
		return Yearly;
	}

	public Employee findByEmployeeNo(int empNo) {
		return team.stream().filter(e -> e.getEmpNo() == empNo).findFirst().orElse(null);
	}

	public void updateEmployee() {
		System.out.println("Enter the employee ID of the employee that you wish to update:\n");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		int flag = 1;
		for(Employee emp : team) {
			if(emp.getEmpNo() == id) {
				flag = 0;
				int sw = 0;
				label:
				while(true) {
					System.out.println("\nEnter a number from the menu selection:\n"
							 + "1: Update the employee Name\n"
							 + "2: Update the employee Monthly Salary\n"
							 + "3: Update the employee Address\n"
							 + "4: Back to Main Menu\n");
					try {
						sw = s.nextInt();
						}catch(InputMismatchException e) {
							s.nextLine();
						}
				switch(sw) {
				case(1):
					System.out.println("You're currently updating " + emp.getEmpName() + "'s name\n");
					System.out.println("Enter the new name:\n");
					s.nextLine();
					String name = s.nextLine();
					emp.setEmpName(name);
					System.out.println("The employee's name is now set to: " + emp.getEmpName());
					break;
				case(2):
					System.out.println("You're currently updating " + emp.getEmpName() + "'s Salary\n"
							+ "It is currently set to: " + emp.getSalary());
					System.out.println("Enter the new Monthly Salary:\n");
					double salary = s.nextDouble();
					emp.setSalary(salary);
					System.out.println("The employee's Monthly Salary is now set to: " + emp.getSalary());
					break;	
				case(3):
					System.out.println("You're currently updating " + emp.getEmpName() + "'s Address\n"
							+ "It is currently set to: "+ emp.getAddress().getCity() +", " + emp.getAddress().getState());
					System.out.println("Enter the updated City you wish to update it to:\n");
					s.nextLine();
					String city = s.nextLine();
					System.out.println("Enter the updated State you wish to update it to:\n");
					String state = s.nextLine();
					emp.setAddress(new Address(city,state));
					System.out.println("The employee's Address is now set to: "
							+ emp.getAddress().getCity() +", " + emp.getAddress().getState());
					break;
				case(4):
					break label;
				default:
					System.out.println("Command not recognized, please enter 1-4");
				}
				}
			}
			
		}
		if(flag == 1) {
			System.out.println("There was no user with the id: " + id);
		}
		s.close();
	}
	
	public void deleteEmployee() {
		System.out.println("Enter the employee ID of the employee that you wish to delete:\n");
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		int flag = 1;
		for(Employee emp : team) {
			if(emp.getEmpNo() == id) {
				flag=0;
				System.out.println("Are you sure you want to delete employee:\n" + emp.toString() + "\nEnter Yes or No:");
				s.nextLine();
				String confirm = s.nextLine();
				System.out.println(confirm);
				if(confirm.toLowerCase().equals("yes")) {
					team.remove(emp);
					break;
				}else if(confirm.toLowerCase().equals("no")) {
					System.out.println("Returning you to main menu");
				}else {
					System.out.println("Command not recognized returning to main menu");
				}
				s.close();
				
			}
		}
		if(flag ==1) {
			System.out.println("There was no user with the id: " + id);
		}
	}
	
	@Override
	public void calculateYearlySalary(Employee e1) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Employee findByEmployeeNo(int empNo) {
		// TODO Auto-generated method stub
	}
	@Override
	public void updateEmployee(Employee e1) {
		// TODO Auto-generated method stub	
	}
	@Override
	public void deleteEmployee(Employee e1) {
		// TODO Auto-generated method stub	
	}
}