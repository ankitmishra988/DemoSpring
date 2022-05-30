package com.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SbiBank {
	
	@Value("${Bank.AccountNo}")
	public String AccountNo;
	
	public Atm atm;
	public Employee employee;
	
//	@Autowired
	public void setAtm(Atm atm) {
		this.atm = atm;
	}
//	@Autowired
//	@Qualifier("manager")
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void PrintValues() {
		atm.printAtm();
		employee.doWork();
		System.out.println(" Account no.."+AccountNo);
	}
	
	
	
	
	

}
