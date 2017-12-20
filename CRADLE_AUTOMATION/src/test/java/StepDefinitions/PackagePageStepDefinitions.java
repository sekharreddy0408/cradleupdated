package StepDefinitions;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import Methods.methodsforPackagePage;
import Utilities.WebConnector;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PackagePageStepDefinitions {

	public methodsforPackagePage PKP;

	public PackagePageStepDefinitions() {
		PKP = PageFactory.initElements(WebConnector.openbrowser(), methodsforPackagePage.class);
	}

	@And("^I Click on Package Tab$")
	public void I_Click_on_Package_Tab() {
		System.out.println("I am on the Package Tab");
		PKP.I_Click_on_Package_Tab();
	}

	@When("^I select a package$")
	public void I_select_a_package() {
		PKP.I_select_a_package();
	}

	@When("^I select an Item$")
	public void I_select_an_Item() {
		PKP.I_select_an_Item();
	}

	@When("^Select cancel button of package page$")
	public void Select_cancel_button_of_package_page() {
		PKP.Select_cancel_button_of_package_page();
	}
	
	
	@And("^I Click on pack items button$")
	public void I_Click_on_pack_items_button() {
		PKP.I_Click_on_pack_items_button();
	}

	@And("^I Click on cancel packitems of package page$")
	public void I_Click_on_cancel_packitems_of_package_page() {
		PKP.I_Click_on_cancel_packitems_of_package_page();
	}

	@And("^I Click on ok packitems of package page$")
	public void I_Click_on_ok_packitems_of_package_page() {
		PKP.I_Click_on_ok_packitems_of_package_page();
	}

	@And("^I Click on the list of package box$")
	public void I_Click_on_the_list_of_package_box() {
		PKP.I_Click_on_the_list_of_package_box();
	}

	@And("^I Click on cancel button of item$")
	public void I_Click_on_cancel_button_of_item() {
		PKP.I_Click_on_cancel_button_of_item();
	}

	@And("^Cancel addedlist multiple packagebox$")
	public void Cancel_addedlist_multiple_packagebox() {
		PKP.Cancel_addedlist_multiple_packagebox();
	}

	@And("^Click on yes to send the item back to package page$")
	public void Click_on_yes_to_send_the_item_back_to_package_page() {
		PKP.YES_cancel_addedlist_packagebox();
	}

	@And("^Click on main page to return to main page of package")
	public void Click_on_main_page_to_return_to_main_page_of_package() {
		PKP.BIG_Cancel_addedlist_mainpackagebox();
	}

	@Then("^I will see a pop up displaying This will add item to package with options to click cancel or ok$")
	public void I_will_see_a_pop_up_displaying_This_will_add_item_to_package_with_options_to_click_cancel_or_ok(DataTable datastring) {
			
			List<List<String>> data = datastring.raw();
		PKP.I_will_see_a_pop_up_displaying_This_will_add_item_to_package_with_options_to_click_cancel_or_ok(data.get(0).get(0));
	}

	@When("^I select multiple Items$")
	public void I_select_multiple_Items() {
	 	PKP.I_select_multiple_Items();
	}

	@Then("^I will see a pop up displaying This will add x number of items  to package x  with options to click cancel or ok$")
	public void I_will_see_a_pop_up_displaying_This_will_add_x_number_of_items_to_package_x_with_options_to_click_cancel_or_ok() {

	}

	@When("^I select check all$")
	public void I_select_check_all() {

	}

	@Then("^I can add all items displayed to that package$")
	public void I_can_add_all_items_displayed_to_that_package() {

	}

	@When("^I click on CREATE NEW PACKAGE$")
	public void I_click_on_CREATE_NEW_PACKAGE() {
		PKP.I_click_on_CREATE_NEW_PACKAGE();
	}

	@Then("^I can select a unique package ID as per agreed and designed format$")
	public void I_can_select_a_unique_package_ID_as_per_agreed_and_designed_format() {
		PKP.I_can_select_a_unique_package_ID_as_per_agreed_and_designed_format();
	}

	
	
	@Then("^I verify the size of the dropdown$")
	public void I_verify_the_size_of_the_dropdown() {
		PKP.I_verify_the_size_of_the_dropdown();
	}
	@Then("^select_uniqueid_from_packageiddropdown$")
	public void select_uniqueid_from_packageiddropdown() {
		PKP.select_uniqueid_from_packageiddropdown();
	}

	@When("^I select the Description$")
	public void I_select_the_Description() {
		PKP.I_select_the_Description();
	}
	@Then("^Verify all the elements in description$")
	public void Verify_all_the_elements_in_description() {
		PKP.Verify_all_the_elements_in_description();
	}
	
	
	@Then("^select option description newpackage$")
	public void select_option_description_newpackage() {
		PKP.select_option_description_newpackage();
	}
	
	

	@When("^Click on stored newpackage$")
	public void Click_on_stored_newpackage() {
		PKP.Click_on_stored_newpackage();
	}
	

	@Then("^Verify items on stored package page$")
	public void Verify_items_on_stored_package_page() {
		PKP.Verify_items_on_stored_package_page();
	}
	
	
	@Then("^Select option in stored newpackage$")
	public void Click_on_stored_newpackage_option() {
		PKP.Click_on_stored_newpackage_option();
	}
	
	@When("^select Stream$")
	public void select__strem() {
		PKP.select__strem();
	}

	
	

	@Then("^verify all the options in stream$")
	public void verify_all_the_options_in_stream() {
		PKP.verify_all_the_options_in_stream();
	}

	
	
	@Then("^select Stream Option in package$")
	public void select_option_strem() {
		PKP.select_option_strem();
	}

	
	
	@Then("^select Route dropdown in package$")
	public void select_Route_dropdown_in_package() {
		PKP.select_routedropdown();
	}
	
	@Then("^Verify the options in dropdown route in package$")
	public void Verify_the_options_in_dropdown_route_in_package() {
		PKP.Verify_the_options_in_dropdown_route_in_package();
	}
	
	
	@Then("^select route dropdown option$")
	public void select_routedropdown() {
		PKP.select_routedropdown_option();
	}

	@When("^select_prechecksoption$")
	public void select_prechecksoption() {
		PKP.select_prechecksoption();
	}
	

	@When("^Click on cancel button of create new package$")
	public void Click_on_cancel_button_of_create_new_package() {
		PKP.Click_on_cancel_button_of_create_new_package();
	}
	
	@When("^Clickon submitbutton newpackage$")
	public void Clickon_submitbutton_newpackage() {
		PKP.Clickon_submitbutton_newpackage();
	}

	@Then("^I can see a package displayed on the screen with the unique ID$")
	public void I_can_see_a_package_displayed_on_the_screen_with_the_unique_ID() {
		PKP.I_can_see_a_package_displayed_on_the_screen_with_the_unique_ID();
	}

	@Then("^the ID will no longer be available to select in the create new package list$")
	public void the_ID_will_no_longer_be_available_to_select_in_the_create_new_package_list() {
		PKP.the_ID_will_no_longer_be_available_to_select_in_the_create_new_package_list();
	}

	@Then("^Click on cancel button to return to package home page$")
	public void Click_on_cancel_button_to_return_to_package_home_page() {
		PKP.Click_on_cancel_button_to_return_to_package_home_page();
	}

	@Then("^Click on yes to return to package home page$")
	public void Click_on_yes_to_return_to_package_home_page() {
		PKP.Click_on_yes_to_return_to_package_home_page();
	}

// OPTIONS ON CONTAINER LHS ICON OF PACKAGE
	@And("^Click on LHS of package icon$")
	public void Click_on_LHS_of_package_icon() {
		PKP.Click_on_LHS_of_package_icon();
	}

	@Then("^I see information date,description,stream,sorage location,route about a package$")
	public void I_see_information_date_of_package(DataTable datavalues) {
	
			List<List<String>> data = datavalues.raw();
		
		
		PKP.I_see_information_date_of_package(data.get(0).get(0));
		PKP.I_see_information_Description_of_package(data.get(0).get(1));
		PKP.I_see_information_stream_of_package(data.get(0).get(2));
		PKP.I_see_information_stored_of_package(data.get(0).get(3));
		PKP.I_see_informationroute_of_package(data.get(0).get(4));
		
	}

	// middle options package
	
	@When("^i click the middle icon$")
	public void i_click_the_middle_icon(){
	   PKP.i_click_the_middle_icon();
	}

	@When("^I click on Weight tab$")
	public void I_click_on_Weight_tab()  {
	   PKP.I_click_on_Weight_tab();
	}

	
	

	@Then("^it should accept positive numbers only$")
	public void it_should_accept_positive_numbers_only()  {
		PKP.it_should_accept_positive_numbers_only();
	}

	@When("^I click on save$")
	public void I_click_on_save()  {
		PKP.I_click_on_save();
	}

	

	@When("^I click on cancel$")
	public void I_click_on_cancel()  {
		PKP.I_click_on_cancel();
	}

	@Then("^the pop up Are you sure you want to close, you will lose any unsaved data appears$")
	public void the_pop_up_Are_you_sure_you_want_to_close_you_will_lose_any_unsaved_data_appears()  {
		PKP.the_pop_up_Are_you_sure_you_want_to_close_you_will_lose_any_unsaved_data_appears();
	}

	
	
	//  Process list View by
	

@When("^I select View All from the option displayed on the pop up window for package page$")
public void I_select_View_All_from_the_option_displayed_on_the_pop_up_window_for_package_page()  {
PKP.I_select_View_All_from_the_option_displayed_on_the_pop_up_window_for_package_page();
}

@Then("^all items are arranged in date order \\(descending\\) for package page$")
public void all_items_are_arranged_in_date_order_descending_for_package_page()  {
	methodsforPackagePage.all_items_are_arranged_in_date_order_descending_for_package_page(); 
}

@When("^i select Bags from the option displayed on the pop up windowÂ for package page$")
public void i_select_Bags_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {
	PKP.i_select_Bags_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}


@Then("^i go home$")
public void igohome() {
	PKP.i_select_Bags_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}

@Then("^Only the bag items are displayed$")
public void Only_the_bag_items_are_displayed() {
	PKP.only_the_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}


@When("^i select Vacuum Bag from the option displayed on the pop up windowÂ for package page$")
public void i_select_Vacuum_Bag_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {
	PKP.i_select_Vacuum_Bag_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}

@Then("^Only the Vacuum Bag items are displayed$")
public void Only_the_Vacumbag_items_are_displayed() {
	PKP.only_the_Vacuum_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}

@Then("^only the Vacuum Bag items are displayed and arranged  in date order \\(descending\\) for package page$")
public void only_the_Vacuum_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_package_page()  {
	
}

@When("^i select ByPass Blowdown filter from the option displayed on the pop up windowÂ for package page$")
public void i_select_ByPass_Blowdown_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page()  {
	PKP.i_select_ByPass_Blowdown_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}


@Then("^Only the ByPass Blowdown filter items are displayed for package page$")
public void Only_the_ByPass_Blowdown_filter_items_are_displayed_for_package_page()  {
	PKP.only_the_ByPass_Blowdown_filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}


@When("^i select Charcoal Filter from the option displayed on the pop up windowÂ for package page$")
public void i_select_Charcoal_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page()  {
	PKP.i_select_Charcoal_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}

@When("^Only the Charcoal Filter filter items are displayed for package page$")
public void Only_the_Charcoal_Filter_filter_items_are_displayed_forpackage_page()  {
	PKP.only_the_Charcoal_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}



@When("^i select Cuboid HEPA Filter from the option displayed on the pop up windowÂ for package page$")
public void i_select_Cuboid_HEPA_Filter_from_the_option_displayed_on_thepopupwindowÂ_for_package_page()  {
	PKP.i_select_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}


@When("^Only the Cuboid HEPA Filter filter items are displayed for package page$")
public void Only_the_Cuboid_HEPA_Filter_filter_items_are_displayed_for_packagepage()  {
	PKP.only_the_Cuboid_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}



@When("^i select Cylindrical HEPA filterfrom the option displayed on the pop up windowÂ for package page$")
public void i_select_Cylindrical_HEPA_filterfrom_the_option_displayed_on_the_pop_up_windowÂ_for_package_page()  {
	PKP.i_select_Cylindrical_HEPA_filterfrom_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}


@When("^Only the Cylindrical HEPA filter items are displayed for package page$")
public void OnlytheCylindricalHEPAfilteritemsaredisplayedforpackage_page()  {
	PKP.only_the_Cylindrical_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}


@Then("^only the Cylindrical HEPA filter items are displayed and arranged  in date order \\(descending\\) for package page$")
public void only_the_Cylindrical_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {
	PKP.only_the_Cylindrical_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}

@When("^i select DSE Filter from the option displayed on the pop up windowÂ for package page$")
public void i_select_DSE_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page()  {
	PKP.i_select_DSE_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}

@Then("^Only the DSE Filter items are displayed for package page$")
public void OnlytheDSEFilteritemsaredisplayedforpackagepage()  {
	PKP.only_the_DSE_Filteritems_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}



@When("^i select Pre-Filter from the option displayed on the pop up windowÂ for package page$")
public void i_select_Pre_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {
	PKP.i_select_Pre_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}


@When("^Only the Pre-Filter items are displayed for package page$")
public void OnlythePreFilteritemsaredisplayedforpackagepage() {
	PKP.only_the_Pre_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}





@When("^i select Liquid from the option displayed on the pop up windowÂ for package page$")
public void i_select_Liquid_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {
	PKP.i_select_Liquid_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}


@Then("^Only the Liquid items are displayed for package page$")
public void OnlytheLiquiditemsaredisplayedforpackagepage() {
	PKP.only_the_Liquid_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}




@When("^i select Loose Item from the option displayed on the pop up windowÂ for package page$")
public void i_select_Loose_Item_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page()  {
	PKP.i_select_Loose_Item_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}


@Then("^Only the Loose items items are displayed for package page$")
public void OnlytheLooseitemsitemsaredisplayedforpackagepage()  {
	PKP.only_the_Loose_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}



@When("^i select Resin from the option displayed on the pop up windowÂ for package page$")
public void i_select_Resin_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page()  {
	PKP.i_select_Resin_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}


@Then("^Only the Resin items are displayed for package page$")
public void OnlytheResinitemsaredisplayedforpackagepage()  {
	PKP.only_the_Resin_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}



@When("^i select Sludge from the option displayed on the pop up windowÂ for package page$")
public void i_select_Sludge_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page()  {
	PKP.i_select_Sludge_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page();
}


@Then("^Only the Sludge items items are displayed for package page$")
public void OnlytheSludgeitemsitemsaredisplayedforpackagepage()  {
	PKP.only_the_Sludge_items_are_displayed_and_arranged_in_date_order_descending_for_package_page();
}



//Process list SortBy by  GDWR-400



@When("^I click on the SortBy dropdown$")
public void I_click_on_the_SortBy_dropdown() {
	PKP.I_click_on_the_SortBy_dropdown();
}

@When("^I select Date of the options$")
public void I_select_Date_of_the_options()  {
	PKP.I_select_Date_of_the_options();
}

@Then("^all the list is sorted as per date$")
public void all_the_list_is_sorted_as_per_date() {
	PKP.all_the_list_is_sorted_as_per_date();
}

@When("^I select ID of the options$")
public void I_select_ID_of_the_options()  {
	PKP.I_select_ID_of_the_options();
}

@Then("^all the options are sorted as per ID$")
public void all_the_options_are_sorted_as_per_ID()  {
	PKP.all_the_options_are_sorted_as_per_ID();
}

@When("^I select Origin of the options$")
public void I_select_Origin_of_the_options() {
	PKP.I_select_Origin_of_the_options();
}

@Then("^all the options are sorted as per Origin$")
public void all_the_options_are_sorted_as_per_Origin()  {
	PKP.all_the_options_are_sorted_as_per_Origin();
}

@When("^I select stored of the options$")
public void I_select_stored_of_the_options() {
	PKP.I_select_stored_of_the_options();
}

@Then("^all the options are sorted as per Stored$")
public void all_the_options_are_sorted_as_per_Stored()  {
	PKP.all_the_options_are_sorted_as_per_Stored();
}

@When("^I select stream of the options$")
public void I_select_stream_of_the_options() {
	PKP.I_select_stream_of_the_options();
}

@Then("^all the options are sorted as per Stream$")
public void all_the_options_are_sorted_as_per_Stream()  {
	PKP.all_the_options_are_sorted_as_per_Stream();
}
	
// Submit Package details

@When("^I click on submit$")
public void I_click_on_submit() throws Throwable {
	PKP.I_click_on_submit();
}


@Then("^the pop up will display an error if Mandatory data missing for:$")
public void the_pop_up_will_display_an_error_if_Mandatory_data_missing_for()  {
	 PKP.the_pop_up_will_display_an_error_if_Mandatory_data_missing_for();
}


@And("^Click on x for mandatoryfields not complete$")
public void Click_on_x_for_mandatoryfields_not_complete()  {
	 PKP.Click_on_x_for_mandatoryfields_not_complete();
}



@Then("^I select mandatory fields complete fields package$")
public void Select_mandatoryfieldscompletedpackage(){
	 PKP.Select_mandatoryfieldscompletedpackage();
}

@Then("^I click on submit with complete fields$")
public void I_click_on_submit_with_complete_fields(){
	 PKP.I_click_on_submit_with_complete_fields();
}


@When("^all mandatory fields are complete$")
public void all_mandatory_fields_are_complete()  {
	 PKP.all_mandatory_fields_are_complete();
}



@When("^I click on x button,$")
public void I_click_on_button() {
	 PKP.I_click_on_x_buttonforpackagepage();
}



@When("^all mandatory fields have been entered then item is moved to Consign screen.$")
public void all_mandatory_fields_have_been_entered_then_item_is_moved_to_Consign_screen()  {
	// PKP.all_mandatory_fields_have_been_entered_then_item_is_moved_to_Consign_screen();
}

	
// select most recently submitted from packagE




@When("^Click ok to delete waste from package$")
public void Click_ok_to_delete_waste_from_package()  {
	 PKP.Click_ok_to_delete_waste_from_package();
}


}
