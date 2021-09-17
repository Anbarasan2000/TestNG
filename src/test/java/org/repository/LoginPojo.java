package org.repository;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	public LoginPojo() {
		PageFactory.initElements(driver, this);//stale element exception
	}
	@FindBy(id="email")
	private WebElement mail;
	@FindBy(id="pass")
	private WebElement passWord;
	@FindBy(id="u_0_d_73")
	private WebElement log;
	public WebElement getMail() {
		return mail;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public WebElement getLog() {
		return log;
	}

	
	
}
