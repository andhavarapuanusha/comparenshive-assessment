package com.comprensive_assessment_hybrid_framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comprensive_assessment_hybrid_framework.uistore.HelpUi;

public class Help {
	
	public WebDriver driver;
	HelpUi h=new HelpUi();
	public Help(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement help()
	{
		return driver.findElement(h.help);
	}
	public WebElement search()
	{
		return driver.findElement(h.search);
	}

}
