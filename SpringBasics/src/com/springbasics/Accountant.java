package com.springbasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class Accountant implements Employee {
	
public void doWork() {
		System.out.println("Auditing Accounts...");
		
	}
}
