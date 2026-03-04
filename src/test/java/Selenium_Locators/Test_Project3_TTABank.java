package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Project3_TTABank {
    @Test
    public void Test_ttabank()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");
        driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
        driver.findElement(By.cssSelector("input[placeholder='John Doe']")).sendKeys("Lucky");
        driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abcd@gmail.com");
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("1234");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        WebDriverWait explicitwait=new WebDriverWait(driver, Duration.ofSeconds(1000));
        explicitwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Transfer Funds')]")));

        driver.findElement(By.xpath("//button[contains(text(),'Transfer Funds')]")).click();
        driver.findElement(By.xpath("//input[@type='number'][@placeholder='0.00'])]")).sendKeys("1000");
        driver.findElement(By.xpath("//input[@type='text'][@placeholder='e.g. Rent for October']]")).sendKeys("rent");
        driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Confirm Transfer')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Dashboard')]")).click();
        WebElement text=driver.findElement(By.xpath("//h3[contains(text(),'49,000.00')]"));

        Assert.assertEquals(text.getText(),"49,000.00");

        driver.findElement(By.xpath("//button[contains(text(),'Sign Out')]")).click();
        driver.quit();
    }
}
