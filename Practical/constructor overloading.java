package Overload;

public class student {
	   int id;
		String name;
		int age;
	    student (int i,String n){
		id = i;
		name = n;
		}
		student(int i,String n,int a){
		id = i;
		name = n;
		age=a;
		}
		void display(){System.out.println(id+" "+name+" "+age);}
public static void main(String[] args) {
		student s1 = new student(20,"Alex");
		student s2 = new student(21,"Bill",50);
		s1.display();
		s2.display();
		
	}

}
