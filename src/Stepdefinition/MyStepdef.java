package Stepdefinition;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdef {
	

	@Given("^User is navigating to G-mail Login Page$")
	public void navigateURL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Entered URL"); 
		
	}

	@When("^User need to enter username as \"([^\"]*)\" and password as \"password(\\d+)“$")
	public void user_need_to_enter_username_as_and_password_as_password(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("entered username and password");
		Assert.assertTrue(false);
	}

	@Then("^User is successfully navigated to the G-mail Mail Box$")
	public void verifyGmailinbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user is able to see Gmail mail box");
	}


}
