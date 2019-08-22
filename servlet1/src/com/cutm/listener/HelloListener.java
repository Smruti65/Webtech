package com.cutm.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class HelloListener
 *
 */
@WebListener
public class HelloListener implements ServletContextListener, ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public HelloListener() {
       
    }

	    public void attributeAdded(ServletContextAttributeEvent arg0)  
    { 
        System.out.println("Attribute added");
    }
    	
    public void attributeRemoved(ServletContextAttributeEvent arg0)  
    { 
    	System.out.println("Attribute removed");
    }
    public void contextDestroyed(ServletContextEvent arg0)  
    { 
    	System.out.println("Attribute destroy");
    }
    public void attributeReplaced(ServletContextAttributeEvent arg0)  
    { 
    	System.out.println("Attribute replaced");
    }
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("INIT");
    }
	
}
