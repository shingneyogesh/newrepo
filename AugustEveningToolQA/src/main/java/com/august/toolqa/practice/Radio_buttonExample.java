package com.august.toolqa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_buttonExample {

	private static final String WebElemet  = null;
	private static final String WebElemnent = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1 - Register the driver
		
				System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
				
				//step 2- Create object of class
				
				ChromeDriver driver = new ChromeDriver(); //browser will get
				
				//step 3 - 
				
				//driver.get("https://demoqa.com/text-box");
				driver.navigate().to("https://demoqa.com/text-box");
				driver.manage().window().maximize();
				
				WebElement impressiveRadioBtn = driver.findElement(By.xpath("//lable[@for='impressiveRadio']"));
				
				impressiveRadioBtn.click();
				
				WebElement HomeLink = driver.findElement(By.partialLinkText("unautho"));
				
				HomeLink.click();

	}

}
