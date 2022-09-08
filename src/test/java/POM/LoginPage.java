package POM;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage  extends BasePOM {

    public LoginPage () {PageFactory.initElements(driver, this);}

    @FindBy (xpath = "//li[@class='authorization-link']//a")
    private WebElement signIn;

    @FindBy( id = "email")
    private WebElement email;

    @FindBy( id = "pass")
    private WebElement password;

    @FindBy( css = "button[class='action login primary']")
    private WebElement signInButton;

    private String  emailInput = "aryastark@gmail.com";
    private String passwordInput = "Queenofthenorth!";

    @FindBy (xpath = "//span[contains(text(),'Welcome')]")
    private WebElement welcomeMessage;

    public void userEnterValidCredentials () {
        email.sendKeys(emailInput);
        password.sendKeys(passwordInput);
        signInButton.click();

    }

    public void welcomeMessageDisplayed () {
        wait.until(ExpectedConditions.visibilityOf(welcomeMessage));
        Assert.assertTrue(welcomeMessage.isDisplayed());
        Assert.assertTrue(welcomeMessage.getText().toLowerCase().contains("welcome"));
    }

    public void validateUserIsOnLoginPage () {
        signIn.click();
        Assert.assertTrue(email.isDisplayed());
        Assert.assertTrue(password.isDisplayed());
        Assert.assertTrue(signIn.isDisplayed());
    }

        }


