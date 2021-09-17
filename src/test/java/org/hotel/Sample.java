package org.hotel;

import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.repository.LoginPojo;



public class Sample extends BaseClass {
	@BeforeClass
	public static void brows() {
		BrowserLaunch();
		LaunchUrl("https://adactinhotelapp.com/");
	}

	@Test
	public void tc1() throws IOException {
		LoginPojo l = new LoginPojo();
		FillText(l.getMail(), ExcelSheet(0, 0));
		Assert.assertEquals("check user", "Anbuv2000", l.getMail().getAttribute("value"));
		FillText(l.getPassWord(), ExcelSheet(0, 1));
		button(l.getLog());

	}

}
