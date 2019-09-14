package com.bridgelabz.DependencyInjectionByConstructorHumanBody;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Body 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bodyParts.xml");
        Human human = (Human) applicationContext.getBean("human");
        human.startPumping();
    }
}
