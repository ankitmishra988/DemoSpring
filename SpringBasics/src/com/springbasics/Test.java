package com.springbasics;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");	 
	Emplyee s=(Emplyee) context.getBean("e",Emplyee.class);
	
	s.show();
	
	}

}
