package org.example;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium002 {
    //heirarchy of seleniumWebdriver
	public static void main(String[] args) {
		//heirarchy of seleniumWebdriver

		SearchContext driver=new ChromeDriver();
		WebDriver driver2=new EdgeDriver();
		RemoteWebDriver driver3=new FirefoxDriver();
		//ChromeDriver driver4=new ChromeDriver();
		//SafariDriver driver5=new SafariDriver();

		driver3=new EdgeDriver();
		driver3.manage().window().maximize();
		driver3.get("https://app.vwo.com/#/login");
		String title=driver3.getTitle();
		System.out.println(title);
		System.out.println(driver3.getCurrentUrl());
		driver3.quit();
		driver2.quit();

	}
}
