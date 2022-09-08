package StepDefinition;

import POM.LoginPage;
import io.cucumber.java.en.*;

public class LoginSteps {

    LoginPage loginPage;
    @Given("User is on website")
    public void user_is_on_website() {
        loginPage = new LoginPage();
        loginPage.validateUserIsOnLoginPage();

    }
    @When("User enter valid credentials")
    public void user_enter_valid_credentials() {
        loginPage = new LoginPage();
        loginPage.userEnterValidCredentials();

    }
    @Then("User is successfully logged in")
    public void user_is_successfully_logged_in() {
        loginPage = new LoginPage();
        loginPage.welcomeMessageDisplayed();

    }
}
