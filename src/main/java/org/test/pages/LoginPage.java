package org.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class LoginPage extends BaseClass  {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement textusername;
	
	@FindBy(id="pass")
	private WebElement textpassword;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	public WebElement getTextusername() {
		return textusername;
	}

	public WebElement getTextpassword() {
		return textpassword;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}


}

