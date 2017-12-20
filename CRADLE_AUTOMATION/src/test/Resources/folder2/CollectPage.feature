Feature: EDF Cradle Collect Page 

@Test1
Scenario: Build input fields for collect screen to add a new item 

#	Given Navigate to the login page 
#	When  Enter Username 
#		|sekharreddy.04.08| 
#	And   Enter Pin 
#		|251217| 
#	And   Click Submit button 
#	# Build input fields for collect screen to add a new item
	
	# action: pre-condition:
	And  I am on the Collect tab 
	When I click in the Description field 
	Then I see the menu box with 12 different options, Bag, Vacuum Bag,Bypass Blowdown filter, Cylindrical HEPA filter, Cuboid HEPA filter, DSE Filter, Pre-Filter, Charcoal Filter, Liquid, Resin, Sludge, Loose Item 
	And  I select any type of filter e.g. HEPA filter 
	When I click in the Origin field 
	Then I see the menu box with with 15 different options Active Chemistry Laboratory,Active Effluent Treatment Plant,Active Laundry,Auxiliary Gas Plant,Control Rod Mechanism Maintenance Room,Decontamination Workshop, Flask Handling Area,Gas Circulator Lubrication Oil Slump, Gas Ciculator Maintenance Workshop, IFDF, Main Change Room, Nose Unit Maintenance Position,Pile Cap, Plug Unit Maintenance Facility 
	When I click in the Stored field 
	Then I see ten different options, FBseventeen Waste Reciept Room, FBsixteen Waste sorting room, FBtwentyfour Rthree Store, FBtwentyfour Rfour Store, FG Bypass Blowdown Filter Decay Store, Solvent Store, Decontamination Workshop, Incinerator Building, Oil Storage Container, Other specify in free text 
	When I click in the Date icon 
	And I can see the pop up calendar 
	And I click save 
	
	When I click in the Dose icon 
	Then a pop up window will display with three options Contact Dose Rate uSvh free text box save and cancel 
	And I can see the Dose rate reading box, 
	When I enter a value greater than 50 uSvh 
		|55|
	Then a second data field AtDose uSvh should be displayed or become active 
	And  Click cancel button to return to collect page 
	
	When I click in the mkg icon 
	Then a pop up window with 4 options Volume (m3) and Weight (kg) will appear with free text field, save and cancel 
	And  Click on cancel button to return from m3page 
	When I click in the Notes icon 
	And Click on Cancel button to return to collect page from Notes Page 
	
	
	
	@Test1
Scenario: Calendar pop ups to default to today's date 
## Calendar pop ups to default to today's date
## action: pre-condition: Given I am on the Collect tab
## action: pre-condition: And I have entered data in Description,Orign and Stored fields
## action: pre-condition: Given I can see the pop up calendar

#	Given Navigate to the login page 
#	When  Enter Username 
#		|sekharreddy.04.08|  
#	And   Enter Pin 
#		|654321| 
#	And   Click Submit button 
#	When I click in the Description field 
#	And  I select any type of filter e.g. HEPA filter 
#	When I click in the Origin field 
#	And  Select a value workshop from Orign field 
#	When I click in the Stored field 
#	And  Select a value selected form stored field 

	When I click in the Date icon 
	And I can see the pop up calendar 
	When i select a future date 
	Then I should see an error message 
		|Date cannot be in the future| 
		# result: "Date cannot be in the future" with the date chosen displayed below
		
	And Click on ok to return to calender page 
	And Return to home page of collect from date page 
	
	
	
	
	@Test1
Scenario: Flag if the contact dose rate 50 uSv hr 
## Flag if the contact dose rate 50 uSv hr
## action: pre-condition: Given I am on the Collect tab
## action: pre-condition: Given I am on the Collect tab

#	Given Navigate to the login page 
#	When  Enter Username 
#		|sekharreddy.04.08|  
#	And   Enter Pin 
#		|654321| 
#	And   Click Submit button 
#	When I click in the Description field 
#	And  I select any type of filter e.g. HEPA filter 
#	When I click in the Origin field 
#	And  Select a value workshop from Orign field 
#	When I click in the Stored field 
#	And  Select a value selected form stored field 
#	When I click in the Date icon 
#	And I click save 

	When I click in the Dose icon 
	When any measurement recorded greater than 50 uSvhr 
		|50|
	Then a second box appears with the descripton DoseRate at 0.5m uSvh 
	When I enter a reading into the Dose rate box and click save 
	Then both values are saved 
	
	
@Test1
Scenario: Green Ticks on Collect Screen input field 
## Green Ticks on Collect Screen input field
## action: pre-condition: Given I am on the collect page

#	Given Navigate to the login page 
#	When  Enter Username 
#		|sekharreddy.04.08|
#	And   Enter Pin 
#		|654321| 
#	And   Click Submit button 
#	When I click in the Description field 
#	And  I select any type of filter e.g. HEPA filter 
#	When I click in the Origin field 
#	And  Select a value workshop from Orign field 
#	When I click in the Stored field 
#	And  Select a value selected form stored field 
#	When I click in the Date icon 
#	And I click save 

	When I click in the Dose icon 
	When any measurement recorded greater than 50 uSvhr 
		|50|
	Then a second box appears with the descripton DoseRate at 0.5m uSvh 
	When I enter a reading into the Dose rate box and click save 
	Then both values are saved 
	When I click in the mkg icon 
	Then a pop up window with 4 options Volume (m3) and Weight (kg) will appear with free text field, save and cancel 
	And Enter value for weight in volume page m3 
		|1|
	And  Save the details entered for Volume page 
	
	When I click in the Dose icon 
	And i clear the data dose level of m3 page 
	When any measurement recorded greater than 50 uSvhr 
		|55|
	Then a second box appears with the descripton DoseRate at 0.5m uSvh 
	When I enter a reading into the Dose rate box and click save 
	And Click on save button for Dose m3 page 
	
	When I click in the mkg icon 
	Then a pop up window with 4 options Volume (m3) and Weight (kg) will appear with free text field, save and cancel 
	And  i clear the value for weight first on m3 page 
	And Enter value for weight in volume page m3 
		|3|
	And  Save the details entered for Volume page 
	
	
	@Test1
Scenario: Waste item list View (filter) functionality 
## action: pre-condition: Given I am on the Collect tab
## action: pre-condition: And i click the View by buttonÂ 



#	Given Navigate to the login page 
#	When  Enter Username 
#		|sekharreddy.04.08|
#	And   Enter Pin 
#		|654321| 
#	And   Click Submit button 


	When I select View All from the option displayed on the pop up window 
	# Then all items are arranged in date order descending
	When i select Bags from the option displayed on the pop up window 
	Then only the "Bag" items are displayed and arranged in date order descending 
	When i select Vacuum Bag from the option displayed on the pop up window  
	Then only the "Vacuum Bag" items are displayed and arranged  in date order descending 
	When i select ByPass Blowdown filter from the option displayed on the pop up window  
	Then only the "Bypass Blowdown Filter" items are displayed and arranged in date order descending 
	When i select Charcoal Filter from the option displayed on the pop up window  
	Then only the "Charcoal Filter" items are displayed and arranged in date order descending 
	When i select Cuboid HEPA filter from the option displayed on the pop up window  
	Then only the "Cuboid HEPA Filter" items are displayed and arranged in date order descending 
	When i select Cylindrical HEPA filterfrom the option displayed on the pop up window  
	Then only the "Cylindrical HEPA Filter" items are displayed and arranged in date order descending 
	When i select DSE Filter from the option displayed on the pop up window  
	Then only the "DSE Filter" items are displayed and arranged in date order descending 
	When i select Pre-Filter from the option displayed on the pop up window  
	Then only the "Pre-Filter" items are displayed and arranged in date order descending 
	When i select Liquid from the option displayed on the pop up window  
	Then only the "Liquid" items are displayed and arranged in date order descending 
	When i select Resin from the option displayed on the pop up window  
	Then only the "Resin" items are displayed and arranged in date order descending 
	When i select Sludge from the option displayed on the pop up window  
	Then only the "Sludge" items are displayed and arranged in date order descending 
	When i select Loose Item from the option displayed on the pop up window  
	Then only the "Loose Item" items are displayed and arranged in date order descending 
	
	
	@Test1
Scenario: Waste item list sort Store Procedure 
## Waste item list sort Store Procedure
## action: pre-condition: Given I am on the Collect tab
## action: pre-condition: And i click the Sort by buttonÂ 

#	Given Navigate to the login page 
#		When  Enter Username 
#	|sekharreddy.04.08|
#	And   Enter Pin 
#	|654321| 
#	And   Click Submit button 

	When I select Date from the option displayed on the pop up window 
	#Then all items are arranged in date order (ascending) 
	Then items are displayed as per "Date" 
	When i select Origin from the option displayed on the pop up window  
	#Then all items are arranged by Origin of where the waste items were collected from (alphabetically) 
	Then items are displayed as per "Origin" 
	When i select ID from the option displayed on the pop up windowÂ  
	#Then all items are arranged in order of item ID (numerically) 
	Then items are displayed as per "ID" 
	When i select Stream from the option displayed on the pop up windowÂ  
	#Then all items are arranged by waste Stream 
	#And display the Origin shortcode (alphabetically) 
	Then items are displayed as per "Stream" 
	When i select Stored from the option displayed on the pop up windowÂ  
	#Then all items are arranged by where the collected waste item is stored. (alphabetically) 
	Then items are displayed as per "Stored" 
	
@Test1	
Scenario: View and Sort pop up boxes not aligned with button 
## View and Sort pop up boxes not aligned with button
## action: pre-condition: Given I want to filter or sort the item list
	
	
	When I select View All from the option displayed on the pop up window 
	When I select Sortby dropdown 
	Then  the associated dropdown is shown for Sortby 
	
	
	
	
@Test1
Scenario: Show unique ID when Waste Item is submitted when working on line 
## Show unique ID when Waste Item is submitted when working on line
## action: pre-condition: Given I am on the collect page
## action: pre-condition: And I am on line
## action: pre-condition: And have input all required data for a waste item
## action: pre-condition: Given I see a popup window with the uniqueID, and options to accept Yes or No
## action: pre-condition: Given I see a popup window with the uniqueID, and options to accept Yes or No



#	Given Navigate to the login page 
#	When  Enter Username 
#	|sekharreddy.04.08|
#	And   Enter Pin 
#	|251217| 
#	And   Click Submit button 
#	When I click in the Description field 
#	And  I select any type of filter e.g. HEPA filter 
#	When I click in the Origin field 
#	And  Select a value workshop from Orign field 
#	When I click in the Stored field 
#	And  Select a value selected form stored field 
#	When I click in the Date icon 
#	And I click save 
#	When I click in the Dose icon 
#	When any measurement recorded greater than 50 uSvhr 
#		|50|
#	Then a second box appears with the descripton DoseRate at 0.5m uSvh 
#	When I enter a reading into the Dose rate box and click save 
#	Then both values are saved 
#	When I click in the mkg icon 
#	Then a pop up window with 4 options Volume (m3) and Weight (kg) will appear with free text field, save and cancel 
#	And Enter value for weight in volume page m3 
#		|1|
#	And  Save the details entered for Volume page 


	When I press the submit button 
	Then I see a popup window with the uniqueID, and options to accept Yes or No 
	When I press the No option 
	Then the popup window should disappear, and uniques ID will still be available for use 
	When I press the submit button 
	When I press the Yes option 
	Then I see an item created with the same uniqueID 
	And i click on process tab 
	Then verify it on process page and delete it
	Then verify if the item is deleted from page 
	
	
	
	
@Test1
Scenario: Verify if the created waste in collect passes to process and package on submission
## Show unique ID when Waste Item is submitted when working on line
## action: pre-condition: Given I am on the collect page
## action: pre-condition: And I am on line
## action: pre-condition: And have input all required data for a waste item
## action: pre-condition: Given I see a popup window with the uniqueID, and options to accept Yes or No
## action: pre-condition: Given I see a popup window with the uniqueID, and options to accept Yes or No



#	Given Navigate to the login page 
#	When  Enter Username 
#	|sekharreddy.04.08|
#	And   Enter Pin 
#	|251217| 
#	And   Click Submit button 
	And  I am on the Collect tab 
	When I click in the Description field 
	And  I select any type of filter e.g. HEPA filter 
	When I click in the Origin field 
	And  Select a value workshop from Orign field 
	When I click in the Stored field 
	And  Select a value selected form stored field 
	When I click in the Date icon 
	And I click save 
	When I click in the Dose icon 
	When any measurement recorded greater than 50 uSvhr 
		|50|
	Then a second box appears with the descripton DoseRate at 0.5m uSvh 
	When I enter a reading into the Dose rate box and click save 
	Then both values are saved 
	When I click in the mkg icon 
	Then a pop up window with 4 options Volume (m3) and Weight (kg) will appear with free text field, save and cancel 
	And Enter value for weight in volume page m3 
		|1|
	And  Save the details entered for Volume page 


	When I press the submit button 
	Then I see a popup window with the uniqueID, and options to accept Yes or No 
	When I press the No option 
	Then the popup window should disappear, and uniques ID will still be available for use 
	When I press the submit button 
	When I press the Yes option 
	Then I see an item created with the same uniqueID 
	And i click on process tab 
	Then wait for the spinner to disable
	Then Click submit button for recently created waste
	And Click yes for submission for recently created waste
	And  I am on the Collect tab 
	And I Click on Package Tab 
	And I select an Item 
	And Select cancel button of package page
	And Click ok to delete waste from package
	
	
	
	
	
   