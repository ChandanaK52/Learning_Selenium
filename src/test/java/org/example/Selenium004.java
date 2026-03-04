package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium004 {
    public static void main(String[] args) {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://katalon-demo-cura.herokuapp.com/");
    System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.quit();
    }
}
