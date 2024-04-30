package com.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("IOC");
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student Student1=(Student) context.getBean("Student1");
		System.out.println(Student1);
	}

}
