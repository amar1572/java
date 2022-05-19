package constructor;
public class Employee {
	int empid;
	String empName;
	Employee(int id,String name){
		this.empid=id;
		this.empName=name;
	}
	void info(){
		System.out.println("Id:"+empid+ "Name:"+empName);
	}
public static void main(String[] args) {
		Employee obj1=new Employee(100,"Jack");
		Employee obj2=new Employee(109,"John");
		obj1.info();
		obj2.info();
		}
}
