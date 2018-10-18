package com.qwinix.onlinetimesheet.qa.page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qwinix.onlinetimesheet.qa.BaseDriver;
import com.qwinix.onlinetimesheet.qa.steps.CommonUtil;
import com.qwinix.onlinetimesheet.qa.steps.ConfigReader;

public class SignInPage {
	
	CommonUtil objCOM = new CommonUtil();
	public static WebDriver driver = BaseDriver.driver;
	ConfigReader config = new ConfigReader();

	public SignInPage() {
		PageFactory.initElements(BaseDriver.driver, this);
	}

	@FindBy(xpath = "//a[@class='login']")
	public WebElement signIn;

	@FindBy(xpath = "//h3[contains(.,'Already registered?')]")
	public WebElement alreadyReg;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "passwd")
	public WebElement password;

	@FindBy(id = "SubmitLogin")
	public WebElement submitSignIn;

	@FindBy(xpath = "//a[text()='Sign out']")
	public WebElement signOut;

	public void openUrl() {
		driver.get(config.getUrl());
		driver.manage().window().maximize();
	}

	public void verifyLoginWithValidCred() throws InterruptedException
	{	
		// Clicking on SignIn button
		signIn();

		// Reading the data from excel file by the specified path
		String xl = "./ReadExcel/mystoreexcel.xlsx";
		String Sheet = "Sign_In";
		int rowCount = CommonUtil.getRowCount(xl, Sheet);

		for (int i=1;i<=rowCount;i++)
		{
			String userName=CommonUtil.getCellValue(xl, Sheet, i, 0);
			String psswd=CommonUtil.getCellValue(xl, Sheet, i, 1);

			System.out.println(userName);
			System.out.println(psswd);

			//Passing UserName and password as parameters
			login(userName,psswd);

			//Submitting the data by clicking on login button                   
			submitSignIn();

			//clear fields
			clearField();
		}
	}

	//Click SignIn
	public void signIn() {
		signIn.click();
		WebElement alreadyReg = driver.findElement(By.xpath("//h3[contains(.,'Already registered?')]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", alreadyReg);
	}

	//Specifying email and password
	public void login(String uName,String pwd) throws InterruptedException
	{
		email.sendKeys(uName);
		objCOM.waitForElement(password);
		password.sendKeys(pwd);		
	}

	public void submitSignIn() {
		submitSignIn.click();
	}

	public void clearField() {
		email.clear();
		password.clear();
	}

	public void signOut() {
		signOut.click();
	}

	public void verifySignIn() throws InterruptedException {
		//Verify for product add to cart successfully SignIn to MyStore
		String myAccount = driver.findElement(By.xpath("//h1[contains(.,'My account')]")).getText();
		Thread.sleep(1000);
		System.out.println(myAccount);
		Assert.assertEquals("MY ACCOUNT", myAccount);
		System.out.println("actualvalue is = " + myAccount);
		Thread.sleep(1000);
	}
}
