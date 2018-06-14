package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Signinpage extends GenericFunctions {
	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Sign in']")
	public static WebElement Lnk_SignIn;

	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	public static WebElement Edi_Email;

	@FindBy(how = How.XPATH, using = "//input[@id='passwd']")
	public static WebElement Edi_password;

	@FindBy(how = How.XPATH, using = "//button[@id='SubmitLogin']")
	public static WebElement btn_signin;

	@FindBy(how = How.XPATH, using = "//a[normalize-space(text())='Sign out']")
	public static WebElement btn_signout;
	
	//This method is to click the 'Signin' link

	public static boolean click_Signin() {
		boolean status = true;

		status = hoverAndClick(Lnk_SignIn);

		if (status) {
			logEvent("pass", "Sign in link is clicked sucessfully");

		}

		else {
			logEvent("fail", "Sign in link is not clicked sucessfully");
		}

		return status;
	}

	//This method is to enter the credentials from 'Login_valiation' sheet from excel document
	
	public static void enter_Credentials() {

		int itr = getLastIterationNumber("Login_validation");

		for (int i = 1; i <= itr; i++) {
			try {
				String email = getdata("Login_validation", "Username", i);
				Edi_Email.clear();
				Edi_Email.sendKeys(email);
				
				System.out.println(email);
				String password = getdata("Login_validation", "Password", i);
				Edi_password.clear();

				Edi_password.sendKeys(password);

				System.out.println(password);
				hoverAndClick(btn_signin);
				hoverAndClick(btn_signout);

			} catch (Exception e) {

				System.out.println(e.getMessage());

			}

		}

	}

	public static boolean Signin() {
		boolean status = true;
		status = hoverAndClick(btn_signin);
		if (status) {
			logEvent("pass", "Sign in link is clicked sucessfully");

		}

		else {
			logEvent("fail", "Sign in link is not clicked sucessfully");
		}

		return status;
	}

	public static boolean click_Signout() {
		boolean status = true;

		status = hoverAndClick(btn_signout);

		if (status) {
			logEvent("pass", "Sign in link is clicked sucessfully");

		}

		else {
			logEvent("fail", "Sign in link is not clicked sucessfully");
		}

		return status;
	}

}
