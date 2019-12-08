Feature:Create New User Functionality
	@Test1
	Scenario Outline:Test create new user functionality
		Given User navigate to home page
		Then click on create new button
		Then user enters "<firstname>" and "<lastname>" and "<date>"
		#Then user on home page 
	Examples:
		| firstname | lastname | date |
		| abc       | abc      |5/7/19|