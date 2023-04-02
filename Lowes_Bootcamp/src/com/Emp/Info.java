package com.Emp;

public class Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pid = Integer.parseInt(args[0]);
		String ename = args[1];
		int basic = Integer.parseInt(args[2]);
		
		double hra = 0.12*basic;
		double da = 0.8*basic;
		double ta = 0.9*basic;
		
		
		double gross = hra + da + ta + basic;
		
		System.out.println("Employeed Id : "+ pid);
		System.out.println("Employee Name: " + ename);
		
		if(gross >= 25000)
			System.out.println("Grade : A");
		else if(gross >= 10000)
			System.out.println("Grade : B");
		else
			System.out.println("Grade : C");
		
	}

}
