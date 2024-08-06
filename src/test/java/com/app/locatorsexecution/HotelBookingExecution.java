package com.app.locatorsexecution;

import com.app.baseclass.BaseClass;
import com.app.pageobject.HotelBookingLocators;

public class HotelBookingExecution extends HotelBookingLocators {
	public static void firstName() {

		BaseClass.inputText(new HotelBookingLocators().getFirstName(), "Krishna");
	}

	public static void lastName() {

		BaseClass.inputText(getLastName(), "Prasad");
	}

	public static void address() {

		BaseClass.inputText(getAddress(), "India");
	}

	public static void cC_Number() {

		BaseClass.inputText(getCCNumber(), "7968654758645030");
	}

	public static void cC_Type() {

		BaseClass.dropdownFill(getCCType(), "VISA");
	}

	public static void cC_ExpMonth() {

		BaseClass.dropdownFill(getCC_ExpMonth(), "June");
	}

	public static void cC_ExpYear() {

		BaseClass.dropdownFill(getCC_ExpYear(), "2027");
	}

	public static void cc_Cvv() {

		BaseClass.inputText(getCC_Cvv(), "3214");
	}

	public static void Book() {

		BaseClass.click(getBookNow());

	}

}
