package com.springbasics;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(basePackages = "com.springbasics")
@PropertySource("classpath:manager.properties")
public class AppConfig {
	
	@Bean
	public Atm atm() {
		return new Atm();
	}
	
	@Bean
	public Employee manager() {
		 return new Manager();
	}
	@Bean
	public SbiBank sbiBank() {
		SbiBank sbiBank=new SbiBank();
		sbiBank.setAtm(atm());
		sbiBank.setEmployee(manager());
		return sbiBank;
		
	

	}
	
	
	
	
	
	
}
