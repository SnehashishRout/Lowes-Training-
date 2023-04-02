package com.javaTest;
import com.compnay.models.Product1;
import com.compnay.models.Product2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques4 {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
	    Product product = (Product) context.getBean("product");
	    System.out.println(product.getName());
	    System.out.println(product.getPrice());

	    ApplicationContext context2 = new ClassPathXmlApplicationContext("appContext2.xml");
	    Product2 product2 = (Product2) context2.getBean("product");
	    System.out.println(product2.getName());
	    System.out.println(product2.getPrice());
	}
	
}
