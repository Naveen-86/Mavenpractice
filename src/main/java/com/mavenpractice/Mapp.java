package com.mavenpractice;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Mapp 
{
	static Logger logger = Logger.getLogger(Mapp.class);
	
	public static void main(String[] args)
	{
		
		Layout layout = new SimpleLayout();
		Appender appender = new ConsoleAppender(layout);
		logger.addAppender(appender);
		logger.debug("debug priority");
		logger.info("info priority");
		logger.warn("warn priority");
		logger.error("error priority");
		logger.fatal("fatal priority");
		}
}
