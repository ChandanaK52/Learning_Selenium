package Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Selenium_Assertion {
    @Owner("Chandana K")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Validating error message of app.vwo.com")

    @Test
    public void Test_Selenium001() throws InterruptedException {
        //manage drivers
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");
       // Locate Element
       WebElement username= driver.findElement(By.id("login-username"));
               username.sendKeys("admin");
       WebElement password= driver.findElement(By.name("password"));
       password.sendKeys("Admin123");
        Thread.sleep(2000);
        WebElement submit_button= driver.findElement(By.id("js-login-btn"));
         submit_button.click();
         Thread.sleep(2000);
         WebElement error_msg=driver.findElement(By.className("notification-box-description"));
        // Assertions

        Assert.assertEquals(error_msg.getText(),"Your email, password, IP address or location did not match");

        System.out.println(error_msg.getText());
       // close window
        driver.quit();

    }

}
