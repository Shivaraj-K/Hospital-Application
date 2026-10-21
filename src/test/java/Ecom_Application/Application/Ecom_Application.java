package Ecom_Application.Application;

import org.testng.annotations.Test;

import driveManager.InitializeDiver;

public class Ecom_Application 
{
	@Test
	public void Launch_Application()
	{
		InitializeDiver i=new InitializeDiver();
		i.InitializeWebDriver();
	}
}
