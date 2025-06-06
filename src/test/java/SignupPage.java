import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupPage {
    WebDriver driver;

    // Constructor method
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Attributes - Elements
    private final By signupLink = By.xpath("/html/body/header/div/div/div/div[2]/div/ul/li[4]/a");
    private final By nameField = By.name("name");
    private final By emailField = By.xpath("/html/body/section/div/div/div[3]/div/form/input[3]");
    private final By signupButton = By.xpath("/html/body/section/div/div/div[3]/div/form/button");
    private final By titleRadio = By.id("id_gender1");
    private final By passwordField = By.id("password");
    private final By birthdaySelect = By.id("days");
    private final By birthMonthSelect = By.id("months");
    private final By birthYearSelect = By.id("years");
    private final By firstNameField = By.id("first_name");
    private final By lastNameField = By.id("last_name");
    private final By companyField = By.id("company");
    private final By addressField = By.id("address1");
    private final By countrySelect = By.id("country");
    private final By stateField = By.id("state");
    private final By cityField = By.id("city");
    private final By zipCodeField = By.id("zipcode");
    private final By mobileNumberField = By.id("mobile_number");
    private final By createAccountButton = By.xpath("/html/body/section/div/div/div/div[1]/form/button");

    // methods of first register form
    public void accessSignupPage(){
        driver.findElement(signupLink).click();
    }

    public void fillNameField(String name){
        driver.findElement(nameField).sendKeys(name);
    }

    public void fillEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSignupButton(){
        driver.findElement(signupButton).click();
    }

    // methods of register form
    public void clickTitleRadio(){
        driver.findElement(titleRadio).click();
    }

    public void fillPasswordField(String password){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until((ExpectedConditions.visibilityOfElementLocated(By.id("password"))));
        driver.findElement(passwordField).sendKeys(password);
    }

    public void selectDay(){
        Select selectDay = new Select(driver.findElement(birthdaySelect));
        selectDay.selectByValue("23");
    }

    public void selectMonth(){
        Select selectMonth = new Select(driver.findElement(birthMonthSelect));
        selectMonth.selectByValue("9");
    }

    public void selectYear(){
        Select selectYear = new Select(driver.findElement(birthYearSelect));
        selectYear.selectByValue("2000");
    }

    public void fillFirstName(String firstName){
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void fillLastName(String lastName){
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void fillCompany(String company){
        driver.findElement(companyField).sendKeys(company);
    }

    public void fillAddress(String address){
        driver.findElement(addressField).sendKeys(address);
    }

    public void selectCountry(){
        Select selectCountry = new Select(driver.findElement(countrySelect));
        selectCountry.selectByValue("United States");
    }

    public void fillState(String state){
        driver.findElement(stateField).sendKeys(state);
    }

    public void fillCity(String city){
        driver.findElement(cityField).sendKeys(city);
    }

    public void fillZipCode(String zipCode){
        driver.findElement(zipCodeField).sendKeys(zipCode);
    }

    public void fillMobileNumber(String mobile_number){
        driver.findElement(mobileNumberField).sendKeys(mobile_number);
    }

    public void clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }


}

