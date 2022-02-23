package com.lgtv;

public class Lgtv {
//Lgtv properties
	
	String tvModel;
	int mfgYear;
	int price;
	String screenSize;
	void setDetails(String a,int b,int c,String d)
	{
		tvModel = a;
		mfgYear = b;
		price = c;
		screenSize = d;
	}
	void allInfo()
	{
		System.out.println("tv model is:"+tvModel);
	    System.out.print("tv mfgYear is:"+mfgYear);
	    System.out.print("tv price is:"+price);
	    System.out.print("tv size is:"+screenSize);
    }
	
	public static void main(String[] args) {
		// to execute action we need to create object
		        Lgtv obj = new Lgtv();//object syntax in java
		        obj.setDetails("lg full HD",2022,55000,"55 inches");
		        obj.allInfo();
		        
	}//main method closing

}//class closing
