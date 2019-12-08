package com.qa.cucumber.stepDefinitions;

import com.qa.cucumber.base.TestBase;
import com.qa.cucumber.pages.HomePage;
import com.qa.cucumber.pages.MainPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomeStepDefinition extends TestBase{

	MainPage mainPage;
	HomePage homePage;
	public HomeStepDefinition()
	{
		super();
	}
	
	
	@Given("User navigate to home page")
	public void user_navigate_to_home_page() {
		initialization();
		mainPage=new MainPage();
		mainPage.clickOnHome();
	}

	@Then("click on create new button")
	public void click_on_create_new_button() {
	  homePage.clickOnCreateUser();
	}

	@Then("user enters {string} and {string} and {string}")
	public void user_enters_and_and(String firstName, String lastName, String eDate) {
	    homePage.createNewUser(firstName,lastName,eDate);
	}
}
