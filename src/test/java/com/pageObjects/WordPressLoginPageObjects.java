package com.pageObjects;

import org.openqa.selenium.By;

public class WordPressLoginPageObjects {

	public By loginField() {
		By login = By.id("user_login");
		return login;		
	}
	
	public By pwdField() {
		By pwd = By.id("user_pass");
		return pwd;
	}
	
	public By clickLogin() {
		By loginClick = By.id("wp-submit");
		return loginClick;
	}
}