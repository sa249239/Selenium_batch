package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Signinpage;

public class Tc_01_Signin extends GenericFunctions {
	@Test
	public static void validatesignin() {
		launchApplication("firefox");
		
		System.out.println(getLastIterationNumber("Login_validation"));

		Signinpage login = PageFactory.initElements(driver, Signinpage.class);
		Signinpage.click_Signin();

		Signinpage.enter_Credentials();

	}

}
