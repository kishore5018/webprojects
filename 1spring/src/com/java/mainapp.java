package com.java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class mainapp 

{
	
	public static void main(String[] args) {
		
		
		Resource res=new ClassPathResource("resource/student.xml");
		
		BeanFactory bb=new XmlBeanFactory(res);
		
		student s=(student)bb.getBean("stdbean");
		
		s.display();
		
		s.show();
		
		
	}

}
