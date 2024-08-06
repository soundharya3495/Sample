package com.app.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static WebElement byId(String idValue) {
		return driver.findElement(By.id(idValue));
	}

	public static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//	public static String getDatas(String sheetName, int i, int j) {
//		String value = null;
//		try {
//			File f = new File("D:\\Eclipse\\BaseClass_Task\\src\\test\\resources\\TestData\\HotelBooking.xlsx");
//			FileInputStream fis = new FileInputStream(f);
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet sheet = wb.getSheet(sheetName);
//			Row row = sheet.getRow(i);
//			Cell cell = row.getCell(j);
//			int cellFormat = cell.getCellType();
//			if (cellFormat == 1) {
//				value = cell.getStringCellValue();
//				System.out.println(value);
//			} else if (cellFormat == 0) {
//				if (DateUtil.isCellDateFormatted(cell)) {
//					Date dateCell = cell.getDateCellValue();
//					SimpleDateFormat smd = new SimpleDateFormat("dd/MM/yyyy");
//					value = smd.format(dateCell);
//					System.out.println(value);
//				} else {
//					double numberCell = cell.getNumericCellValue();
//					long l = (long) numberCell;
//					value = String.valueOf(l);
//					System.out.println(value);
//				}
//			}
//		}
//
//		catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		return value;
//	}

//	public static String propertiesConfig(String data) {
//		String value = "null";
//		File f = new File("D:\\Eclipse\\BaseClass_Task\\src\\test\\resources\\TestData\\config.properties");
//
//		try {
//			FileReader fread = new FileReader(f);
//			Properties prop = new Properties();
//			prop.load(fread);
//			value = prop.getProperty(data);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return value;
//	}

	public static void dropdownFill(WebElement element, String data) {
		Select select = new Select(element);
		select.selectByVisibleText(data);
	}

	public static String getAttribute(WebElement element) {
		String orderNo;
		orderNo = element.getAttribute("value").toString();
		return orderNo;
	}

	public static void implicitWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public static String getText(WebElement element) {
		String orderNo;
		orderNo = element.getText();
		return orderNo;
	}

//	public static void excelWrite(String sheetName, int i, int j, String data) {
//		File file = new File(
//				"D:\\\\Eclipse\\\\BaseClass_Task\\\\src\\\\test\\\\resources\\\\TestData\\\\HotelBooking.xlsx");
//		try {
//			FileInputStream fis = new FileInputStream(file);
//			Workbook wb = new XSSFWorkbook(fis);
//			Sheet sheet = wb.createSheet(sheetName);
//			Row row = sheet.createRow(i);
//			Cell cell = row.createCell(j);
//			cell.setCellValue(data);
//			FileOutputStream fos = new FileOutputStream(file);
//			wb.write(fos);
//			wb.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void inputText(WebElement element, String text) {
		element.sendKeys(text);
	}

}
