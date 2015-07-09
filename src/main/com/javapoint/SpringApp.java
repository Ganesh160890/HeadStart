package com.javapoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class SpringApp {

	/**
	 * @param args
	 */

		// TODO Auto-generated method stub

		public static void main(String[] args) {  
			ApplicationContext ctx =new FileSystemXmlApplicationContext("ApplicationContext.xml");  
		     
		      
		    Student student=(Student)ctx.getBean("studentbean");  
		    student.displayInfo();  
			}  
}
