package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.managevaksinbookingPage;

public class managevaksinbookingSteps {
    @Steps
    managevaksinbookingPage managevaksinbookingpage;

    @When("I click manage booking button")
    public void iClickManageBookingButton() {
        managevaksinbookingpage.managebookingButton();
    }

    @Then("I can see the booking page")
    public void iCanSeeTheBookingPage() {
        managevaksinbookingpage.successBookingpage();
    }

    @Given("I am on login page")
    public void iAmOnLoginPage() {
        managevaksinbookingpage.openUrl();
    }

    @When("I am input username")
    public void iAmInputUsername() {
        managevaksinbookingpage.inputUsername("rs.dr.soetarto");
    }

    @And("I am input password")
    public void iAmInputPassword() {
        managevaksinbookingpage.inputPassword("adminsoetarto");
    }

    @And("click login button")
    public void clickLoginButton() {
        managevaksinbookingpage.loginButton();
    }
}
