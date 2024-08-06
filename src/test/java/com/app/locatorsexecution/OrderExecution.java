package com.app.locatorsexecution;

import com.app.pageobject.OrderLocators;

public class OrderExecution extends OrderLocators {
	public static void orderNo() {

		String orderNum = new OrderLocators().orderNo.getAttribute("value").toString();
		System.out.println(orderNum);

	}

}
