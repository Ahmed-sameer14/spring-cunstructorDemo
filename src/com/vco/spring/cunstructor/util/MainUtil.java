package com.vco.spring.cunstructor.util;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vco.spring.cunstructor.bean.Pen;

public class MainUtil 
{
	public static void main(String[] args) 
	{
		// create a container
		
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
				
				// 2.Get beans(s)
				
				Pen p = (Pen) context.getBean("Pen1");
				Pen p1 = (Pen) context.getBean("Pen2");
				
				System.out.println("Pen p---->"+p);
				System.out.println("Pen p1---->"+p1);
				
				// 3.close the container
				
				context.close();
	}

}
