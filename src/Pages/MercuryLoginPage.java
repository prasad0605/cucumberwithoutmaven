package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.CRM.BaseTest.BaseTest;
import com.CRM.BaseTest.WebDriverUtilities;

import cucumber.api.Scenario;

public class MercuryLoginPage extends BaseTest{
	
	@FindBy(name="userName") 
	WebElement edtUsername;
	
	@FindBy(xpath="//input[@name='password']") 
	WebElement edtPassword;
	
	@FindBy(name="submit") 
	WebElement btnSubmit;
	
	@FindBy(xpath="//img[@src='images/logo.gif']") 
	WebElement imgLogo;
	
	public MercuryLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getWelcomeTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyLogo() {
		return imgLogo.isDisplayed();
	}
	
	
	public void EnterUsername(String username) {
		edtUsername.sendKeys(username);
	}
	
	public void EnterPassword(String password) {
		edtPassword.sendKeys(password);
	}
	
	public void ClickonButton() {
		btnSubmit.click();
	}
	
	public String getLoginTitle() {
		return driver.getTitle();
	}


}
