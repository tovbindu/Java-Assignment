package package1;
//TODO Auto-generated method stub
class Employee{
	int id;
	int salary;
	String firstname;
	String lastname;
Employee(int id, int s, String fn, String ln){
	this.id = id;
	salary = s;
	firstname = fn;
	lastname = ln;
	}
	int getID() {
		System.out.println("The id of the employee is "+id);
		return id;
	}
	String getFirstName(String fn) {
//		System.out.println("The firstname of the employee is "+firstname);
		return firstname;
	}
	String getLastName(String ln) {
//		System.out.println("The lastname of the employee is "+lastname);
		return lastname;
	}
  String getName() {
		String n = firstname.concat(lastname);
		System.out.println("The name of the employee is "+n);
		return n;
	}
	void setSalary(int s) {
		salary = s;
	}
	int getSalary() {
		System.out.println("The salary of the employee is "+salary);
		return salary;
	}
    int getAnnualSalary() {
    	return salary*12; 
    }
    int raiseSalary() {
    	return salary + salary*10/100;
    	    }
    public String toString() {
    	System.out.println("Employee[id=?,Name = Firstname Lastname,salary=?]: "+id+","+firstname+""+lastname+","+salary);
    	return id+firstname+lastname+salary;
    }
}

public class AssignmentEmployee1 {
	public static void main(String[] args) {
	Employee emp = new Employee(1001,2000,"Ashton ","Turner");
	int annsal;
	int newsal;
		
	 emp.getID();
//	 emp.getFirstName(null);
//	 emp.getLastName(null);
	 emp.getName();
	 emp.getSalary();
	 emp.toString();
	annsal = emp.getAnnualSalary();
	newsal = emp.raiseSalary();
	System.out.println("The annual salary of the employee is "+annsal);
	System.out.println("The raised salary of the employee is "+newsal);
	}

}
