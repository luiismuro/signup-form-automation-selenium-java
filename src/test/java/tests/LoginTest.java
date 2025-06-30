package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com");
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testLogin() {
        loginPage.fillLoginFormComplete("luismurinho123@gmelho.com", "123456");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}






