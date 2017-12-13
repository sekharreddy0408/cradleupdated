Feature: EDF Cradle Process Page 




Scenario: Process a Waste Item - Delete  GDRW-369 
# Process a Waste Item - Delete
# action: pre-condition: Given I am displaying the process items list
	Given Navigate to the login page 
	When  Enter Username 
		|sekharreddy.04.08| 
	And   Enter Pin 
		|654321|
	And   Click Submit button 
	And i click on process tab 
	
	When I press the Delete icon 
	Then the item is removed from the displayed list 
	
	
	
Scenario: Process a Waste Item - Submit  GDRW-371 
# Process a Waste Item - Submit
# action: pre-condition: Given that the Process list item is displayed



	When I click submit for a waste item with incomplete fields 
	Then the following text appears: Incomplete Data, Mandatory Data Missing: Date, Dose, Volume 
	Then click on cancel button for errormessage page 
	When I click submit for a waste item with complete fields 
	When the no has been clicked (i.e. submission of list item has not been confirmed) 
	Then the submit modal closes. 
	#When the yes has been clicked (i.e. submission of list item has been confirmed)
	#Then the list item is removed from the Process and Collect Screen list and available to the packaging process
	
	
@tocomplete 
Scenario: Package Screen, Display items, view and sortby  GDRW-372 
# Package Screen, Display items, view and sortby
# action: pre-condition: Given items have been saved in the Collect screen
# action: pre-condition: And submitted in the Process Screen
	When I select the Package Screen 
	Then the same list of waste items is displayed as icons with Item ID and Waste Stream displayed (as in the Invision designs) 
	When I select the Package Screen 
	And the items are removed from both the Collect and Process screens 
	
	
	
	
	
	
	
	
Scenario: Process list View by  GDRW-374 

# Process list View by
# action: pre-condition: Given I am on the Process  tab
# action: pre-condition: And i click the View by buttonÂ 


	When I select View All from the option displayed on the pop up window for process page 
	Then all items are arranged in date order (descending) for process page 
	
	When i select Bags from the option displayed on the pop up windowÂ for process page 
	Then only the Bag items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select Vacuum Bag from the option displayed on the pop up windowÂ for process page 
	Then only the Vacuum Bag items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select ByPass Blowdown filter from the option displayed on the pop up windowÂ for process page 
	Then only the ByPass Blowdown filter items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select Charcoal Filter from the option displayed on the pop up windowÂ for process page 
	Then only the Charcoal Filter items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select  Cuboid HEPA filter from the option displayed on the pop up windowÂ for process page 
	Then only the  Cuboid HEPA filter items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select Cylindrical HEPA filterfrom the option displayed on the pop up windowÂ for process page 
	Then only the Cylindrical HEPA filter items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select DSE Filter from the option displayed on the pop up windowÂ for process page 
	Then only the DSE Filteritems are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select Pre-Filter from the option displayed on the pop up windowÂ for process page 
	Then only the Pre-Filter items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select Liquid from the option displayed on the pop up windowÂ for process page 
	Then only the Liquid items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select Loose Item from the option displayed on the pop up windowÂ for process page 
	Then only the Loose items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select Resin from the option displayed on the pop up windowÂ for process page 
	Then only the Resin items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	When i select Sludge from the option displayed on the pop up windowÂ for process page 
	Then only the Sludge items are displayed and arranged  in date order (descending) for process page 
	When I select View All from the option displayed on the pop up window for process page 
	And  Select viewall option from dropdown 
	
	
Scenario: Process List Sort by GDRW - 375 
# Process List Sort by
# action: pre-condition: Given I am on the Process tab
# action: pre-condition: And i click the Sort by buttonÂ 

	When I select SORTBY from the option displayed on the pop up window for process page 
	When I select Date from the option displayed on the pop up window for process page 
	Then all items are arranged in date order (ascending) for process page 
	When I select SORTBY from the option displayed on the pop up window for process page 
	When i select ID from the option displayed on the pop up windowÂ for process page 
	Then all items are arranged in order of item ID (numerically) for process page 
	When I select SORTBY from the option displayed on the pop up window for process page 
	When i select Origin from the option displayed on the pop up windowÂ for process page 
	Then all items are arranged in order of item Origin (alphabetically) for process page 
	When I select SORTBY from the option displayed on the pop up window for process page 
	When i select Stored from the option displayed on the pop up windowÂ for process page 
	Then all items are arranged by waste Stored (alphabetically) for process page 
	When I select SORTBY from the option displayed on the pop up window for process page 
	When i select Stream from the option displayed on the pop up windowÂ for process page 
	Then all items are arranged by waste Stream (alphabetically) for process page 
	
	
	

Scenario: Process a Waste Item - Fields GDWR353 
# Process a Waste Item - Fields
# action: pre-condition: Given there are waste items in the Process tab

	Given Navigate to the login page 
	When  Enter Username 
		|sekharreddy.04.08| 
	And   Enter Pin 
		|654321|
	And   Click Submit button 
	And i click on process tab 
	
	And i click on date icon 
	And i click on save button on Date 
	
	And i Click on dose icon of process page 
	
		And  i change on contact dose rate 
			|51| 
		And  i click on save button for dose process page 
		And i Click on dose icon of process page 
		When i click on cancel button for dose process page 
		And i click on yes button for dose process page 
		When i click on mthree icon of process page 
		And  i edit value for volume for process page 
			|12| 
		And i edit value for weight for process page 
			|2| 
		Then i click on save button for mthree process page 
		When i click on mthree icon of process page 
		And  i click on cancel button for mthree icon 
		And i click on yes for mthree button process page 
	
	
Scenario: Process a Waste Item - Fields GDWR353 
# Process a Waste Item - Fields
# action: pre-condition: Given there are waste items in the Process tab

	Given Navigate to the login page 
	When  Enter Username 
		|sekharreddy.04.08| 
	And   Enter Pin 
		|654321|
	And   Click Submit button 
	And i click on process tab 
	
	And i click on date icon 
	And i click on save button on Date 
    