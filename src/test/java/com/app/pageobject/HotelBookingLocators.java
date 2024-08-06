package com.app.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.baseclass.BaseClass;

public class HotelBookingLocators extends BaseClass {
	public static String bookId = "book_now";

	public HotelBookingLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private static WebElement first_name;

	public WebElement getFirstName() {
		return first_name;
	}

	@FindBy(id = "last_name")
	private static WebElement last_name;

	public static WebElement getLastName() {
		return last_name;
	}

	@FindBy(id = "address")
	private static WebElement address;

	public static WebElement getAddress() {
		return address;
	}

	@FindBy(id = "cc_num")
	private static WebElement cc_num;

	public static WebElement getCCNumber() {
		return cc_num;
	}

	@FindBy(id = "cc_type")
	private static WebElement cc_type;

	public static WebElement getCCType() {
		return cc_type;
	}

	@FindBy(id = "cc_exp_month")
	private static WebElement cc_exp_month;

	public static WebElement getCC_ExpMonth() {
		return cc_exp_month;
	}

	@FindBy(id = "cc_exp_year")
	private static WebElement cc_exp_year;

	public static WebElement getCC_ExpYear() {
		return cc_exp_year;
	}

	@FindBy(id = "cc_cvv")
	private static WebElement cc_cvv;

	public static WebElement getCC_Cvv() {
		return cc_cvv;
	}

	@FindBy(id = "book_now")
	private static WebElement book_now;

	public static WebElement getBookNow() {
		return book_now;
	}

}
