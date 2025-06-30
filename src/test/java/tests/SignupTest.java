package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CredentialLoader;
import utils.EmailGenerator;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SignupTest{
    WebDriver driver;
    SignupPage signupPage;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://automationexercise.com");
        signupPage = new SignupPage(driver);
    }

    @Test
    public void testSignup() {
        String email = EmailGenerator.generateUniqueEmail();
        String password = CredentialLoader.getPassword();

        signupPage.accessSignupPage();
        signupPage.fillNameField("Test");
        signupPage.fillEmailField(email);
        signupPage.clickSignupButton();
        signupPage.fillCompleteForm(password);
}

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
