package com.app.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.baseclass.BaseClass;

public class SelectHotelLocators extends BaseClass {
	public SelectHotelLocators() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private static WebElement radioId;

	public WebElement getRadioButton() {
		return radioId;
	}

	@FindBy(id = "continue")
	private static WebElement continue_Id;

	public static WebElement getContinueButton() {
		return continue_Id;
	}

}
