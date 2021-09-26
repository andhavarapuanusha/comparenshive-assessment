package com.comprensive_assessment_hybrid_framework.pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.comprensive_assessment_hybrid_framework.uistore.LandingPageUi;

public class LandingPage {
	
	LandingPageUi l=new LandingPageUi();
	public WebDriver  driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement navitem1()
	{
		return driver.findElement(l.navitem1);
		
	}
	public WebElement navitem2()
	{
		return driver.findElement(l.navitem2);
		
	}
	public WebElement navitem3()
	{
		return driver.findElement(l.navitem3);
		
	}
	public WebElement navitem4()
	{
		return driver.findElement(l.navitem4);
		
	}
	public WebElement navitem5()
	{
		return driver.findElement(l.navitem5);
		
	}
	public WebElement navitem6()
	{
		return driver.findElement(l.navitem6);
		
	}
	public WebElement navitem7()
	{
		return driver.findElement(l.navitem7);
		
	}
	public WebElement loginicon()
	{
		return driver.findElement(l.loginicon);
		
	}
	public WebElement login()
	{
		return driver.findElement(l.login);
		
	}
	public WebElement loginemail()
	{
		return driver.findElement(l.loginemail);
		
	}
	public WebElement loginpassword()
	{
		return driver.findElement(l.loginpassword);
		
	}
	public WebElement loginsubmit()
	{
		return driver.findElement(l.loginsubmit);
		
	}
	public WebElement stores()
	{
		return driver.findElement(l.stores);
	}
	public WebElement giftcards()
	{
		return driver.findElement(l.giftcards);
	}
	public WebElement childgiftcard()
	{
		return driver.findElement(l.childgiftcard);
	}
	public WebElement amountselect()
	{
		return driver.findElement(l.amountselectgiftcard);
	}
	public WebElement woodensofa()
	{
		return driver.findElement(l.woodensofaset);
		
	}
	public WebElement searchbox()
	{
		return driver.findElement(l.search);
	}
	public WebElement featuresdining()
	{
		return driver.findElement(l.featuresdining);
	}
	public WebElement diningshape()
	{
		return driver.findElement(l.shapedining);
	}
	public WebElement diningname()
	{
		return driver.findElement(l.diningname);
	}
	public WebElement diningsubname()
	{
		return driver.findElement(l.diningsubname);
	}
	public WebElement diningprice()
	{
		return driver.findElement(l.diningprice);
	}
	public WebElement Tvunits()
	{
		return driver.findElement(l.tvunits);
	}
	public WebElement enttvunits()
	{
		return driver.findElement(l.enttvunits);
	}
	public WebElement kidsroom()
	{
		return driver.findElement(l.kidsroom);
	}
	public WebElement kidstable()
	{
		return driver.findElement(l.kidstable);
	}
	
	
	

}
