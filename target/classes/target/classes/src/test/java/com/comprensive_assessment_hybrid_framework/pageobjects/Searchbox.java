package com.comprensive_assessment_hybrid_framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comprensive_assessment_hybrid_framework.uistore.SearchboxUi;

public class Searchbox {
	
	SearchboxUi s=new SearchboxUi();
	public WebDriver driver;
	public Searchbox(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement search()
	{
		return driver.findElement(s.search);
		
	}
	

}
