package com.app.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.baseclass.BaseClass;

public class SearchHotelLocators extends BaseClass {
	public SearchHotelLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private static WebElement locationId;

	public WebElement getLocation() {
		return locationId;
	}

	@FindBy(id = "hotels")
	private static WebElement hotels;

	public static WebElement getHotels() {
		return hotels;
	}

	@FindBy(id = "room_type")
	private static WebElement room_type;

	public static WebElement getRoom_Type() {
		return room_type;
	}

	@FindBy(id = "room_nos")
	private static WebElement room_nos;

	public static WebElement getRoom_Nos() {
		return room_nos;
	}

	@FindBy(id = "datepick_in")
	private static WebElement datepick_in;

	public static WebElement getDatePick_In() {
		return datepick_in;
	}

	@FindBy(id = "datepick_out")
	private static WebElement datepick_out;

	public static WebElement getDatePick_Out() {
		return datepick_out;
	}

	@FindBy(id = "adult_room")
	private static WebElement adult_room;

	public static WebElement getAdult_Room() {
		return adult_room;
	}

	@FindBy(id = "child_room")
	private static WebElement child_room;

	public static WebElement getChild_Room() {
		return child_room;
	}

	@FindBy(id = "Submit")
	private static WebElement submit;

	public static WebElement getSubmit() {
		return submit;
	}

}
