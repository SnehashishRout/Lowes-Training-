package com.productCat;

public class Catalog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pid = Integer.parseInt(args[0]);
		int pname = Integer.parseInt(args[1]);
		int qty = Integer.parseInt(args[2]);
		double up = Double.parseDouble(args[3]);
		int stk = Integer.parseInt(args[4]);
		
		double tc = qty*up;
		int rstk = qty - stk;
		
		System.out.println("Total Cost = " + tc);
		System.out.println("Remaining Stocks = " + rstk);

	}

}
