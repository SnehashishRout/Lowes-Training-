package com.inheritance;

// Multilevel Inheritance

interface Advanced{
	public void special(int x, int y);
}

interface Opera extends Advanced{
	
	public void sum(int x, int y);
	public void mul(int x, int y);
	
}

 class Calci implements Opera{
	
	public void sum(int x, int y)
	{
		System.out.println("Sum = " + (x + y));
	}
	
	public void mul(int x, int y)
	{
		System.out.println("Multiply = " + x*y);
	}

	@Override
	public void special(int x, int y) {
		// TODO Auto-generated method stub
		int z = x + (y*x - y)*x;
		System.out.println("Special Prod = " + z);
	}
}
 
public class Multilevel {
	public static void main(String[] args) {
		Calci ob = new Calci();
		ob.sum(5,8);
		ob.mul(3, 5);
		ob.special(5, 10);
	}
}
