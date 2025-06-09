package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.SpringConfigFile;

public class Main 
{
	public static void main(String [] args) 
	{
	   ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);
	   
	   Student std1=(Student)context.getBean("stdId1");
	   std1.display();
	   
	   System.out.println("------------------------");
	  
	   Student std2=(Student)context.getBean("stdId2");
	   std2.display();
	}
}
