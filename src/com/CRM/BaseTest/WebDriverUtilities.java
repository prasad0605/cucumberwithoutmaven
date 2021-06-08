package com.CRM.BaseTest;

import org.openqa.selenium.WebElement;


public class WebDriverUtilities extends BaseTest{
	
	public static boolean IsWebElementExist(WebElement element,String elmName) {
		boolean b=false;
		try {
			if(element.isDisplayed()) {
				b=true;
			}
		}catch(Exception e) {
		
		}
		return b;
	}

}
