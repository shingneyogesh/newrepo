package com.august.toolqa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//step 1 - Register the driver
		
		System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
		
		//step 2- Create object of class
		
		ChromeDriver driver = new ChromeDriver(); //browser will get
		
		//step 3 - 
		
		//driver.get("https://demoqa.com/text-box");
		driver.navigate().to("https://demoqa.com/text-box");
		
		// we have to pass address of fullname textbox and then we have to perform operation
		
		// 8 ways id name classname linked xpth css tagname
		
		WebElement fullnametxt =driver.findElement(By.id("username"));
		fullnametxt.sendKeys("this is demo");
	
		WebElement emailtxt = driver.findElement(By.xpath("//input@placeholder=name@example.com"));
		emailtxt.sendKeys("test@test.com");
		
		WebElement clickMbtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		clickMbtn.click();
		
		driver.manage().window().minimize();
		//driver.navigate().refresh();
		
		WebElement HomeLink =driver.findElement(By.linkText("home"));
		HomeLink.click();
	}


	
}

