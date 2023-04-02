package com.lambda;

interface Area{
	public int calcArea(int l, int b); 
}

interface Circle{
	public double calcArea(int r); 
}

interface SI{
	public double calcInterest(double p, double r, double t); 
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a1 = (l,b) -> {
			return l*b;
		};
		
		System.out.println(a1.calcArea(2, 3));
		
		Circle c1 = (r) -> {
			return 3.14*r*r;
		};
		
		System.out.println(c1.calcArea(4));
		
		SI s1 = (p, r, t) -> {
			return (p*r*t)/100;
		};
		
		System.out.print(s1.calcInterest(5000, 2, 3));
	}

}
