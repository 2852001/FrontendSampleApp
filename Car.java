package com.audicar;

public class Car {
// car properties
String carModel;//fields
int mfgYear;
int carPrice;
// car action or behaviour
void start()//method
{
System.out.println("turn key right to start");	
}
void stop()
{
System.out.println("turn key left to stop");	
}
void setDetails(String a,int b,int c)
{
carModel = a;
mfgYear = b;
carPrice = c;
}
void allDetails()
{
System.out.println("car model is:"+carModel);
System.out.println("car mfgYear is:"+mfgYear);
System.out.println("car price is:"+carPrice);
}

	public static void main(String[] args) {
		// to execute actions we need to create object
		Car c = new Car();//object syntax in java
		c.start();
		c.stop();
		c.setDetails("audi xmodel", 2021, 6000000);
		c.allDetails();
	}//main method closing

}//class closing
