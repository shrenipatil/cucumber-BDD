package com.qa.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.cucumber.base.TestBase;

public class HomePage extends TestBase {

	
	
	@FindBy(xpath="//a[contains(text(),'Create New')]")
	WebElement createUserBtn;
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='EnrollmentDate']")
	WebElement enrollmentDate;
	
	@FindBy(xpath="//input[@class='btn btn-default']")
	WebElement creatBtn;
	
	public void clickOnCreateUser()
	{
		createUserBtn.click();
	}
	
	public HomePage createNewUser(String userFirstName,String userLastNameData,String UserEDate)
	{
		//createUserBtn.click();
		firstName.sendKeys(userFirstName);
		lastName.sendKeys(userLastNameData);
		enrollmentDate.sendKeys(UserEDate);
		creatBtn.click();
		return new HomePage();
	}
}
