package org.repository;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPojo extends BaseClass {
	public BookHotelPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBys({
		@FindBy(id="first_name")
	})
	private List<WebElement> First;
	@FindBys({
		@FindBy(id="last_name")
	})
	private List<WebElement> last;
	@FindBys({
		@FindBy(id="address")
	})
	private List<WebElement> add;
	@FindBys({
		@FindBy(id="cc_num")
	})
	private List<WebElement> card;
	@FindBys({
		@FindBy(id="cc_type")
	})
	private List<WebElement> cardType;
	@FindBys({
		@FindBy(id="cc_exp_month")
	})
	private List<WebElement>month;
	@FindBys({
		@FindBy(id="cc_exp_year")
	})
	private List<WebElement> year;
	@FindBys({
		@FindBy(id="cc_cvv")
	})
	private List<WebElement>CVV;
	@FindBys({
		@FindBy(id="book_now")
	})
	private List<WebElement>book;
	public List<WebElement> getFirst() {
		return First;
	}
	public List<WebElement> getLast() {
		return last;
	}
	public List<WebElement> getAdd() {
		return add;
	}
	public List<WebElement> getCard() {
		return card;
	}
	public List<WebElement> getCardType() {
		return cardType;
	}
	public List<WebElement> getMonth() {
		return month;
	}
	public List<WebElement> getYear() {
		return year;
	}
	public List<WebElement> getCVV() {
		return CVV;
	}
	public List<WebElement> getBook() {
		return book;
	}

}
