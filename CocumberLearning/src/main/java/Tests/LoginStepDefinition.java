package Tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

    @Given("A user is on demoqa.com")
    public void a_user_is_on_demoqa_com() throws Throwable {
        System.out.println("User is on demoqa.com");
    }

    @When("User clicks on MyAccount")
    public void user_clicks_on_MyAccount() throws Throwable {
        System.out.println("User clicks on MyAccount");
    }

    @Then("User is taken to Login Page")
    public void user_is_taken_to_Login_Page() throws Throwable {
        System.out.println("User is taken to Login Page");
    }

    @When("User enters a valid user name")
    public void user_enters_a_valid_user_name() throws Throwable {
        System.out.println("User enters name");
    }

    @Then("User is able to login successfully")
    public void user_is_able_to_login_successfully() throws Throwable {
        System.out.println("");
    }
}
