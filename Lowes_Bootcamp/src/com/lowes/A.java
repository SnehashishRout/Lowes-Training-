package com.lowes;
import com.math.Oper;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oper m = new Oper();
		
		int p = Integer.parseInt(args[0]);
		int r = Integer.parseInt(args[1]);
		int t = Integer.parseInt(args[2]);
		int l = Integer.parseInt(args[3]);
		int b = Integer.parseInt(args[4]);

		System.out.println(m.sI(p, r, t));
		System.out.println(m.area(l,b));
	}

}
