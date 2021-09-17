package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void BrowserLaunch() {
         WebDriverManager.chromedriver().setup();
           driver=new ChromeDriver();
         
	}
	public static void LaunchUrl(String url) {
		driver.get(url);
	}
	public static void FillText(WebElement element,String value) {
       element.sendKeys(value);
	}
	public static void button(WebElement element) {
		element.click();
	}
	public static String ExcelSheet(int row,int cell) throws IOException {
       File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\Junit\\excelsheet\\hotelData.xlsx");
       FileInputStream fin=new FileInputStream(f);
       Workbook w=new XSSFWorkbook(fin);
       Sheet s = w.getSheet("Sheet1");
       Row r = s.getRow(row);
       Cell c = r.getCell(cell);
       
       String value;
       int cellType = c.getCellType();
       if (cellType==1) {
		 value = c.getStringCellValue();
		
	}else if (DateUtil.isCellDateFormatted(c)) {
		Date dateCellValue = c.getDateCellValue();
		SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
		 value = d.format(dateCellValue);
	}else {
		double numericCellValue = c.getNumericCellValue();
		long l=(long)numericCellValue;
		 value = String.valueOf(l);
		
	}
       return value;
       
  
	}
	public static void Finddate() {
		Date d=new Date();
		System.out.println(d);
	}
	public static void print(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);

	}
	public static void sleep(long millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	

}
