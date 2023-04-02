package com.AMS;

public class StudentReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sid = Integer.parseInt(args[0]);
		String sname = args[1];
		double m1 = Double.parseDouble(args[2]);
		double m2 = Double.parseDouble(args[3]);
		double m3 = Double.parseDouble(args[4]);
		
		int nop = Integer.parseInt(args[5]);
		
		int atnd = 280;
		
		double tot = m1 + m2 + m3;
		double avg = tot / 3;
		
		double reg = (nop/atnd) * 100;
		
		System.out.println("Student Id = " + sid);
		System.out.println("Student Name = " + sname);
		System.out.println("Total Marks = "+ tot);
		System.out.println("Average = " + avg);
		
		if(reg >= 60)
			System.out.println("Regular");
		else
			System.out.println("Attendance Not Sufficient");
	}

}
