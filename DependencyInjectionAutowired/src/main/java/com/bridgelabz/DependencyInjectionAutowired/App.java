package com.bridgelabz.DependencyInjectionAutowired;

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
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Car car = (Car) applicationContext.getBean("car");
        car.drive();
    }
}
