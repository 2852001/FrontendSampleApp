package com.constructordemo;

public class Constructor {
	Constructor() //default constructor
	{
		System.out.println("Hi");
	}
	
	Constructor(int a)  //Parameterized constructor
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(10);
	}

}

