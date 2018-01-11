package com.estafet.first.training;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	BasicConfigurator.configure();
        System.out.println( "Hello World!!" );
        
        LOGGER.info("Hello world again!");
    }
}
