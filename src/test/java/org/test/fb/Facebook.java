package org.test.fb;

import org.test.baseclass.BaseClass;
import org.test.pages.LoginPage;

public class Facebook extends BaseClass{
	
	public static void main(String[] args) {
		
		chromeLaunch();
		urlLaunch("https://www.facebook.com/");
		dynamicWait(30);
		LoginPage l=new LoginPage();
		
		sendKeys(l.getTextusername(),"Kesavini" );
		sendKeys(l.getTextpassword(), "12345678");
		
	
		
		
	}

}
