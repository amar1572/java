package com;

// Parameter constructor
public class ConstructorEx1 {
	//instance variables
		int id; 
		String studentName; 
		double fees;
		
		public ConstructorEx1(int id,String studentName,double fees) {
			this.id=id;
			this.studentName=studentName;
			this.fees=fees;
		}
		
		//method to display values
		void display() {
			System.out.println(id + " " + studentName + " " + fees);
		}

	public static void main(String[] args) {
		// creating object for method invoke & passing project
		ConstructorEx1 c= new ConstructorEx1(105,"Amar",1178.90);
		c.display();   //display values with object


	}

}