package com.estafet.training.maven;

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
    	
        System.out.println( "Hello World!!" );
        
        LOGGER.info("Hello world again!");
    }
}
