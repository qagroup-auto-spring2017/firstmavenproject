package com.qagroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeStarter {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\lib\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com.ua");
		
		driver.findElement(By.xpath("q")).sendKeys("Hello World!");
		
		driver.findElement(By.name("btnG")).click();
		
		driver.close();
	}

}
