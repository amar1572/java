package com;

public class ArrayEx1 {
	
	//creating a method which is taking array as parameter
	public void display(int arr[]) {
		for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i] + " ");
			}
	}
			
	public static void main(String[] args) {
		ArrayEx1 a = new ArrayEx1(); //object creation for invoke method
		int arr[] = {2,4,5,8,5,7,3,2,9,6};  //declaration and initialization
		a.display(arr); //passing array to method
	}

}

