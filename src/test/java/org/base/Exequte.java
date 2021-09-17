package org.base;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.support.ui.Sleeper;
import org.repository.BookHotelPojo;
import org.repository.LoginPojo;
import org.repository.OrderPojo;
import org.repository.SearchPojo;
import org.repository.SelectPojo;

public class Exequte extends BaseClass {
	@BeforeClass
	public static void openBrows() {
		BrowserLaunch();
		LaunchUrl("https://adactinhotelapp.com/");

	}
	@Before
	public void Starttime() {
		System.out.println("start time:");
		Finddate();
		
	}
	@Test
	public void tc1() throws IOException {
		LoginPojo l=new LoginPojo();
		FillText(l.getMail(), ExcelSheet(0, 0));
		FillText(l.getPassWord(), ExcelSheet(0, 1));
		button(l.getLog());
		
	}
	@Test
	public void tc2() throws IOException {
		SearchPojo s=new SearchPojo();
		FillText(s.getLoc().get(0), ExcelSheet(2, 0));
		FillText(s.getHotel().get(0), ExcelSheet(2, 1));
		FillText(s.getRoomtype().get(0), ExcelSheet(2, 2));
		FillText(s.getRoomnum().get(0), ExcelSheet(2, 3));
		FillText(s.getIndate().get(0), ExcelSheet(2, 4));
		FillText(s.getOutdate().get(0), ExcelSheet(2, 5));
		FillText(s.getAdult().get(0), ExcelSheet(2, 6));
		FillText(s.getChild().get(0), ExcelSheet(2, 7));
		button(s.getSearch().get(0));

	}
	@Test
	public void tc3() throws IOException {
		SelectPojo sp=new SelectPojo();
		button(sp.getButton().get(0));
		button(sp.getCon().get(0));
		

	}
	@Test
	public void tc4() throws IOException, InterruptedException {
		BookHotelPojo b=new BookHotelPojo();
		FillText(b.getFirst().get(0), ExcelSheet(2, 8));
		FillText(b.getLast().get(0), ExcelSheet(2, 9));
		FillText(b.getAdd().get(0), ExcelSheet(2, 10));
		FillText(b.getCard().get(0), ExcelSheet(2, 11));
		FillText(b.getCardType().get(0), ExcelSheet(2, 12));
		FillText(b.getMonth().get(0), ExcelSheet(2, 13));
		FillText(b.getYear().get(0), ExcelSheet(2, 14));
		FillText(b.getCVV().get(0), ExcelSheet(2, 15));
		button(b.getBook().get(0));
		sleep(5000);

	}
	@Test
	public void tc5() {
		OrderPojo o=new OrderPojo();
		String text = o.getOrder().getAttribute("value");
		System.out.println(text);
	}
	
	
	
	
	@After
	public void end() {
		System.out.println("end time:");
		Finddate();

	}

}
