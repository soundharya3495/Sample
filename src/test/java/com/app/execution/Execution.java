package com.app.execution;

import com.app.baseclass.BaseClass;
import com.app.locatorsexecution.HotelBookingExecution;
import com.app.locatorsexecution.LoginPageExecution;
import com.app.locatorsexecution.OrderExecution;
import com.app.locatorsexecution.SearchHotelExecution;
import com.app.locatorsexecution.SelectHotelExecution;

public class Execution extends LoginPageExecution {
	public static void main(String[] args) {
		BaseClass.browserLaunch();
		BaseClass.windowMaximize();
		BaseClass.getUrl("https://adactinhotelapp.com/");
		username();
		password();
		loginButton();

		SearchHotelExecution.location();
		SearchHotelExecution.hotelName();
		SearchHotelExecution.roomType();
		SearchHotelExecution.roomNos();
		SearchHotelExecution.datePick_In();
		SearchHotelExecution.datePick_Out();
		SearchHotelExecution.adult_Nos();
		SearchHotelExecution.child_Nos();
		SearchHotelExecution.submit();

		SelectHotelExecution.radioClick();
		SelectHotelExecution.continueClick();

		HotelBookingExecution.firstName();
		HotelBookingExecution.lastName();
		HotelBookingExecution.address();
		HotelBookingExecution.cC_Number();
		HotelBookingExecution.cC_Type();
		HotelBookingExecution.cC_ExpMonth();
		HotelBookingExecution.cC_ExpYear();
		HotelBookingExecution.cc_Cvv();
		HotelBookingExecution.Book();

		BaseClass.sleep(10000);

		OrderExecution.orderNo();

	}

}
