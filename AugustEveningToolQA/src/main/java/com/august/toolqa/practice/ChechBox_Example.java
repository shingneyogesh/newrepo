package com.august.toolqa.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChechBox_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//step 1 - Register the driver
		
				System.setProperty("webdriver.chrome.driver",".\\src\\main\\resources\\chromedriver.exe");
				
				//step 2- Create object of class
				
				ChromeDriver driver = new ChromeDriver(); //browser will get
				
				//step 3 - 
				
				//driver.get("https://demoqa.com/text-box");
				driver.navigate().to("https://demoqa.com/text-box");
				
				driver.findElement(By.xpath("tree-node-home"))
	}

}
