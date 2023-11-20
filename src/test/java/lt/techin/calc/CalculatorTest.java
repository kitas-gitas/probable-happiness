package lt.techin.calc;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {


    WebDriver driver;

    @Test
    @DisplayName("login")
    void testSum() throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.get("https://practice.expandtesting.com/login");
        String inx ="" + 1 + 1;
        WebElement userNameInput = driver.findElement(By.id("username"));
        userNameInput.sendKeys("practiceaaa");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("form#login > .btn.btn-bg.btn-primary.d-block.w-100")).click();
        String text = driver.findElement(By.cssSelector("#flash b")).getText();
        assertEquals("Your username is invalid!", text);
        assertNotEquals("https://practice.expandtesting.com/secure",driver.getCurrentUrl());
        Thread.sleep(3000);

    }

    @Test
    void testFanjdnfl(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/login");
        WebElement userNameInput = driver.findElement(By.id("username"));
        userNameInput.sendKeys("practice");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("form#login > .btn.btn-bg.btn-primary.d-block.w-100")).click();
        String text = driver.findElement(By.cssSelector("#flash b")).getText();
        assertEquals("You logged into a secure area!", text);
        assertEquals("https://practice.expandtesting.com/secure",driver.getCurrentUrl());

    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }



}
