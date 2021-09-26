package com.comprensive_assessment_hybrid_framework.runner;
import java.io.IOException;

import java.util.ArrayList;


import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.comprensive_assessment_hybrid_framework.pageobjects.Connect;
import com.comprensive_assessment_hybrid_framework.pageobjects.Help;
import com.comprensive_assessment_hybrid_framework.pageobjects.LandingPage;
import com.comprensive_assessment_hybrid_framework.pageobjects.Login;
import com.comprensive_assessment_hybrid_framework.pageobjects.Searchbox;
import com.comprensive_assessment_hybrid_framework.reuseabelComponents.DriverClass;
import com.comprensive_assessment_hybrid_framework.reuseabelComponents.ReusableMethods;
import com.comprensive_assessment_hybrid_framework.utility.EmailSender;
import com.comprensive_assessment_hybrid_framework.utility.Excel;

public class Runner extends DriverClass
{
    Logger log=Logger.getLogger(DriverClass.class);
	LandingPage l=new LandingPage(driver);
	@BeforeTest
	public void intilize() throws IOException
	{
		driver=initilizedriver();
		ReusableMethods.getURL(driver);
		log.info("intilized driver");
	}
	@Test(priority=1)
	public void searchingelements() throws InterruptedException
	{
		LandingPage l=new LandingPage(driver);
		l.navitem1().click();
		log.info("clicked on sale tab");
		l.navitem2().click();
		log.info("clicked on living tab");
		 //Thread.sleep(2000L);
		l.navitem3().click();
		log.info("clicked on bedroom tab");
		 //Thread.sleep(2000L);
		l.navitem4().click();
		log.info("clicked on dining tab");
		 //Thread.sleep(2000L);
		l.navitem5().click();
		log.info("clicked on storage tab");
		 //Thread.sleep(2000L);
		l.navitem6().click();
		log.info("clicked on study tab");
		 //Thread.sleep(2000L);
		l.navitem7().click();
		log.info("clicked on kidsroom tab");
	
		
		
	}
	 @Test(priority=5,dataProvider="exceldata")
		public void testdata(String data) throws IOException, InterruptedException{
  	
		Searchbox s=new Searchbox(driver);
		
		s.search().click();
		s.search().sendKeys(data);
		s.search().sendKeys(Keys.ENTER);
		s.search().sendKeys(Keys.CONTROL, Keys.chord("a")); //select all text in textbox
		s.search().sendKeys(Keys.BACK_SPACE); //delete it
			
   }
  @DataProvider
  public Object[][] exceldata() throws IOException
  {
	
			ArrayList<String> data=Excel.getData("testcase","furniture");
			int s=data.size();
			Object[][] ob=new Object[s][1];
			for(int i=0;i<s;i++)
			{
				ob[i][0]=data.get(i);
			}
				
			return ob;
  	
  }
  @Test(priority=0)
  public void validate_stores()
  {
	  LandingPage l=new LandingPage(driver);
	  Assert.assertTrue(l.stores().isDisplayed());
	  System.out.println("stores is displayed");
  }
  @Test(priority=2)
  public void gift_cards() throws InterruptedException
  {
	  LandingPage l=new LandingPage(driver);
	  l.giftcards().click();
	  log.info("clicked on giftcards");
	  l.childgiftcard().click();
	  log.info("clicked on house warming page");
	  l.amountselect().click();
	  Thread.sleep(2000);
	  l.amountselect().sendKeys("1000");
	  Thread.sleep(2000);
	  System.out.println("1000rs for giftcard");
	  driver.findElement(By.cssSelector("button[type='button']")).click();
	  Thread.sleep(2000);
	  log.info("clicked on next button");
	  
	  
  }
  @Test(priority=3)
  public void help() throws InterruptedException
  {
	  Help h=new Help(driver);
	  h.help().click();
	  log.info("Clicked on help tab");
	  h.search().click();
	  h.search().sendKeys("c");
	  h.search().sendKeys(Keys.ARROW_DOWN);
	  h.search().sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
	  
  }
  @Test(priority=4)
  public void kidsroom()
  {
	    LandingPage l=new LandingPage(driver);
		Actions a=new Actions(driver); 
		WebElement move=l.kidsroom();
		a.moveToElement(move).contextClick().build().perform();
		log.info("clicked on kids room tab");
		WebElement image = l.kidstable();
      	System.out.println("The href of kids table is : "+image.getAttribute("href"));
		
  }
  @Test(priority=6)
  public void searchtab()
	  {
		  LandingPage l=new LandingPage(driver);
		  l.searchbox().click();
		  l.searchbox().sendKeys("dining tables");
		  l.searchbox().sendKeys(Keys.ENTER);
		  Actions a=new Actions(driver); 
		  WebElement move=l.featuresdining();
		  a.moveToElement(move).contextClick().build().perform();
		  l.diningshape().click();
		  log.info("clicked on square shape");
		  //String s=l.diningname().getText();
		  //System.out.println(s);
		  String s1=l.diningsubname().getText();
		  System.out.println(s1);
		  //String s2=l.diningprice().getText();
		  //System.out.println(s2);
		  
		  
			
	  }
  @Test
  public void tvunits()
  {
	  LandingPage l=new LandingPage(driver);
	  l.Tvunits().click();
	  l.enttvunits().click();
	  
  }
  @Test(priority=8)
  public void connectwithus()
  {
	  Connect c=new Connect(driver);
	  WebElement img1 = c.img1();
      System.out.println("Email : "+img1.getAttribute("data-gaaction"));
      WebElement img2 = c.img2();
      System.out.println("facebook : "+img2.getAttribute("data-gaaction"));
      WebElement img3 = c.img3();
      System.out.println("Twitter : "+img3.getAttribute("data-gaaction"));
      WebElement img4 = c.img4();
      System.out.println("pininterest : "+img4.getAttribute("data-gaaction"));
      WebElement img5 = c.img5();
      System.out.println("utube : "+img5.getAttribute("data-gaaction"));
      WebElement img6 = c.img6();
      System.out.println("instagram : "+img6.getAttribute("data-gaaction"));
      WebElement img7 = c.img7();
      System.out.println("linkedin : "+img7.getAttribute("data-gaaction"));
      
  }
  @Test
  public void login()
  {
	  Login l=new Login(driver);
	  l.trackorder().click();
	  l.loginbutton().click();
	  l.emailaddress().click();
	  l.emailaddress().sendKeys("anushaandhavarapu2@gmail.com");
	  l.password().click();
	  l.password().sendKeys("Anu@12345");
	  l.submit().click();
	  log.info("login");
  }
  
  
 
	 @AfterTest 
	 public void close() 
	 { 
		 driver.close();
		 driver=null; 
		 
	 }
		
			 @AfterSuite
			 public void test() throws IOException
			 { 
				 EmailSender.sentEmail();
			 }
			 
}
	 

	
	
