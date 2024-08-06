package com.app.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.baseclass.BaseClass;

public class OrderLocators extends BaseClass {
	public OrderLocators() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "order_no")
	public WebElement orderNo;

	public WebElement getOrderNo() {

		return orderNo;
	}

}
