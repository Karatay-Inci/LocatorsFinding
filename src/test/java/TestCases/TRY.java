package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRY {
    @Test
    public void openGoogle() throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.findElement(By.id("email")).sendKeys("Hi");
        driver.findElement(By.name("pass")).sendKeys("I am");
        driver.findElement(By.linkText("Forgot account?")).click();

    }
}