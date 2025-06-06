import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage {

   WebDriver driver;

   // Constructor'
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Elements
    private final By loginLink = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
    private final By emailField = By.xpath("/html/body/section/div/div/div[1]/div/form/input[2]");
    private final By passwordField = By.xpath("/html/body/section/div/div/div[1]/div/form/input[3]");
    private final By loginButton =  By.xpath("/html/body/section/div/div/div[1]/div/form/button");

    // Actions
    public void accessLoginPage() {
        driver.findElement(loginLink).click();
    }

    public void fillEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(email);
    }

    public void fillPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
