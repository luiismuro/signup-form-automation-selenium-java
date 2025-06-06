import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class LoginTest {

    @Test
    public void testUserLogin(){
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com");

        // Instance of Login page
        LoginPage loginPage = new LoginPage(driver);

        // Using Methods of Login Page
        loginPage.accessLoginPage();
        loginPage.fillEmail("luismurinho123@gmelho.com");
        loginPage.fillPassword("123456");
        loginPage.clickLoginButton();
    }
}