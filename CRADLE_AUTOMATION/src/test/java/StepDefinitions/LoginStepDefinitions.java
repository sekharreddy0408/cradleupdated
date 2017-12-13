package StepDefinitions;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import Methods.methodsforlogin;

//import org.openqa.selenium.support.PageFactory;

import Utilities.UtilFile;
import Utilities.WebConnector;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {

	public methodsforlogin LG;

	public LoginStepDefinitions() {
		LG = PageFactory.initElements(WebConnector.openbrowser(), methodsforlogin.class);
	}

	@Before()
	public void openBrowser() throws InterruptedException {
		WebConnector.openbrowser();
		UtilFile.gotourl();
	}

	@Given("^Navigate to the login page$")
	public void Navigate_to_the_login_page() {
		System.out.println("Navigate_to_the_login_page");

	}

	@When("^Enter Username$")
	public void Enter_Username(DataTable userNAME) {
		List<List<String>> data = userNAME.raw();
		LG.usernamerlogin(data.get(0).get(0));
		System.out.println("Username Entered");
		

	}
	
	

	@And("^Enter Pin$")
	public void Enter_Pin(DataTable pin) {
		List<List<String>> data = pin.raw();
		LG.Pinlogin(data.get(0).get(0));
		System.out.println("Pin entered");
	}

	@And("^Click Submit button$")
	public void Click_Submit_button() {
		System.out.println("Click Submit button");
		LG.Loginbutton();

	}

	@Then("^Verify the loggedin user$")
	public void Verify_the_loggedin_user(DataTable usercredentials) {
		List<List<String>> data = usercredentials.raw();
		LG.validateloggeduser(data.get(0).get(0));
		
	}

	@And("^I click on the Cloud icon$")
	public void I_click_on_the_Cloud_icon() {
		System.out.println("I click on the Cloud icon");
		LG.Click_on_cloud_icon();

	}

	@Then("^the report and labels will have appropriate information classification marking Protect Proprietary$")
	public void the_report_and_labels_will_have_appropriate_information_classification_marking_Protect_Proprietary() {
		System.out.println("Verify file in downloads");
		LG.Verify_downloaded_file_cloudicon();

	}

	@Then("^Click on resetpin button$")
	public void Click_on_resetpin_button() {
		LG.Click_on_resetpin_button();
	}

	@Then("^Username is in first.last format \\(email ID\\)$")
	public void Username_is_in_first_last_format_email_ID() {
		LG.Username_is_in_first_last_format_email_ID();
	}

	@Then("^I see a reset pin page, with options to reset or cancel and enter old pin$")
	public void I_see_a_reset_pin_page_with_options_to_reset_or_cancel_enteroldpin(DataTable pin) {
		List<List<String>> data = pin.raw();
		LG.I_see_a_reset_pin_page_with_options_to_reset_or_cancel_enteroldpin(data.get(0).get(0));
	}

	@When("^I enter that password$")
	public void I_enter_that_password(DataTable password) {
		List<List<String>> data = password.raw();
		LG.I_enter_that_password((data.get(0).get(0)),data.get(0).get(1));
	}

	@And("^Verify error message resetpin$")
	public void Verify_error_message_resetpin() {

		LG.Verify_error_message_resetpin();
	}

	@And("^I click on button for reset$")
	public void I_click_on_button_for_reset() {

		LG.I_click_on_button_for_reset();
	}

	@When("^I confirm pin and click reset$")
	public void I_confirm_pin_and_click_reset(DataTable confirm) {
		List<List<String>> data = confirm.raw();
		LG.I_confirm_pin_and_click_reset((data.get(0).get(0)));
	}

	@And("^I click on cancel button to return to login page$")
	public void I_click_on_cancel_button_to_return_to_login_page() {

		LG.I_click_on_cancel_button_to_return_to_login_page();
	}

}
