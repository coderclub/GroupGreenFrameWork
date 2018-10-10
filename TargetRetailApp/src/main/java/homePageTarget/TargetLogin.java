package homePageTarget;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import reporting.TestLogger;

import static googleSheetsAPI.GoogleSheetPage.password;
import static googleSheetsAPI.GoogleSheetPage.signin;
import static googleSheetsAPI.GoogleSheetPage.username;

public class TargetLogin extends CommonAPI {
    TargetLogin objLoginPage;
    public static WebDriver driver = null;
    @FindBy(xpath = "//*[@id=\"username\"]")
    public static WebElement EnterEmailOrMobile;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public static WebElement EnterPassWord;
    @FindBy(xpath = "//*[@id=\"recoveryPassword\"]")
    public static WebElement ForgotPassWord;
    @FindBy(xpath = "//*[@id=\"account\"]")
    public static WebElement SignIn;
    @FindBy(xpath = "//*[@id=\"accountNav-signIn\"]/a/div")
    public static WebElement SignOn;

    public TargetLogin(Object driver) {
    }

    public void clickOnEnterEmailOrMobile() {

        EnterEmailOrMobile.click();
    }
    public void clickOnTargetLogin() {

        EnterPassWord.click();
    }
    public void clickOnForgotPassWord() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SignIn.click();
        WebDriverWait wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.elementToBeClickable(SignOn));
        SignOn.click();
        ForgotPassWord.click();
    }
    public TargetLogin() {
    }
    public TargetLogin(WebDriver driver) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        driver = driver;
       PageFactory.initElements(driver, this);
    }
    public void logInByDataProvider(String userName, String passWord) throws InterruptedException {
        username.sendKeys(userName);
        password.sendKeys(passWord);
        signin.click();
        Thread.sleep(1000);
    }
}