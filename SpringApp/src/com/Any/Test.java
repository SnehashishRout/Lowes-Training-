package com.Any;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory fac = new XmlBeanFactory(r);
		Product p = fac.getBean("pBean");
		p.show();
		
		
	}

}
