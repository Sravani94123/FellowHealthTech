package StepDefinition;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	@Given("user should be on Amazonlanding page")
	public void user_should_be_on_Amazonlanding_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should be on landing page");
	}
	
	@When("enter {string} and {string}")
	public void enter_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("enter email"+string+" and password"+string2);
	}
	@Then("user should be successfully login and home page should be displayed")
	public void user_should_be_successfully_login_and_home_page_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user should be on home page");
	}
	

}

