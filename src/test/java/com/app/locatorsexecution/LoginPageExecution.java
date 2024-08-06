package com.app.locatorsexecution;

import com.app.baseclass.BaseClass;
import com.app.pageobject.LoginPageLocators;

public class LoginPageExecution extends LoginPageLocators {
	public static void username() {
		BaseClass.inputText(new LoginPageLocators().getUsername(), "yuvisekar3");
	}

	public static void password() {
		BaseClass.inputText(new LoginPageLocators().getPassword(), "33CJOO");
	}

	public static void loginButton() {
		BaseClass.click(new LoginPageLocators().getLogin());
	}

}
