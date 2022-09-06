package com.springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		
					AnnotationConfigApplicationContext context=
							new AnnotationConfigApplicationContext(IocConfig.class);
		
		IcustomerService service= context.getBean("service",IcustomerService.class);
	
		service.add();
			
	
		

	
		
	

	}

}
