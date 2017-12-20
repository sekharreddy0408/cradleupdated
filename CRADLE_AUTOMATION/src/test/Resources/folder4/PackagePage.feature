Feature: EDF Cradle Package Page 




@Test1 
Scenario: Build packages multiple item  GDRW-367 


	And  I am on the Collect tab 
	And I Click on Package Tab 
	When I select a package 
	And I select an Item 
	And I select multiple Items 
	And I Click on pack items button 
	Then I will see a pop up displaying This will add item to package with options to click cancel or ok 
		|This will add 2 items to package ID HE1/10111.|
	And I Click on cancel packitems of package page 
	
	And I Click on pack items button 
	And I Click on ok packitems of package page 
	Then I Click on the list of package box 
	Then I Click on cancel button of item 
	And Click on yes to send the item back to package page 
	And Cancel addedlist multiple packagebox 
	And Click on yes to send the item back to package page 
	And Click on main page to return to main page of package 
	
	
	
	
	
@Test1 
Scenario: View information about a package GDRW-460 

## View information about a package
## action: pre-condition:
## action: pre-condition: 

	And Click on LHS of package icon 
	Then I see information date,description,stream,sorage location,route about a package 
		|12/12/2017|Solid Drum SCOT|C|FB24 - R4 Store|Offsite Incineration|
	And Click on main page to return to main page of package 
	#And Click on yes to send the item back to package page 
	
	
	
@Test1 
Scenario: Package weight/volume information GDRW-404 
## Package weight/volume information
## action: pre-condition: Given i am on the package screen
## action: pre-condition: And I select package - package highlighted


	When i click the middle icon 
	And I click on Weight tab 
	Then it should accept positive numbers only 
	
	When I click on cancel 
	# Then the pop up Are you sure you want to close, you will lose any unsaved data appears
	
	
	When i click the middle icon 
	And I click on Weight tab 
	When I click on save 
	
	
@Test1 
Scenario: Process list View by  GDWR-401 



	When I select View All from the option displayed on the pop up window for package page 
	Then all items are arranged in date order (descending) for package page 
	
	When i select Bags from the option displayed on the pop up windowÂ for package page 
	Then Only the bag items are displayed 
	
	When I select View All from the option displayed on the pop up window for package page 
	When i select Vacuum Bag from the option displayed on the pop up windowÂ for package page 
	Then Only the Vacuum Bag items are displayed 
	When I select View All from the option displayed on the pop up window for package page 
	When i select ByPass Blowdown filter from the option displayed on the pop up windowÂ for package page 
	Then  Only the ByPass Blowdown filter items are displayed for package page 
	When I select View All from the option displayed on the pop up window for package page 
	When i select Charcoal Filter from the option displayed on the pop up windowÂ for package page 
	Then Only the Charcoal Filter filter items are displayed for package page 
	When I select View All from the option displayed on the pop up window for package page 
	When i select Cuboid HEPA Filter from the option displayed on the pop up windowÂ for package page 
	Then Only the Cuboid HEPA Filter filter items are displayed for package page 
	When I select View All from the option displayed on the pop up window for package page 
	When i select Cylindrical HEPA filterfrom the option displayed on the pop up windowÂ for package page 
	Then Only the Cylindrical HEPA filter items are displayed for package page 
	When I select View All from the option displayed on the pop up window for package page 
	When i select DSE Filter from the option displayed on the pop up windowÂ for package page 
	Then Only the DSE Filter items are displayed for package page 
	When I select View All from the option displayed on the pop up window for package page 
	When i select Pre-Filter from the option displayed on the pop up windowÂ for package page 
	Then Only the Pre-Filter items are displayed for package page 
	When I select View All from the option displayed on the pop up window for package page 
	When i select Liquid from the option displayed on the pop up windowÂ for package page 
	Then Only the Liquid items are displayed for package page 
	When I select View All from the option displayed on the pop up window for package page 
	When i select Loose Item from the option displayed on the pop up windowÂ for package page 
	Then Only the Loose items items are displayed for package page 
	When I select View All from the option displayed on the pop up window for package page 
	When i select Resin from the option displayed on the pop up windowÂ for package page 
	Then Only the Resin items are displayed for package page 
	When I select View All from the option displayed on the pop up window for package page 
	When i select Sludge from the option displayed on the pop up windowÂ for package page 
	Then Only the Sludge items items are displayed for package page 
	
@Test1 
Scenario: Process list SortBy by  GDWR-400 



	When I click on the SortBy dropdown 
	When I select Date of the options 
	Then all the list is sorted as per date 
	When I click on the SortBy dropdown 
	When I select ID of the options 
	Then all the options are sorted as per ID 
	When I click on the SortBy dropdown 
	When I select Origin of the options 
	Then all the options are sorted as per Origin 
	When I click on the SortBy dropdown 
	When I select stored of the options 
	Then all the options are sorted as per Stored 
	When I click on the SortBy dropdown 
	When I select stream of the options 
	Then all the options are sorted as per Stream 
	
	
	
	
	
@Test1 
Scenario: Generate Unique Package ID GDRW-377 

## Generate Unique Package ID
## action: pre-condition: Given I am on the package screen
## action: pre-condition: And I have clicked on create a package

	When I click on CREATE NEW PACKAGE 
	
	Then I can select a unique package ID as per agreed and designed format 
	Then I verify the size of the dropdown 
	When select_uniqueid_from_packageiddropdown 
	When I select the Description 
	Then Verify all the elements in description 
	Then select option description newpackage 
	When Click on stored newpackage 
	Then Verify items on stored package page 
	Then Select option in stored newpackage 
	When select Stream 
	Then verify all the options in stream 
	Then select Stream Option in package 
	Then select Route dropdown in package 
	Then Verify the options in dropdown route in package 
	Then select route dropdown option 
	When select_prechecksoption 
	Then Click on cancel button of create new package 
	
	
	#When Clickon submitbutton newpackage 
	#-- Then I can see a package displayed on the screen with the unique ID
	#When I click on CREATE NEW PACKAGE 
	#Then I can select a unique package ID as per agreed and designed format 
	#And the ID will no longer be available to select in the create new package list 
	
	
	
@Test1 
Scenario: Submit Package details 
## Submit Package details
## action: pre-condition: Given i am on the package screen
## action: pre-condition: And I select package - package highlighted
## action: pre-condition: And I have entered content data

##Then the pop up will display an error if Mandatory data missing for: 
## result: Dose rate
## result: Volume Weight
## result: if no waste items are in the package
## result: if package contents percentage is not equal to 100 per cent

	When I click on submit 
	And Click on x for mandatoryfields not complete 
	Then I select mandatory fields complete fields package 
	When I click on submit with complete fields 
	And all mandatory fields are complete 
	When I click on x button, 
	#	When I click on submit with complete fields 
	#And all mandatory fields have been entered then item is moved to Consign screen. 
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	########
	
	
Scenario: Build packages single item  GDRW-367 
# Build packages
# action: pre-condition: Given I am on the package screen
# action: pre-condition: And there are Items displayed
# action: pre-condition: And I have created a package
	Given Navigate to the login page 
	When  Enter Username 
		|sekharreddy.04.08| 
	And   Enter Pin 
		|654321|
	And   Click Submit button 
	
	And I Click on Package Tab 
	When I select a package 
	And I select an Item 
	And I Click on pack items button 
	Then I will see a pop up displaying This will add item to package with options to click cancel or ok 
	# result: If I click cancel the item remains in list and the pop up disappears
	# result: If I click ok the Item is added to the package and it dissappears from the list
	
	And I Click on cancel packitems of package page 
	
	And I Click on pack items button 
	And I Click on ok packitems of package page 
	Then I Click on the list of package box 
	Then I Click on cancel button of item 
	And Click on yes to send the item back to package page 
	And Click on main page to return to main page of package 
	