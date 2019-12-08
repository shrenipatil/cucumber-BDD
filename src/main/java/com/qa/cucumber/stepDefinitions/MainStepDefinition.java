package com.qa.cucumber.stepDefinitions;

import com.qa.cucumber.base.TestBase;
import com.qa.cucumber.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class MainStepDefinition extends TestBase{

	MainPage mainPage;
	public MainStepDefinition()
	{
		super();
	}
	
	@Given("^User navigate to website URL$")
	public void user_navigate_to_website_URL() throws Throwable {
		initialization();
		mainPage=new MainPage();
	}

	@When("^title of main page is Testing Control$")
	public void title_of_main_page_is_Testing_Control() throws Throwable {
		mainPage.validateLoginPageTitle();
	}
	
	@When("^User click on Home link,then the Home page opens$")
	public void user_click_on_Home_link_then_the_Home_page_opens() throws Throwable {
	    mainPage.clickOnHome();
	}

	@When("^User click on AjaxCall link,then the AjaxCall page opens$")
	public void user_click_on_AjaxCall_link_then_the_AjaxCall_page_opens() throws Throwable {
	    mainPage.clickOnAjaxCall();
	}

	@When("^User click on Form link,then the Form page opens$")
	public void user_click_on_Form_link_then_the_Form_page_opens() throws Throwable {
	  mainPage.clickOnForm();
	}

	@When("^User click on Controls link,then the Controls page opens$")
	public void user_click_on_Controls_link_then_the_Controls_page_opens() throws Throwable {
			mainPage.clickOnControls();
	}

	@When("^User click on Widgets link,then the Widgets page opens$")
	public void user_click_on_Widgets_link_then_the_Widgets_page_opens() throws Throwable {
	   mainPage.clickOnWidgets();
	}

	@When("^User click on Actions link,then the Actions page opens$")
	public void user_click_on_Actions_link_then_the_Actions_page_opens() throws Throwable {
	  mainPage.clickOnActions();
	  
	}

	@When("^User click on SwitchTo link,then the SwitchTo page opens$")
	public void user_click_on_SwitchTo_link_then_the_SwitchTo_page_opens() throws Throwable {
	  mainPage.clickOnSwitchTo();  
	}

	@When("^User click on Select link,then the Select page opens$")
	public void user_click_on_Select_link_then_the_Select_page_opens() throws Throwable {
	   mainPage.clickOnSelect();
	}
		
}
