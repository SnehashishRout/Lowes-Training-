package com.products;

interface In1
{
	public void show();
}

public class FuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=99;
		
//		In1 i1 = new In1() {
//			
//			public void show() {
//				System.out.println(c);
//			}
//		};
		
		In1 i1 = () -> {
			System.out.println(c);
		};
		
		i1.show();
	}

}
