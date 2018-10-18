package com.qwinix.onlinetimesheet.qa.steps;

import org.openqa.selenium.WebDriver;

import com.qwinix.onlinetimesheet.qa.BaseDriver;
import com.qwinix.onlinetimesheet.qa.page.SignInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps {

	public static WebDriver driver = BaseDriver.driver;
	ConfigReader config = new ConfigReader();
	public CommonUtil objCOM = new CommonUtil();
	SignInPage objSP = new SignInPage();

	@Given("^I am on Mystore Home Page$")
	public void i_am_on_Mystore_Home_Page() throws Throwable {
		objSP.openUrl();
	}

	@When("^I Enter Valid Credentials$")
	public void i_Enter_Valid_Credentials() throws Throwable {
		objSP.verifyLoginWithValidCred();
	}

	@Then("^I should able to see the MyAddress page$")
	public void i_should_able_to_see_the_MyAddress_page() throws Throwable {
		objSP.verifySignIn();    
	}
}
