package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IcustomerService customerservice= context.getBean("service",IcustomerService.class);
		
		customerservice.add();
			
	
		

	
		
	

	}

}
