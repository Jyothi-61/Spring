package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cxt=new ClassPathXmlApplicationContext("Autowiring/autoconfig.xml");
		TypeOfCommunication t=(TypeOfCommunication) cxt.getBean("type");
		t.present();
	}

}
