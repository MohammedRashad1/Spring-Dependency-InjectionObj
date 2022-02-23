package com.ibs.training.SpringDependencyObjTest;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Airtel airtelService = context.getBean("airtel", Airtel.class);
        airtelService.activateService();
    }
}
