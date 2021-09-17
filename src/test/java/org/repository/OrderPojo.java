package org.repository;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPojo extends BaseClass {
	public OrderPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "OrderPojo")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}

}
