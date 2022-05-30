package com.springbasics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("config");
		SbiBank SBI = context.getBean("sbiBank",SbiBank.class);
		System.out.println("manager"+SBI);
		SBI.PrintValues();
		context.close();
		}

	}
