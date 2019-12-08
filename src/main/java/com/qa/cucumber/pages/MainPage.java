package com.qa.cucumber.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.cucumber.base.TestBase;

public class MainPage extends TestBase{

	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement Home;
	
	@FindBy(xpath="//a[contains(text(),'AjaxCall')]")
	WebElement AjaxCall;
	
	@FindBy(xpath="//a[contains(text(),'Form')]")
	WebElement Form;
	
	@FindBy(xpath="//ul[@class='nav navbar-nav']//a[contains(text(),'Controls')]")
	WebElement Controls;
	
	@FindBy(xpath="//a[contains(text(),'Widgets')]")
	WebElement Widgets;
	
	@FindBy(xpath="//a[contains(text(),'Actions')]")
	WebElement Actions;
	
	@FindBy(xpath="//a[contains(text(),'Switch to')]")
	WebElement SwitchTo;
	
	@FindBy(xpath="//a[contains(text(),'Select')]")
	WebElement Select;
	
	public MainPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateLoginPageTitle()
	{
		String title=driver.getTitle();
		Assert.assertEquals(title, "Testing Controls");
	}
	
	public HomePage clickOnHome()
	{
		Home.click();
		//http://uitestpractice.com/Students/Index
		return new HomePage();
	}
	
	public AjaxCallPage clickOnAjaxCall()
	{
		AjaxCall.click();
		return new AjaxCallPage();
	}
	
	public FormPage clickOnForm()
	{
		Form.click();
		return new FormPage();
	}
	
	public ControlsPage clickOnControls()
	{
		Controls.click();
		return new ControlsPage();
	}
	public WidgetsPage clickOnWidgets()
	{
		Widgets.click();
		return new WidgetsPage();
	}
	public ActionsPage clickOnActions()
	{
		Actions.click();
		return new ActionsPage();
	}
	
	public SwitchToPage clickOnSwitchTo()
	{
		SwitchTo.click();
		return new SwitchToPage();
	}
	
	public SelectPage clickOnSelect()
	{
	Select.click();
	return new SelectPage();
	}
}
