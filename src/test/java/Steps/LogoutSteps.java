package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LogoutPage;


public class LogoutSteps {

    @Given("user clicks logout button in the dropdown")
    public void userClicksLogoutButtonInTheDropdown() {
        LogoutPage logoutPage = new LogoutPage();
        logoutPage.signOut();

    }

    @Then("user should be logged out")
    public void userShouldBeLoggedOut() {
    }
}
