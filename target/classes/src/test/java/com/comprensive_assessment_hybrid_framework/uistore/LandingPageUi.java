package com.comprensive_assessment_hybrid_framework.uistore;

import org.openqa.selenium.By;

public class LandingPageUi {
	
	
	public By navitem1=By.cssSelector(".topnav_item.saleunit");
	public By navitem2=By.cssSelector(".topnav_item.livingunit");
	public By navitem3=By.cssSelector(".topnav_item.bedroomunit");
	public By navitem4=By.cssSelector(".topnav_item.diningunit");
	public By navitem5=By.cssSelector(".topnav_item.storageunit");
	public By navitem6=By.cssSelector(".topnav_item.studyunit");
	public By navitem7=By.cssSelector(".topnav_item.kidsroomunit");
	public By loginicon=By.cssSelector("span[class='header-icon-link user-profile-icon']");
	public By login=By.cssSelector("a[class='login-link authentication_popup']");
	public By loginemail=By.id("spree_user_email");
	public By loginpassword=By.id("spree_user_password");
	public By loginsubmit=By.id("ul_site_login");
	public By stores=By.linkText("Stores");
	public By giftcards=By.linkText("Gift Cards");
	public By childgiftcard=By.xpath("//img[@alt='House Warming Gift Card by Urban Ladder']");
	public By amountselectgiftcard=By.name("amount_select");
	public By woodensofaset=By.xpath("//a[@href='/wooden-sofas?src=g_topnav_sale_deals-of-the-week_wooden-sofa-sets\']");
	public By search=By.id("search");
	public By featuresdining=By.cssSelector("li[data-group='features']");
	public By shapedining=By.xpath("//label[@for='filters_table_shape_Square']");
	public By diningname=By.xpath("//span[text()='Arabia - Gordon 4 Seater Storage Dining Table Set ']");
	public By diningsubname=By.xpath("//div[text()='(Mahogany Finish)']");
	//public By diningprice=By.xpath("//span[text()='₹37,835']");
	public By tvunits=By.xpath("//h4[text()='TV Units']");
	public By enttvunits=By.xpath("//a[text()='Entertainment Units']");
	public By diningprice=By.xpath("//span[text()='₹20,159']");
	
	public By kidsroom=By.cssSelector(".topnav_item.kidsroomunit");
	public By kidstable=By.xpath("//a[text()='Kids Tables']");
	
	
	

}
