package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TRY {
    @Test
    public void openGoogle() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement myElement = driver.findElement(By.id("email"));
        myElement.sendKeys("Selenium");

        driver.findElement(By.id("email")).sendKeys("I am learning Locator Finding");
        // Thread.sleep(5000);
        driver.findElement((By.name("pass"))).sendKeys("myPassword");
        //  Thread.sleep(5000);
        //driver.findElement((By.className("inputtext"))).sendKeys("myPassword");
        // driver.findElement(By.linkText("Forgot account?")).click();
        //   Thread.sleep(5000);
        driver.findElement(By.partialLinkText("account?")).click();

    }
}