package com.spring.setterinjection.myfirstproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/setterinjection/myfirstproject/configmetadata.xml");
        
        /*Customer customer = (Customer)context.getBean("cus");
        
        System.out.println("Name   : "+customer.getName());
        System.out.println("Contact: "+customer.getContact());
        System.out.println("Address: "+customer.getAddress());*/
        
        Order order = (Order)context.getBean("ord");
        
        System.out.println("Details:"+order.toString());
        
    }
}
