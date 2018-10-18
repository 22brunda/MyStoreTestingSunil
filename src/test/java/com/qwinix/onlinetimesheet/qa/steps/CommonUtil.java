package com.qwinix.onlinetimesheet.qa.steps;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qwinix.onlinetimesheet.qa.BaseDriver;

public class CommonUtil {

	//click on MAIN Menu
	public static BaseDriver objBD = new BaseDriver();
	public static WebDriver driver= objBD.driver;

	public void SelectAnyScheduledDates(String date,String name)
	{
		WebElement select = driver.findElement(By.xpath("(//div[@class='fc-day-grid fc-unselectable']//td[contains(.,'"+date+"')]/../../../../../..//span[contains(text(),'"+name+"')])[1]"));

		if(select.isDisplayed())
		{
			select.click();
		}
		else
		{
			System.out.println("events not scheduled");
		}
	}

	//select the DropDown using "select by visible text", pass VisibleText 
	public static void selectByVisibleText(WebElement WE, String VisibleText)
	{
		try
		{
			Select selObj=new Select(WE);
			selObj.selectByVisibleText(VisibleText);
		}
		catch(Exception e)
		{
			return ;
		}
	}

	//select the DropDown using "select by index", so pass IndexValue '
	public static void selectByIndex(WebElement WE, int IndexValue)
	{
		try
		{
			Select selObj=new Select(WE);
			selObj.selectByIndex(IndexValue);
		}
		catch(Exception e)
		{
			return ;
		}
	}

	//select the DropDown using "select by value", so pass Value 
	public static void selectByValue(WebElement WE, String Value)
	{
		try
		{
			Select selObj=new Select(WE);
			selObj.selectByValue(Value);
		}
		catch(Exception e)
		{
			return ;
		}
	}

	//Wait for the Element
	public static void waitForElement(WebElement WE)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(WE));
	}
	
	//Wait for the Element to be found
	public void waitTillElementFound(WebElement ElementTobeFound,int seconds)
	{
		WebDriverWait wait = new WebDriverWait(driver,seconds);
		wait.until(ExpectedConditions.visibilityOf(ElementTobeFound));

	}

	//Wait for the Element presence
	public static void waitTillPresenceElement(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}
	
	//Wait for the Element to be visibility
	public static void waitTillElementVisibility(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

	public static void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public static void waitForPageLoaded()
	{
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() 
		{
			public Boolean apply(WebDriver driver) 
			{
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
			}
		};
		try {
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(expectation);
		} 
		catch (Throwable error)
		{
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}

	public static String getCellValue(String xl, String Sheet, int r, int c)
	{
		try
		{
			FileInputStream fis = new FileInputStream(xl);
			Workbook wb = WorkbookFactory.create(fis);
			Cell cell = wb.getSheet(Sheet).getRow(r).getCell(c);
			return cell.getStringCellValue();
		}catch (Exception e)
		{
			return "";
		}
	}

	public static int getRowCount(String xl, String Sheet)
	{
		try
		{
			FileInputStream fis = new FileInputStream(xl);
			Workbook wb = WorkbookFactory.create(fis);
			return wb.getSheet(Sheet).getLastRowNum();
		}catch (Exception e)
		{
			return 0;
		}
	}
}