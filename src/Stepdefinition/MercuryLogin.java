package Stepdefinition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.CRM.BaseTest.BaseTest;
import Pages.MercuryLoginPage;
import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MercuryLogin extends BaseTest{
	
	MercuryLoginPage page;
	@Before
	public void setup() {
		initialization();
		page=new MercuryLoginPage();
	}
	

	
	@After
	public void tearDown(Scenario scenario) {
	    if (scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) driver)
	                        .getScreenshotAs(OutputType.BYTES);
	            scenario.embed(screenshot, "image/png"); //stick it in the report
	    }
	    driver.quit();
	}
	
	
	@Given("^User is navigating to MercuryTours Login Page$")
	public void InvokeMercuryToursApp() throws Throwable {
	    // Write code here that turns the phrase above into concrete action
		
		System.out.println("user is able to see login page");

	}
	
	@Then("^validate the mercury title$")
	public void verifyMercuryTourstitle() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//page=new MercuryLoginPage();
		String actttile=page.getWelcomeTitle();
		Assert.assertEquals("Welcome: Mercury Tours", actttile);
	}

	@Then("^validate the mercury logo$")
	public void verifymercuryLogo() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//page=new MercuryLoginPage();
		boolean b=page.verifyLogo();
	   Assert.assertTrue(b);
	}


	@When("^User need to enter username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void verifyMercurylogin(String username, String password) throws Throwable {
		//page=new MercuryLoginPage();
	    page.EnterUsername(username); 
	    page.EnterPassword(password);
	    page.ClickonButton();
	    String actTile=page.getLoginTitle();
	    Assert.assertEquals("Login: Mercury Tours",actTile);
	}
	
	
	@When("^User need to enter username and password and click on login button$")
	public void user_need_to_enter_username_and_password_and_click_on_login_button(DataTable logindetails) throws Throwable {
		for(Map<String, String> data:logindetails.asMaps(String.class, String.class)) {
			String userName=(String)data.get("Username");
			String password=(String) data.get("Password");
			driver.findElement(By.linkText("Home")).click();
			driver.findElement(By.name("userName")).sendKeys(userName);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("submit")).click();
		    Assert.assertEquals("Login: Mercury Tours", driver.getTitle());
		}
	}

	

}
