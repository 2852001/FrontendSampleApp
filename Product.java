package com.datatypesandvariables;

public class Product {
		int prodId;
		String prodName;
		static double price = 10000;
		void setData(int a, String b)
		{
			prodId = a;
			prodName = b;
		}
		
		void showInfo()
		{
			System.out.println("Product details:");
			System.out.println("Product id is: "+prodId);
			System.out.println("Product name is: "+prodName);
			System.out.println("Price value is : "+price);
		}
		
	public static void main(String[] args) {
		Product prod = new Product();
		prod.setData(123,"Realme");
		prod.showInfo();
		prod.setData(234,"LG");
		prod.showInfo();
		
		
	}

}

