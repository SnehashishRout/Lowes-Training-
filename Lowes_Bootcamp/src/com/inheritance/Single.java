package com.inheritance;

// Single Inheritance

interface Operation{
	
	public void sum(int x, int y);
	public void mul(int x, int y);
	
}

 class Calc implements Operation{
	
	public void sum(int x, int y)
	{
		System.out.println("Sum = " + (x + y));
	}
	
	public void mul(int x, int y)
	{
		System.out.println("Multiply = " + x*y);
	}
}

public class Single {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc ob = new Calc();
		ob.sum(5,8);
		ob.mul(3, 5);
	}

}
