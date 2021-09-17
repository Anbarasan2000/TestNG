package org.repository;

import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends BaseClass {
	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBys({
		@FindBy(id="location")
	})
	private List<WebElement> loc;
	
	@FindBys({
		@FindBy(id="hotels")
	})
	private List<WebElement> hotel;
	@FindBys({
		@FindBy(id="room_type")
	})
	private List<WebElement> roomtype;
	@FindBys({
		@FindBy(id="room_nos")
	})
	private List<WebElement> roomnum;
	@FindBys({
		@FindBy(id="datepick_in")
	})
	private List<WebElement> indate;
	@FindBys({
		@FindBy(id="datepick_out")
	})
	private List<WebElement> outdate;
	@FindBys({
		@FindBy(id="adult_room")
	})
	private List<WebElement> adult;
	@FindBys({
		@FindBy(id="child_room")
	})
	private List<WebElement> child;
	
	@FindBys({
		@FindBy(id="Submit")
	})
	private List<WebElement> search;

	public List<WebElement> getLoc() {
		return loc;
	}

	public List<WebElement> getHotel() {
		return hotel;
	}

	public List<WebElement> getRoomtype() {
		return roomtype;
	}

	public List<WebElement> getRoomnum() {
		return roomnum;
	}

	public List<WebElement> getIndate() {
		return indate;
	}

	public List<WebElement> getOutdate() {
		return outdate;
	}

	public List<WebElement> getAdult() {
		return adult;
	}

	public List<WebElement> getChild() {
		return child;
	}

	public List<WebElement> getSearch() {
		return search;
	}
	


}
