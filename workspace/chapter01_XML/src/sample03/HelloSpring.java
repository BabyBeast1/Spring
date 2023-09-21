package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new FileSystemXmlApplicationContext("src/applicationContext.xml");
		MessageBean messageBean = (MessageBean)applicationContext.getBean("messageBean");
		messageBean.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean2 = (MessageBean)applicationContext.getBean("messageBean");
		messageBean2.sayHello("Spring");
		System.out.println();
		
		MessageBean messageBean3 = (MessageBean)applicationContext.getBean("messageBean");
		messageBean3.sayHello("Spring");
	}

}
