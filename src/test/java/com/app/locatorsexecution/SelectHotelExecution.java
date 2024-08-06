package com.app.locatorsexecution;

import com.app.baseclass.BaseClass;
import com.app.pageobject.SelectHotelLocators;

public class SelectHotelExecution extends SelectHotelLocators {
	public static void radioClick() {

		BaseClass.click(new SelectHotelLocators().getRadioButton());
	}

	public static void continueClick() {

		BaseClass.click(getContinueButton());
	}

}
