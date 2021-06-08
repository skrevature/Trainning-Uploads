package employee;

import java.util.Scanner;

public class UseEmployee {
	
	public static void main(String[] args) {
		EmployeeServiceImpl imp = new EmployeeServiceImpl();
		System.out.println("Welcome!");
		Scanner s = new Scanner(System.in);
		int sw = 0; 
		while(true) {
			System.out.println("\nEnter a number from the menu selection:\n"
					+ "1. Display all employees\n"
					+ "2. Update employee information\n"
					+ "3. Find by employeee number\n"
					+ "4. Calculate an employee's yearly salary\n"
					+ "5. Delete an employee from the system\n"
					+ "6. Quit the employee management system");
			sw = s.nextInt();
			switch(sw) {
			case(1):
				imp.displayAllEmployees();
				System.out.println();
				break;			
			case(2):
				imp.updateEmployee();
				break;	
			case(3):
				System.out.println("Enter the employee ID Number you wish to find:");
				int id = s.nextInt();
				System.out.println("The employee with ID number: " + id + " is : " + imp.findByEmployeeNo(id).toString());
				break;		
			case(4):
				System.out.println("Enter the employee ID for the employee that you're calculating their yearly salary for:");
				id = s.nextInt();
				double salary = imp.calculateYearlySalary(id);
				if(salary == -1) {
					System.out.println("Sorry there was no employee with the ID Number: " + id);
				}else {
					System.out.println("The salary for Employee: " + imp.findByEmployeeNo(id).getEmpName() + " is: " + salary +"$ per year");
				}
				break;
			case(5):
				imp.deleteEmployee();
				break;
			case(6):
				s.close();
				System.out.println("Goodbye.");
				System.exit(0);
			default:
				System.out.println("Please enter a valid command.");		
			}
		s.close();	
		}

	}
	
}