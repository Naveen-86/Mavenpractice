package com.mavenpractice;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Mapp 
{
	static Logger logger = Logger.getLogger(Mapp.class);
	
	public static void main(String[] args) throws IOException
	{
		
		Layout layout = new PatternLayout("%d %p %C %M %m %n");
		Appender appender = new FileAppender(layout,"Mapplog.log");
		logger.addAppender(appender);
		logger.debug("debug priority");
		logger.info("info priority");
		logger.warn("warn priority");
		logger.error("error priority");
		logger.fatal("fatal priority");
		}
}
