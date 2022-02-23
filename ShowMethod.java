//4  4.can we call one non-static mtd from other static mtd
// Ans:No
package com.methods;

public class ShowMethod {

	static void Show()
	{
	System.out.println("Hi");
	display();
	}
	static void display()//static method
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		 ShowMethod.Show();
		 

	}

}

