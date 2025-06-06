import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CredentialLoader;
import utils.EmailGenerator;

public class SignupTest {
    @Test
    public void testUserSignup(){
        System.setProperty("webdriver.chrome.driver", "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Generating unique email and loading password from credentials.properties file.
        String email = EmailGenerator.generateUniqueEmail();
        String password = CredentialLoader.getPassword();

        driver.get("https://automationexercise.com");
        // Instance of page
        SignupPage signupPage = new SignupPage(driver);

        // Using the methods of SignupPage
        signupPage.accessSignupPage();
        signupPage.fillNameField("test");
        signupPage.fillEmailField(email);
        signupPage.clickSignupButton();
        signupPage.clickTitleRadio();
        signupPage.fillPasswordField(password);
        signupPage.selectDay();
        signupPage.selectMonth();
        signupPage.selectYear();
        signupPage.fillFirstName("test");
        signupPage.fillLastName("HAHAHA");
        signupPage.fillCompany("TESTE INSTITUTE");
        signupPage.fillAddress("Rua teste 123");
        signupPage.selectCountry();
        signupPage.fillState("Las Vegas");
        signupPage.fillCity("Rio de Janeiro");
        signupPage.fillZipCode("12345");
        signupPage.fillMobileNumber("1234234");
        signupPage.clickCreateAccountButton();


    }
}





