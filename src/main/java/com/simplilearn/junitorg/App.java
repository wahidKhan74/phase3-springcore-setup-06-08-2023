package com.simplilearn.junitorg;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.simplilearn.junitorg.bean.Department;
import com.simplilearn.junitorg.bean.Employee;

/**
 * Main application file
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		// Tight coupling means classes and objects are dependent on one another. 
		// In general, tight coupling is usually not good because it reduces the flexibility and re-usability of the code
		
		// Create Departments 
		Department dept1 = new Department(1, "Engineering Divsion");
		Department dept2 = new Department(2, "HR Divsion");
		
		// Create objects of Employees
		Employee employee1 = new Employee(100, "John Snow", 50030.34, dept1 , "9090909090");
		
		Employee employee2 = new Employee(101, "Mike Smith", 100030.34, dept2 , "8089808080");
		
		System.out.println(employee1);
		
		System.out.println(employee2);
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		// Loose Coupling of classes
		// Spring IOC : Spring Inversion of COntrol : The IoC container is responsible to instantiate, configure and assemble the objects. 
		// It creates the objects, configures and assembles their dependencies, manages their entire life cycle.
	
		// Application Context Container
		ApplicationContext context = new ClassPathXmlApplicationContext("employee-department-bean.xml");
		
		Department deptOne = (Department) context.getBean("deptOne");
		Employee empOne = (Employee) context.getBean("empOne");
		empOne.setDept(deptOne);
		
		System.out.println(empOne);
		
		
		Department deptTwo = (Department) context.getBean("deptTwo");
		Employee empTwo = (Employee) context.getBean("empTwo");
		empTwo.setDept(deptTwo);
		
		System.out.println(empTwo);
		
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		
		// Bean Factory Container
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
		reader.loadBeanDefinitions("employee-department-bean.xml");
		
		Department depttOne = (Department) beanFactory.getBean("deptOne");
		Employee emppOne = (Employee) beanFactory.getBean("empOne");
		emppOne.setDept(depttOne);
		
		System.out.println(emppOne);
		

		Department depttTwo = (Department) beanFactory.getBean("deptTwo");
		Employee emppTwo = (Employee) beanFactory.getBean("empTwo");
		emppTwo.setDept(depttTwo);
		System.out.println(emppTwo);
		
	}
}
