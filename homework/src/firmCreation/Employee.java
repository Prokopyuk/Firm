package firmCreation;


import java.time.LocalDate;
import java.time.Period;

abstract public class Employee {

	private String firstName;
	private String lastName;
	public enum Gender{MALE, FEMALE};
	private Gender gend;
	private LocalDate birthday; 
	private int rate;
	private double salaryAccount;
	private double salary;
	public int vactionDaysAmount;
	private LocalDate lastVacationLocalDate;
	private LocalDate hireDay;
	public enum Department{IT, STAFF};
	private Department dept;
	
	
	public Employee(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Employee(String firstName, String lastName,LocalDate birthday,int rate,double salary, LocalDate hireDay){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.rate = rate;
		this.salary = salary;
		this.hireDay = hireDay;

	}
	
	
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public Gender getGend() {
		return gend;
	}
	public void setGend(Gender gend) {
		this.gend = gend;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(int year, int month,int day) {
		
		   birthday = LocalDate.of(year, month, day);
		   
	}
	
	
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	
	public double getSalaryAccount() {
		
		return salaryAccount;
	}
	public void setSalaryAccount(double salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public int getVactionDaysAmount() {
		return vactionDaysAmount;
	}
	public void setVactionDaysAmount(int vactionDaysAmount) {
		
		
		this.vactionDaysAmount = vactionDaysAmount;
	}
	
	
	public LocalDate getLastVacationLocalDate() {
		
		
		return lastVacationLocalDate;
	}
	public void setLastVacationLocalDate(LocalDate lastVacationLocalDate) {
		this.lastVacationLocalDate = lastVacationLocalDate;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public void setHireDay(int year, int month,int day) {
		
		hireDay = LocalDate.of(year, month, day);
		
	}
	
	public void calcVacation() {
		LocalDate today = LocalDate.now();
		Period period = Period.between(hireDay, today);
		if (period.getMonths() >= 6) {
			vactionDaysAmount += 2;
		}

	}


	    
}
