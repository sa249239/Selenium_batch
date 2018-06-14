package com.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.Signinpage;

public class Tc_01_ValidateSignIn extends GenericFunctions {

	@Test

	public static void validateSignIn() {
		boolean status = true;

		status = launchApplication("firefox");
		
		

		

//		if (status) {
//			logEvent("pass", "Application is launched sucessfully");
//
//			// If the application is launched sucessfully then proceed further
//			Signinpage sgn = PageFactory.initElements(driver, Signinpage.class);
//			status = sgn.click_Signin();
//
//			// If the sign inlink is clicked sucessfully then proceed further
//					
//			
//		}
//
//		else {
//			logEvent("fail", "Application is not launched sucessfully");
//		}

	}

}
