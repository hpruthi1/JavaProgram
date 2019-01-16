class Employee{
	String fname, lname;
	double salary;
	Employee(){
		fname = "Hardik";
		lname = "Pruthi";
		salary = 150000;
	}
	Employee(String fname, String lname, double salary){
		this.fname=fname;
		this.lname=lname;
		this.salary=salary;
	}
	void yearlySalary(){
		double yearsal = 12*salary;
	}
	double raise(){
		double raisedsal;
		raisedsal = salary + (salary/10);
		return raisedsal; 
	}
	void displayInfo(){
		System.out.println("Name: " + fname + " " + lname);
		System.out.println("Salary: " + salary);
		System.out.println("Salary after raise: " + raise());
	}
}
public class EmployeeTest{
	public static void main(String[] args){
		Employee e1 = new Employee();
		Employee e2 = new Employee("Himani", "Hooda", 500000);
		e1.yearlySalary();
		e2.yearlySalary();
		e1.raise();
		e2.raise();
		e1.displayInfo();
		e2.displayInfo();
	}
}