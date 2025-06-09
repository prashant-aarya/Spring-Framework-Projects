package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Student stdId1()
	{
		Student std=new Student();
		
		std.setName("Prashant Arya");
		std.setRollno(101);
		std.setEmail("prashant@gmail.com");
		
		return std;
	}
	
	@Bean
	public Student stdId2()
	{
		Student std=new Student();
		
		std.setName("Anurag Prajapati");
		std.setRollno(102);
		std.setEmail("anurag@gmail.com");
		
		return std;
	}

}
