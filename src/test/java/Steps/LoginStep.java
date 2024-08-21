package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.LoginPage;


public class LoginStep{

    LoginPage loginPage = new LoginPage();
    private static final Logger log = LoggerFactory.getLogger(LoginStep.class);

    @Given("User navigate to login page")
    public void user_navigate_to_login_page() throws InterruptedException {

     LoginPage.clickLoginLink();
        Assert.assertEquals("Customer Login",loginPage.loginPageDisplayed());
    }
    @When("user enters credential and click enter")
    public void user_enters_credential_and_click_enter() {
        loginPage.signIn();
    }
    @Then("user should be logged in")
    public void user_should_be_logged_in() throws InterruptedException {
       // Welcome, Shivam Test!
       Assert.assertEquals("Welcome, Shivam Test!",loginPage.loggedIn());
    }
}
