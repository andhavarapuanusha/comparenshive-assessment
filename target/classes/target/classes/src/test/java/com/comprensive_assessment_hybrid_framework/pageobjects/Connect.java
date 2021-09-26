package com.comprensive_assessment_hybrid_framework.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comprensive_assessment_hybrid_framework.uistore.ConnectUi;


public class Connect {
	
	public WebDriver driver;
	ConnectUi h=new ConnectUi();
	public Connect(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement img1()
	{
		return driver.findElement(h.img1);
	}
	public WebElement img2()
	{
		return driver.findElement(h.img2);
	}
	public WebElement img3()
	{
		return driver.findElement(h.img3);
	}
	public WebElement img4()
	{
		return driver.findElement(h.img4);
	}
	public WebElement img5()
	{
		return driver.findElement(h.img5);
	}
	public WebElement img6()
	{
		return driver.findElement(h.img6);
	}
	public WebElement img7()
	{
		return driver.findElement(h.img7);
	}

}
