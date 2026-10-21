package Ecom_Application.Application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import driveManager.InitializeDiver;

public class Ecom_Application 
{
	Logger log = LogManager.getLogger(Ecom_Application.class);
	@Test
	public void Launch_Application()
	{
		InitializeDiver i=new InitializeDiver();
		log.info("Initializing Browser");
		i.InitializeWebDriver();
	}
}
