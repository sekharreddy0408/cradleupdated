Feature: EDF Login Page 

@Test1
Scenario: Initial log in create password (pin) GDRW - 359 
## Initial log in create password (pin)
## action: pre-condition: Given that I am provided with an initial password (pin)


	Given Navigate to the login page 
	When  Enter Username 
		|sekharreddy.04.08| 
	Then Username is in first.last format (email ID) 
	And   Enter Pin 
		|251217|
	And Click on resetpin button 
	## result: Page has @edf-energy.com pre defined (@gmail.com used for testing)
	Then I see a reset pin page, with options to reset or cancel and enter old pin 
		|251217|	
		## result: Password/PIN must be 6 digits
	When I enter that password 
		|123676|verifying will not accept 3 consecutive digits|
	When I confirm pin and click reset 
		|123676|
	Then Verify error message resetpin 
	## result: it will not accept 3 consecutive digits
	And  I click on button for reset 
	When I enter that password 
		|999675|verifying will not accept 3 consecutive digits|
	When I confirm pin and click reset 
		|999675|
		## result: it will not accept 3 digits the same
	Then Verify error message resetpin 
	And  I click on button for reset 
	And I click on cancel button to return to login page 
	And   Enter Pin 
		|251217|
	And   Click Submit button 
	Then  Verify the loggedin user 
		|Chandra Puli|
		
@Test1 
Scenario: Classify all information as Protect - Proprietary - GDRW-75 
## action: pre-condition: When I generate the excel report


	And I click on the Cloud icon 
	Then the report and labels will have appropriate information classification marking Protect Proprietary 
	
	
	
	
Scenario: Navigate to the login page 

	Given Navigate to the login page 
	When  Enter Username 
	And   Enter Pin 
	And   Click Submit button 
	Then  Verify the loggedin user 
		|Chandra Puli|
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    