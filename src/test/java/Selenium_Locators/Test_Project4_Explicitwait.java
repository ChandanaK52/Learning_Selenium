package Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Project4_Explicitwait {
    @Description("Using explicit wait login to app.vwo.com")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    public void Test_Waits()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

       WebElement username= driver.findElement(By.xpath("//input[@type='email'][@name='username']"));
       WebElement password=driver.findElement(By.xpath("//input[starts-with(@name,\"pass\")]"));
       username.sendKeys("admin");
       password.sendKeys("abcd@123");
        WebElement submit_btn=driver.findElement(By.xpath("//button[@data-qa=\"sibequkica\"][@type=\"submit\"]"));
        submit_btn.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[contains(text(),'Your email, password, IP address or location did not match')]")));
        WebElement error_msg=driver.findElement(By.xpath("//div[contains(text(),'Your email, password, IP address or location did not match')]"));

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");
        driver.quit();
    }






}
