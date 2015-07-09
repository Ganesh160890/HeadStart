package com.javapoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
 

  
public class Test {  
public static void main(String[] args) {  
	ApplicationContext ctx =new FileSystemXmlApplicationContext("ApplicationContext.xml");  
    
      
    Student student=(Student)ctx.getBean("studentbean");  
    student.displayInfo();  
	}  
}  