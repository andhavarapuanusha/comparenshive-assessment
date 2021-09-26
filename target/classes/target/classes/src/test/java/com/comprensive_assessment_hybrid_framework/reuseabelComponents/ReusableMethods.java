package com.comprensive_assessment_hybrid_framework.reuseabelComponents;

import org.openqa.selenium.WebDriver;

import com.comprensive_assessment_hybrid_framework.utility.PropertyFileReader;



public class ReusableMethods {
		
		public static void getURL(WebDriver driver) {
			try {
				driver.get(PropertyFileReader.property().getProperty("url"));
			}
			catch(Exception e){
				System.out.println("URL not Found in config.properties");
			}
		}
		
		public static String getBrowser(WebDriver driver) {
			try {
				return PropertyFileReader.property().getProperty("browser");
			}
			catch(Exception e){
				System.out.println("Browser not Found in config.properties");
				return null;
			}
		}
			public static String getwait() {
				try {
					return PropertyFileReader.property().getProperty("implicitWait");
				}
				catch(Exception e){
					System.out.println("Browser not Found in config.properties");
					return null;
				}
		}}


