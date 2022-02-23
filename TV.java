package com.TV;

import java.util.Scanner;

public class TV {
	//TV properties
	String tvName;
	int mfgYear;
	int price;
	int screenSize;
	
	//actions
	void setDetails(String a,int b,int c,int d)
	{
	tvName = a;
	mfgYear = b;
	price = c;
	screenSize = d;
	}
	void allInfo()
	{
	System.out.println("Your search details are: ");
	System.out.println("TV model is:"+tvName);
	System.out.println("TV mfgYear is:"+mfgYear);
	System.out.println("TV price is:"+price);
	System.out.println("TV size is:"+screenSize+" inches");
	}

	public static void main(String[] args) {
		
		//need to give chance to end user 
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Flipkart app!!!");
		System.out.println("Please enter tv name");
		String a = sc.next();
		System.out.println("Please enter mfg year");
		int b = sc.nextInt();
		System.out.println("Please enter price");
		int c = sc.nextInt();
		System.out.println("Please enter screen size");
		int d = sc.nextInt();
		

//create object for tv class
		TV tv1 = new TV();
		tv1.setDetails(a, b, c, d);
		tv1.allInfo();
		
	}

}

