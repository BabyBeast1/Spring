package sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext applicationContext = 
				new FileSystemXmlApplicationContext("src/applicationContext.xml");
		
		Calc calc = (Calc)applicationContext.getBean("calcAdd");
		calc.calculate(25, 36);
		
		calc = applicationContext.getBean("calcMul", Calc.class);
		calc.calculate(25, 36);

	}

}
