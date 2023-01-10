package com.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.demo.model.Person;
import com.demo.model.Samosa;
import com.demo.scope.Pepsi;
import com.demo.scope.Soda;
import com.demo.scope.Student1;
import com.test.Test;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo","com.test"})
public class DemoApplication {
	
	

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		/*
		 * Person person = context.getBean(Person.class); person.play();
		 * 
		 * Test test = context.getBean(Test.class); test.testing();
		 */
		/*
		 * Pepsi p = context.getBean(Pepsi.class); System.out.println(p.hashCode());
		 * 
		 * Pepsi p1 = context.getBean(Pepsi.class); System.out.println(p1.hashCode());
		 * 
		 * Pepsi p2 = context.getBean(Pepsi.class); System.out.println(p2.hashCode());
		 */
		
	/*	Pepsi pepsi = context.getBean(Pepsi.class);
		System.out.println(pepsi);
		
		Soda soda = pepsi.getSoda();
		System.out.println(soda);
		
		Pepsi pepsi1 = context.getBean(Pepsi.class);
		System.out.println(pepsi1);
		
		Soda soda1 = pepsi.getSoda();
		System.out.println(soda1);*/
		
		Student1 s = context.getBean(Student1.class);
		System.out.println(s);
		
		
		
		
	}

}
