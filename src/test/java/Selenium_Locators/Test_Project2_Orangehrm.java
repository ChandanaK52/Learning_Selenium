package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Project2_Orangehrm {

        @Test
        public void Test_orangehrm() {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
            driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
            driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("Hacker@4321");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            WebElement text = driver.findElement(By.xpath("//span[@class=\"oxd-topbar-header-breadcrumb\"]/h6"));
            Assert.assertEquals(text.getText(), "Admin");
            driver.quit();
        }
}
