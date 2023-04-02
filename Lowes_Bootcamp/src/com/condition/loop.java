package com.condition;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 20, y= 30;
		int z;
		
		if(x > y)
			z = 1;
		else
			z = 0;
		
		System.out.println(z);
		
		while(x > 0)
		{
			y += 1;
			x--;
		}
		
		System.out.println(y);
		
		int t = 3;
		
		do {
			System.out.println("Hello");
			t--;
		}while(t>0);
		
		switch(z)
		{
		case 1: System.out.println("A"); break;
		case 2: System.out.println("B"); break;
		default: System.out.println("Not defined");
		}

	}

}
