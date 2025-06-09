package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;
public class Main 
{
	public static void main(String [] args)
	{
		String path="/in/sp/resources/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(path);
		
		Student std=(Student) context.getBean("student");
		std.display();
	}
}
