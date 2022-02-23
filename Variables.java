package com.datatypesandvariables;

public class Variables {
	int c = 30;    //global variable or non-static or instance
	static int d = 5;  //static variable
	void show()
	{
		int b = 20;  //local variable
		System.out.println(b);
		System.out.println(c);
	}

	public static void main(String[] args) {
		int a = 10;  //local variable
		System.out.println(a);
		System.out.println(d);
		Variables v = new Variables();
		v.show();
		System.out.println(v.c);
	}

}

