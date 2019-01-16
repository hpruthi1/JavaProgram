import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Employee2{
	String name, address;
	int joinYear;
	double salary;

	Employee2(){
		name = "Hardik";
		joinYear = 2016;
		address = "Bahadurgarh";
	}

	Employee2(String name, int joinYear,  String address){
		this.name=name;
		this.joinYear=joinYear;
		this.address=address;
	}

	void displayInfo(){
		System.out.printf("%10s %20s %30s", name, joinYear, address);
		System.out.println();
	}
}
public class EmployeeTest2{
	public static void main(String[] args){
	System.out.println("----------------------");
    System.out.printf("%10s %30s %20s", "Name", "Year of Joining", "Address");
    System.out.println("\n--------------------");
    Employee2 e1 = new Employee2();
    Employee2 e2 = new Employee2("Hardik", 2018, "Bahadurgarh");
    Employee2 e3 = new Employee2("Harshit", 2019, "Haridwar");
    Employee2 e4 = new Employee2("Himani", 2007, "Rohtak");
    Employee2 e5 = new Employee2("Hemanshu", 2014, "Gurgaon");
    e1.displayInfo();
    e2.displayInfo();
    e3.displayInfo();
    e4.displayInfo();
    e5.displayInfo();
	}
}