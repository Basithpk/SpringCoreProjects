package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerformers {

	public static void main(String[] args) {
		
	//	ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);    //("spring");
		
		
		ApplicationContext ct1 = new ClassPathXmlApplicationContext("");
		
	    String[] springComponents = ctx.getBeanDefinitionNames();
	    for (String bean : springComponents)
	    	System.out.println(bean);
		
//		Juggler p1 = (Juggler)ctx.getBean("juggler");   //();
//	
//		p1.perform();
//		
	}
}
