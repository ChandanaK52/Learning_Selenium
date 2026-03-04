package Selenium_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Test_Selenium_Project1 {
    @Test
    public void test_selenium01()
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        WebElement make_appontment=driver.findElement(By.id("btn-make-appointment"));
        make_appontment.click();
        WebElement username=driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        username.sendKeys("John Doe");
        WebElement password=driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("ThisIsNotAPassword");
        WebElement login= driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        login.click();
       String url= driver.getCurrentUrl();
       System.out.println(url);
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isNotEmpty().isEqualTo(url);
        driver.quit();
    }
}
