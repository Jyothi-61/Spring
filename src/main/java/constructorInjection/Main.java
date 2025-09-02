package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cxt=new ClassPathXmlApplicationContext("constructorInjection/conconfig.xml");
		Employee e=(Employee) cxt.getBean("emp");
		System.out.println(e);
	}

}
