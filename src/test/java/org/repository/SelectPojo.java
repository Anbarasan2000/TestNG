package org.repository;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SelectPojo extends BaseClass {
	public SelectPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(id = "radiobutton_0") })
	private List<WebElement> button;
	@FindBys({

			@FindBy(id = "continue") })
	private List<WebElement> con;
	public List<WebElement> getButton() {
		return button;
	}
	public List<WebElement> getCon() {
		return con;
	}
}
