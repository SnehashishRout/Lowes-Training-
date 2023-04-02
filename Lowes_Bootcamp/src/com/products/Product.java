package com.products;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int numProd = scanner.nextInt();
        System.out.print("Enter number of products: ");
        

        String[] prodId = new String[numProd];
        String[] prod_name = new String[numProd];
        double[] unitPrice = new double[numProd];
        int[] qty = new int[numProd];
        int[] stocks = new int[numProd];
        double totalCost = 0.0;

        for (int i = 0; i < numProd; i++) {
            System.out.println("Enter Product Details " + (i+1) + ":");
            System.out.print("Product ID: ");
            prodId[i] = scanner.next();
            System.out.print("Product Name: ");
            prod_name[i] = scanner.next();
            System.out.print("Unit Price: ");
            unitPrice[i] = scanner.nextDouble();
            System.out.print("Quantity: ");
            qty[i] = scanner.nextInt();
            System.out.print("Stocks: ");
            stocks[i] = scanner.nextInt();
        }

        
        System.out.println("Listed Product Details:");
        
        for (int i = 0; i < numProd; i++) {
        	
            double cost = unitPrice[i] * qty[i];
            totalCost += cost;
            System.out.println("Product ID: " + prodId[i]);
            System.out.println("Product Name: " + prod_name[i]);
            System.out.println("Unit Price: " + unitPrice[i]);
            System.out.println("Quantity: " + qty[i]);
            System.out.println("Stocks: " + stocks[i]);
            
            if (qty[i] > stocks[i]) {
                System.out.println("Out of Stock");
            } else {
                System.out.println("Total Cost: " + cost);
                System.out.println("Remaining Stocks: " + (stocks[i] - qty[i]));
            }
            System.out.println("******************");
        }
        
        System.out.println("Total Cost of all products: " + totalCost);
	}

}
