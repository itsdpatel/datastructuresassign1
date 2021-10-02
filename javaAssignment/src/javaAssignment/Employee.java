package javaAssignment;

public class Employee {
	
	int empno;
	String ename;
	float sal;

	public static void main(String[] args) {
		//Object Instantiation
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		
		//access the employee object properties using reference
//		System.out.println(emp.empno + " | " + emp.ename + " | " + emp.sal);
		
		//Changing state of object emp
		emp.empno = 203;
		emp.ename = "Jerry";
		emp.sal = 4772;
		
		//Changing state of object emp
		emp1.empno = 256;
		emp1.ename = "Jao";
		emp1.sal = 27732;
		
		//access the employee object properties using reference
		System.out.println(emp.empno + " | " + emp.ename + " | " + emp.sal);
		System.out.println(emp1.empno + " | " + emp1.ename + " | " + emp1.sal);
		

	}

}
