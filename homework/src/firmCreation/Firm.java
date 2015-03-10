package firmCreation;

import java.util.ArrayList;

public class Firm {
	ArrayList<Employee> employees = new ArrayList<>();

	public void addEmployee(String firstName, String lastName) {
		employees.add(new Manager(firstName, lastName));
		employees.get(0).setBirthday(1990, 10, 10);
	}
//	 Manager empl = new Manager("Bender", "BlaBla");
//	 empl.setGend(Employee.Gender.MALE);
	// empl.setDept(Employee.Department.IT);
	// empl.setBirthday(1332,11,22);

}
