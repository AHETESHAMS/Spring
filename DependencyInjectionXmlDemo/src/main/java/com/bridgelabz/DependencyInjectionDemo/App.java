package com.bridgelabz.DependencyInjectionDemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext applicaationContext =  new ClassPathXmlApplicationContext("spring.xml");
        Vehicle vehicle = (Vehicle) applicaationContext.getBean("vehicle");
        vehicle.drive();
        Tyre tyre  = (Tyre) applicaationContext.getBean("tyre");
        System.out.println(tyre);
    }
}
