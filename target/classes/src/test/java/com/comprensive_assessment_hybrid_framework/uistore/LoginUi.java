package com.comprensive_assessment_hybrid_framework.uistore;

import org.openqa.selenium.By;

public class LoginUi {
	
	public By trackorder=By.linkText("Track Order");
	public By loginbutton=By.xpath("//button[text()='Login To Track All Your Orders']");
	public By emailaddress=By.xpath("//input[@placeholder='Email Address'][1]");
	public By password=By.xpath("//input[@placeholder='Password'][1]");
	public By submit=By.xpath("//input[@id='ul_site_login'][1]");
	//*[@id="app-container"]/div/header/div[1]/div/section[3]/ul/li[1]/a/span/svg

}
