package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LogoutPage;


public class LogoutSteps {


    @Given("user clicks logout button and logs out successfully")
    public void userClicksLogoutButtonAndLogsOutSuccessfully() {
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.signOut();
    }
}
