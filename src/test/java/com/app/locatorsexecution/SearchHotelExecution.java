package com.app.locatorsexecution;

import com.app.baseclass.BaseClass;
import com.app.pageobject.SearchHotelLocators;

public class SearchHotelExecution extends SearchHotelLocators {
	public static void location() {

		BaseClass.dropdownFill(new SearchHotelLocators().getLocation(), "Los Angeles");
	}

	public static void hotelName() {

		BaseClass.dropdownFill(getHotels(), "Hotel Sunshine");
	}

	public static void roomType() {

		BaseClass.dropdownFill(getRoom_Type(), "Super Deluxe");
	}

	public static void roomNos() {

		BaseClass.dropdownFill(getRoom_Nos(), "3 - Three");
	}

	public static void datePick_In() {

		BaseClass.inputText(getDatePick_In(), "22/06/2024");
	}

	public static void datePick_Out() {

		BaseClass.inputText(getDatePick_Out(), "23/06/2024");
	}

	public static void adult_Nos() {

		BaseClass.dropdownFill(getAdult_Room(), "2 - Two");
	}

	public static void child_Nos() {

		BaseClass.dropdownFill(getChild_Room(), "0 - None");
	}

	public static void submit() {

		BaseClass.click(getSubmit());
	}

}
