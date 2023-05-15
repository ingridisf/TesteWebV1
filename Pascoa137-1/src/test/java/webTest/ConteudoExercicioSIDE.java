package webTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.HashMap;
import java.util.Map;

public class ConteudoExercicioSIDE {



    public static class ContedoEXERCICIOV2SIDE {
        private WebDriver driver;
        private Map<String, Object> vars;
        JavascriptExecutor js;
        @BeforeEach
        public void setUp() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");


            // Aponta onde está o Chrome Driver
            System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver.exe");
            driver = new ChromeDriver(options);
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
        }
        @AfterEach
        public void tearDown() {
            driver.quit();
        }

        @Test
        public void contedoEXERCICIOV2() {
            driver.get("https://testando.eveclass.com/pt");
            driver.manage().window().setSize(new Dimension(1382, 744));
            driver.findElement(By.cssSelector(".button-custom:nth-child(4) > .button-text > span > span")).click();
            {
                WebElement element = driver.findElement(By.cssSelector(".no-link-style:nth-child(3) > .img-wrapper > .bg-img"));
                Actions builder = new Actions(driver);
                builder.moveToElement(element).perform();
            }
            driver.findElement(By.cssSelector(".button-link > .button-text > span")).click();
            driver.findElement(By.linkText("Admin")).click();
            driver.findElement(By.cssSelector(".EXERCISE > .text")).click();
        }
    }

}
