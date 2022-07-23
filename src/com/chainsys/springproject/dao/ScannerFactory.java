package com.chainsys.springproject.dao;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chainsys.springproject.view.EmployeeSprings;

public class ScannerFactory {
	private Scanner sc;

	public void scanner() {
		ConfigurableApplicationContext apcontext = new ClassPathXmlApplicationContext("Employee.xml");
		EmployeeSprings empspring = apcontext.getBean(EmployeeSprings.class);
		sc = new Scanner(System.in);
//		empspring.setApcontext(apcontext);
	

	}
	

}
