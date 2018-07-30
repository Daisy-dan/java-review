import java.io.*;

public class EmployeeTest{
	public static void main(String []args){
		Employee empOne = new Employee("张三");
		Employee empTwo = new Employee("李四");
	
		empOne.empAge(26);
		empOne.empDesignation("Teacher");
		empOne.empSalary(1000);
		empOne.printEmployee();

		empTwo.empAge(21);
		empTwo.empDesignation("student");
		empTwo.empSalary(000);
		empTwo.printEmployee();
	}
}

