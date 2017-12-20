package StepDefinitions;

import java.util.List;

import org.openqa.selenium.support.PageFactory;
import Methods.methodsforCollectPage;
import Utilities.WebConnector;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CollectPageStepDefinitions {

	public methodsforCollectPage CP;

	public CollectPageStepDefinitions() {
		CP = PageFactory.initElements(WebConnector.openbrowser(), methodsforCollectPage.class);
	}

	@And("^I am on the Collect tab$")
	public void I_am_on_the_Collect_tab() {
		System.out.println("I am on the Collect tab");
		CP.CollectTab_Clicking();
	}

	@And("^I click in the Description field$")
	public void I_click_in_the_Description_field() {
		System.out.println("I click in the Description field");
		CP.Description_Clicking();
	}

	@Then("^I see the menu box with 12 different options, Bag, Vacuum Bag,Bypass Blowdown filter, Cylindrical HEPA filter, Cuboid HEPA filter, DSE Filter, Pre-Filter, Charcoal Filter, Liquid, Resin, Sludge, Loose Item$")
	public void I_see_the_menu_box_with_different_options_Bag_Vacuum_Bag_Bypass_Blowdown_filter_Cylindrical_HEPA_filter_Cuboid_HEPA_filter_DSE_Filter_Pre_Filter_Charcoal_Filter_Liquid_Resin_Sludge_Loose_Item() {

		CP.All_Options_in_Description();
	}

	@And("^I select any type of filter e.g. HEPA filter$")
	public void I_select_any_type_of_filter_e_g_HEPA_filter() {
		CP.I_select_any_type_of_filter_e_g_HEPA_filter();
	}

	@And("^I click in the Origin field$")
	public void I_click_in_the_Origin_field() {
		CP.I_click_in_the_Origin_field();
	}

	@And("^I see the menu box with with 15 different options Active Chemistry Laboratory,Active Effluent Treatment Plant,Active Laundry,Auxiliary Gas Plant,Control Rod Mechanism Maintenance Room,Decontamination Workshop, Flask Handling Area,Gas Circulator Lubrication Oil Slump, Gas Ciculator Maintenance Workshop, IFDF, Main Change Room, Nose Unit Maintenance Position,Pile Cap, Plug Unit Maintenance Facility$")
	public void allOptions_of_Origin() {

		CP.allOptions_of_Origin();
	}

	
	@And("^Select a value workshop from Orign field$")
	public void Select_a_value_workshop_from_Orign_field() {
		CP.selectworkshopbfromoriingdropdown();
	}
	
	@And("^I click in the Stored field$")
	public void I_click_in_the_Stored_field() {
		CP.I_click_in_the_Stored_field();
	}

	@Then("^I see ten different options, FBseventeen Waste Reciept Room, FBsixteen Waste sorting room, FBtwentyfour Rthree Store, FBtwentyfour Rfour Store, FG Bypass Blowdown Filter Decay Store, Solvent Store, Decontamination Workshop, Incinerator Building, Oil Storage Container, Other specify in free text$")
	public void I_see_ten_different_options_FBseventeen_Waste_Reciept_Room_FBsixteen_Waste_sorting_room_FBtwentyfour_Rthree_Store_FBtwentyfour_Rfour_Store_FG_Bypass_Blowdown_Filter_Decay_Store_Solvent_Store_Decontamination_Workshop_Incinerator_Building_Oil_Storage_Container_Other_specify_in_free_text()
			throws Throwable {
		CP.alloptionsStored();
	}
	@And("^Select a value selected form stored field$")
	public void Select_a_value_selected_form_stored_field() {
		CP.storedelementbfromoriingdropdown();
	}
	

	@When("^I click in the Date icon$")
	public void iClickInTheDateIcon() {
		CP.iClickInTheDateIcon();
	}

	@And("^I can see the pop up calendar$")
	public void iCanSeeThePopUpCalendar() {
		CP.iCanSeeThePopUpCalendar();
	}

	@When("^I select the date$")
	public void iSelectTheDate() {
		CP.iSelectTheDate();
	}

	
	@When("^i select a future date$")
	public void i_select_a_future_date() {
		CP.i_select_a_future_date();

	}

	@When("^I should see an error message$")
	public void I_should_see_an_error_message(DataTable tabval) {
		List<List<String>> data = tabval.raw();
		CP.Date_error_message_collect(data.get(0).get(0));
	
	}
	
	
			
			@When("^Click on ok to return to calender page$")
	public void Click_on_ok_to_return_to_calender_page() {
		CP.Click_on_ok_to_return_to_calender_page();

	}
			
			@When("^Return to home page of collect from date page$")
			public void Return_to_home_page_of_collect_from_date_page() {
				CP.Return_to_home_page_of_collect_from_date_page();

			}
			
			
	@When("^I click save$")
	public void iClickSave_date_collect() {
		CP.iClickSave_date_collect();

	}

	
	
	@When("^I click in the Dose icon$")
	public void iClickInTheDoseIcon() {
		CP.iClickInTheDoseIcon();
	}
	@When("^i clear the data dose level of m3 page$")
	public void i_clear_the_data_dose_level_of_m3_page() {
		CP.i_clear_the_data_dose_level_of_m3_page();
	}

	@Then("^a pop up window will display with three options Contact Dose Rate uSvh free text box save and cancel$")
	public void a_pop_up_window_will_display_with_three_options_Contact_Dose_Rate_uSvh_free_text_box_save_andcancel() {
		CP.a_pop_up_window_will_display_with_three_options_Contact_Dose_Rate_uSvh_free_text_box_save_andcancel();
	}

	@And("^I can see the Dose rate reading box,$")
	public void iCanSeeTheDoseRateReadingBox() {
		CP.iCanSeeTheDoseRateReadingBox();
	}

	@And("^I enter a value greater than 50 uSvh$")
	public void I_enter_a_value_greater_than_50_uSvh(DataTable doseval) {
		List<List<String>> data = doseval.raw();
		CP.I_enter_a_value_greater_than_50_uSvh(data.get(0).get(0));
	}

	@Then("^a second data field AtDose uSvh should be displayed or become active$")
	public void aseconddatafieldAtDoseuSvhshouldbedisplayedorbecomeactive() {
		CP.aseconddatafieldAtDoseuSvhshouldbedisplayedorbecomeactive();

	}

	@Then("^Click cancel button to return to collect page$")
	public void Click_cancel_button_to_return_to_collect_page() {
		CP.Click_cancel_button_to_return_to_collect_page();
	}

	@When("^I click in the mkg icon$")
    public void iClickInTheMkgIcon() {
   CP.m3_icon_collect();
	}

	@Then("^a pop up window with 4 options Volume \\(m3\\) and Weight \\(kg\\) will appear with free text field, save and cancel$")
	public void aPopUpWindowWith4OptionsVolumeM3AndWeightKgWillAppearWithFreeTextFieldSaveAndCancel() {
	CP.aPopUpWindowWith4OptionsVolumeM3AndWeightKgWillAppearWithFreeTextFieldSaveAndCancel();
	}
	
	
	
	
	@And("^i clear the value for weight first on m3 page$")
	public void i_clear_the_value_for_weight_first_on_m3_page() {
		
		CP.i_clear_the_value_for_weight_first_on_m3_page();
			}
	
	@And("^Enter value for weight in volume page m3$")
	public void Enter_value_for_weight_in_volume_page_m3(DataTable weightval) {
		List<List<String>> data = weightval.raw();
		CP.Enter_value_for_weight_in_volume_page_m3(data.get(0).get(0));
			}
	
		
		
	
	@And("^Save the details entered for Volume page$")
	public void Save_the_details_entered_for_Volume_page() {
				CP.Save_the_details_entered_for_Volume_page();
			}
	
			@When("^Click on cancel button to return from m3page$")
	public void Click_on_cancel_button_to_return_from_m3page() {
				CP.Click_on_cancel_button_to_return_from_m3page();
			}
	
	@When("^I click in the Notes icon$")
	public void iClickInTheNotesIcon() {
		CP.iClickInTheNotesIcon();
	}

	@Then("^I see three options a free text field up to 300 characters save and cancel$")
	public void iSee3OptionsAFreeTextFieldUpTo300CharactersSaveAndCancel() {
		CP.iSee3OptionsAFreeTextFieldUpTo300CharactersSaveAndCancel();
	}

	@And("^Click on Cancel button to return to collect page from Notes Page$")
	public void Click_on_Cancel_button_to_return_to_collect_page_from_Notes_Page() {
	CP.Click_on_Cancel_button_to_return_to_collect_page_from_Notes_Page();
	}
	
	
	// Scenario dose
	
	
	@And("^any measurement recorded greater than 50 uSvhr$")
	public void any_measurement_recorded_greater_than_50_uSvhr(DataTable doseval) {
		List<List<String>> data = doseval.raw();
		CP.I_enter_a_value_greater_than_50_uSvh(data.get(0).get(0));
		
	}
	
	@And("^a second box appears with the descripton DoseRate at 0.5m uSvh$")
	public void a_second_box_appears_with_the_descripton_DoseRate_uSvh() {
	CP.aseconddatafieldAtDoseuSvhshouldbedisplayedorbecomeactive();
	}
	
	@And("^I enter a reading into the Dose rate box and click save$")
	public void I_enter_a_reading_into_the_Dose_rate_box_and_click_save() {
	CP.entervaluesindoseratecollect();
	}
	
	
	@Then("^Click on save button for Dose m3 page$")
	public void Click_on_save_button_for_Dose_m3_page() {
		CP.Clickonsavebuutondosetab();
	}
	 
	@Then("^both values are saved$")
	public void both_values_are_saved() {
		CP.Clickonsavebuutondosetab();
	}
	 
	
	// Waste item list View (filter) functionality
	
	
	@Then("^I select View All from the option displayed on the pop up window$")
	public void I_select_View_All_from_the_option_displayed_on_the_pop_up_window() {
		CP.I_select_View_All_from_the_option_displayed_on_the_pop_up_window();
	}
	
	@Then("^all items are arranged in date order descending$")
	public void all_items_are_arranged_in_date_order_descending() {
	   CP.all_items_are_arranged_in_date_order_descending();
	}
	
	

	
	@When("^i select Bags from the option displayed on the pop up window$")
	public void i_select_Bags_from_the_option_displayed_on_the_pop_up_window() {
		CP.i_select_Bags_from_the_option_displayed_on_the_pop_up_window();
	}
	
	
	@Then("^only the \"([^\"]*)\" items are displayed and arranged in date order descending$")
	public void only_the_Bag_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) {
		CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}	
	


@When("^i select Vacuum Bag from the option displayed on the pop up window $")
public void i_select_Vacuum_Bag_from_the_option_displayed_on_the_pop_up_window() throws Throwable {
	CP.i_select_Vacuum_Bag_from_the_option_displayed_on_the_pop_up_window();
    
}
	
	
	
	@Then("^only the \"([^\"]*)\" items are displayed and arranged  in date order descending$")
	public void only_the_VacuumBag_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) {
		CP.only_the_VacuumBag_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}

	@When("^i select Cuboid HEPA filter from the option displayed on the pop up window $")
	public void i_select_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_window()  {
		CP.iselect_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_window();
	}
	
	

@When("^i select ByPass Blowdown filter from the option displayed on the pop up window $")
public void i_select_ByPass_Blowdown_filter_from_the_option_displayed_on_the_pop_up_window() {
	CP.iselectByPassBlowdownfilterfromtheoptiondisplayedonthepopupwindow();
}
	
	

	@Then("^only the \"([^\"]*)\" filter items are displayed and arranged  in date order descending$")
	public void only_the_ByPassBlowdown_filter_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) {
		CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}
	
	
	
	@When("^i select Charcoal Filter from the option displayed on the pop up window $")
	public void i_select_Charcoal_Filter_from_the_option_displayed_on_the_pop_up_window() throws Throwable {
		CP.i_select_Charcoal_Filter_from_the_option_displayed_on_the_pop_up_window();
	}

	@Then("^only the \"([^\"]*)\"charcoal filter items are displayed and arranged  in date order descending$")
	public void only_the_charcoal_filter_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) throws Throwable {
		CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}
	

	
//	@When("^i select Cuboid HEPA filter from the option displayed on the pop up window$")
//	public void i_select_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_window() throws Throwable {
//		CP.i_select_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_window();
//	}
	
	@Then("^only the  \"([^\"]*)\" cubiod items are displayed and arranged  in date order descending$")
	public void only_the_Cuboid_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) throws Throwable {
		CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}
	
	@When("^i select Cylindrical HEPA filterfrom the option displayed on the pop up window $")
	public void i_select_Cylindrical_HEPA_filterfrom_the_option_displayed_on_the_pop_up_window() throws Throwable {
		CP.i_select_Cylindrical_HEPA_filterfrom_the_option_displayed_on_the_pop_up_window();
	}
	
	@Then("^only the \"([^\"]*)\" cylinder items are displayed and arranged  in date order descending$")
	public void only_the_Cylindrical_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) throws Throwable {
		CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}
	 
	
	@When("^i select DSE Filter from the option displayed on the pop up window $")
	public void i_select_DSE_Filter_from_the_option_displayed_on_the_pop_up_window() throws Throwable {
		CP.i_select_DSE_Filter_from_the_option_displayed_on_the_pop_up_window();
	}
	
	@Then("^only the \"([^\"]*)\" DSE items are displayed and arranged  in date order descending$")
	public void only_the_DSE_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) throws Throwable {
		CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}
	
	
	
	@When("^i select Pre-Filter from the option displayed on the pop up window $")
	public void i_select_Pre_Filter_from_the_option_displayed_on_the_pop_up_window() throws Throwable {
		CP.iselectPreFilterfromtheoptiondisplayedonthepopupwindow();
	}
	
	@When("^only the \"([^\"]*)\" Pre items are displayed and arranged  in date order descending$")
	public void onlythePreFilterPreitemsaredisplayedandarrangedindateorderdescending(String verifydataitem)  {
		CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}
	
	
	@When("^i select Liquid from the option displayed on the pop up window $")
	public void i_select_Liquid_from_the_option_displayed_on_the_pop_up_window() throws Throwable {
		CP.i_select_Liquid_rom_the_option_displayed_on_the_pop_up_window();
	}

	
	@Then("^only the \"([^\"]*)\" liquid items are displayed and arranged  in date order descending$")
	public void only_the_liquid_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) {
		CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}
	
	
	@When("^i select Loose Item from the option displayed on the pop up window $")
	public void i_select_Loose_Item_from_the_option_displayed_on_the_pop_up_window() throws Throwable {
		CP.i_select_Loose_Item_from_the_option_displayed_on_the_pop_up_window();
	}
	
	@Then("^only the \"([^\"]*)\" loose are displayed and arranged  in date order descending$")
	public void only_the_loose_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) {
		CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
	}
	
	

@When("^i select Resin from the option displayed on the pop up window $")
public void i_select_Resin_from_the_option_displayed_on_the_pop_up_window() throws Throwable {
    CP.i_select_Resin_from_the_option_displayed_on_the_pop_up_window();
}

@Then("^only the \"([^\"]*)\" resin items are displayed and arranged  in date order descending$")
public void only_the_Resin_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) {
	CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
}

@When("^i select Sludge from the option displayed on the pop up window $")
public void i_select_Sludge_from_the_option_displayed_on_the_pop_up_window() throws Throwable {
    CP.i_select_Sludge_from_the_option_displayed_on_the_pop_up_window();
}

@Then("^only the \"([^\"]*)\" sludge items are displayed and arranged  in date order descending$")
public void only_the_Sludge_items_are_displayed_and_arranged_in_date_order_descending(String verifydataitem) {
	CP.only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(verifydataitem);
}

//  SCENARIO SORT BY DROPDOWN	



@When("^I select Sortby dropdown$")
public void I_select_Sortby_dropdown ()  {
	CP.I_select_Sortby_dropdown();
}


@Then("^the associated dropdown is shown for Sortby$")
public void the_associated_dropdown_is_show ()  {
	CP.the_associated_dropdown_is_show() ;
}


@When("^I select Date from the option displayed on the pop up window$")
public void I_select_Date_from_the_option_displayed_on_the_pop_up_window()  {
	CP.I_select_Date_from_the_option_displayed_on_the_pop_up_window();
}



@When("^items are displayed as per \"([^\"]*)\"$")
public void items_are_displayed_as_per_data(String verifyvalue) {
	
		
	
	CP.items_are_displayed_as_per_data(verifyvalue);
}

@Then("^all items are arranged in date order \\(ascending\\)$")
public void all_items_are_arranged_in_date_order_ascending()  {
   CP.all_items_are_arranged_in_date_order_ascending();
}

@When("^i select Origin from the option displayed on the pop up window $")
public void i_select_Origin_from_the_option_displayed_on_the_pop_up_window() {
	CP.i_select_Origin_from_the_option_displayed_on_the_pop_up_window();
}

@Then("^all items are arranged by Origin of where the waste items were collected from \\(alphabetically\\)$")
public void all_items_are_arranged_by_Origin_of_where_the_waste_items_were_collected_from_alphabetically()  {
	CP.all_items_are_arranged_by_Origin_of_where_the_waste_items_were_collected_from_alphabetically();
	
}

@When("^i select ID from the option displayed on the pop up windowÂ $")
public void i_select_ID_from_the_option_displayed_on_the_pop_up_windowÂ() {
	CP.i_select_ID_from_the_option_displayed_on_the_pop_up_windowÂ();
}

@Then("^all items are arranged in order of item ID \\(numerically\\)$")
public void all_items_are_arranged_in_order_of_item_ID_numerically()  {
	CP.all_items_are_arranged_in_order_of_item_ID_numerically();
}

@When("^i select Stream from the option displayed on the pop up windowÂ $")
public void i_select_Stream_from_the_option_displayed_on_the_pop_up_windowÂ()  {
   CP.i_select_Stream_from_the_option_displayed_on_the_pop_up_windowÂ();

}

@Then("^all items are arranged by waste Stream$")
public void all_items_are_arranged_by_waste_Stream()  {
   
}

@Then("^display the Origin shortcode \\(alphabetically\\)$")
public void display_the_Origin_shortcode_alphabetically()  {
   
}

@When("^i select Stored from the option displayed on the pop up windowÂ $")
public void i_select_Stored_from_the_option_displayed_on_the_pop_up_windowÂ() {
  CP.i_select_Stored_from_the_option_displayed_on_the_pop_up_windowÂ();
}

@Then("^all items are arranged by where the collected waste item is stored. \\(alphabetically\\)$")
public void all_items_are_arranged_by_where_the_collected_waste_item_is_stored_alphabetically()  {
    
}

// Submit button page

@When("^I press the submit button$")
public void I_press_the_submit_button()  {

	CP.I_press_the_submit_button();
}

@Then("^I see a popup window with the uniqueID, and options to accept Yes or No$")
public void I_see_a_popup_window_with_the_uniqueID_and_options_to_accept_Yes_or_No() {
   CP.I_see_a_popup_window_with_the_uniqueID_and_options_to_accept_Yes_or_No();
}

@When("^I press the Yes option$")
public void I_press_the_Yes_option()  {
  CP.I_press_the_Yes_option();
}

@Then("^I see an item created with the same uniqueID$")
public void I_see_an_item_created_with_the_same_uniqueID()  {
   CP.I_see_an_item_created_with_the_same_uniqueID();
}







@When("^I press the No option$")
public void I_press_the_No_option(){
   CP.I_press_the_No_option();
}

@Then("^the popup window should disappear, and uniques ID will still be available for use$")
public void the_popup_window_should_disappear_and_uniques_ID_will_still_be_available_for_use() {
  //CP.I_see_a_popup_window_with_the_uniqueID_and_options_to_accept_Yes_or_No();
}



}
