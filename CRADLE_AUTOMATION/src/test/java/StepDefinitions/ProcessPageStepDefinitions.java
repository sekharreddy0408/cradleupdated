package StepDefinitions;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import Methods.methodsforProcessPage;
import Utilities.WebConnector;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProcessPageStepDefinitions {

	
	public methodsforProcessPage PP;

	public ProcessPageStepDefinitions() {
		PP = PageFactory.initElements(WebConnector.openbrowser(), methodsforProcessPage.class);
	}
	
	
	@And("^i click on process tab$")
	public void i_click_on_process_tab() {
		System.out.println("I am on the Process Tab");
		PP.i_click_on_process_tab();
	}
	
	
	@When("^i click on date icon$")
	public void i_click_on_date_icon()  {
		PP.i_click_on_date_icon();
	}

	@When("^i click on save button on Date$")
	public void i_click_on_save_button_on_Date() {
	PP.i_click_on_save_button_on_Date();
	}  

	@When("^i Click on dose icon of process page$")
	public void i_Click_on_dose_icon_of_process_page()  {
	   PP.i_Click_on_dose_icon_of_process_page();
	}

	@When("^i change on contact dose rate$")
	public void i_change_on_contact_dose_rate(DataTable dose)  {
		
			List<List<String>> data = dose.raw();
		
		PP.i_change_on_contact_dose_rate(data.get(0).get(0));
	}

	@When("^i click on save button for dose process page$")
	public void i_click_on_save_button_for_dose_process_page()  {
	  PP.i_click_on_save_button_for_dose_process_page();
	}

	@When("^i click on cancel button for dose process page$")
	public void i_click_on_cancel_button_for_dose_process_page() {
	    PP.i_click_on_cancel_button_for_dose_process_page();
	}

	@When("^i click on yes button for dose process page$")
	public void i_click_on_yes_button_for_dose_process_page()  {
	 PP.i_click_on_yes_button_for_dose_process_page(); 
	}

	@When("^i click on mthree icon of process page$")
	public void i_click_on_m_icon_of_process_page()  {
	   PP.i_click_on_m_icon_of_process_page();
	}

	
	@When("^i edit value for volume for process page to reset to default$")
	public void i_edit_value_for_volume_for_process_page_to_reset_to_default()  {
	   
		PP.i_edit_value_for_volume_for_process_page_to_reset_to_default();
	
	}
	
	
	
	@When("^i edit value for volume for process page$")
	public void i_edit_value_for_volume_for_process_page(DataTable vol)  {
	   
		List<List<String>> data = vol.raw();
		
		PP.i_edit_value_for_volume_for_process_page(data.get(0).get(0));
	}

	@When("^i edit value for weight for process page to reset to default$")
	public void i_edit_value_for_weight_for_process_page_to_reset_to_default()  {
	   
		PP.i_edit_value_for_weight_for_process_page_to_reset_to_default();
	
	}
	
	@When("^i edit value for weight for process page$")
	public void i_edit_value_for_weight_for_process_page(DataTable weight)  {
		   
			List<List<String>> data = weight.raw();
		
	   PP.i_edit_value_for_weight_for_process_page(data.get(0).get(0));
	}

	@Then("^i click on save button for mthree process page$")
	public void i_click_on_save_button_for_m_process_page() {
	   PP.i_click_on_save_button_for_m_process_page();
	}

	
	@Then("^i click on save button for mthree process page to default$")
	public void i_click_on_save_button_for_mthree_process_page_to_default() {
	   PP.i_click_on_save_button_for_mthree_process_page_to_default();
	}
	
	@When("^i click on cancel button for mthree icon$")
	public void i_click_on_cancel_button_for_m_icon()  {
	   PP.i_click_on_cancel_button_for_m_icon();
	}

	@When("^i click on yes for mthree button process page$")
	public void i_click_on_yes_for_m_button_process_page() {
	   PP.i_click_on_yes_for_m_button_process_page();
	}

	
	//Process a Waste Item - Delete
	

	@When("^I press the Delete icon$")
	public void I_press_the_Delete_icon() {
		  PP.I_press_the_Delete_icon();
	}

	@Then("^the item is removed from the displayed list$")
	public void the_item_is_removed_from_the_displayed_list() {
		  PP.the_item_is_removed_from_the_displayed_list();
	}
	
	
	//Process a Waste Item - Submit
	
	

@When("^I click submit for a waste item with incomplete fields$")
public void I_click_submit_for_a_waste_item_with_incomplete_fields() {
  PP.I_click_submit_for_a_waste_item_with_incomplete_fields();
}

@Then("^the following text appears: Incomplete Data, Mandatory Data Missing: Date, Dose, Volume$")
public void the_following_text_appears_Incomplete_Data_Mandatory_Data_Missing_Date_Dose_Volume(){
   PP.the_following_text_appears_Incomplete_Data_Mandatory_Data_Missing_Date_Dose_Volume();
}

@Then("^click on cancel button for errormessage page$")
public void clickoncancelbuttonforerrormessagepage(){
   PP.clickoncancelbuttonforerrormessagepage();
}




@When("^I click submit for a waste item with complete fields$")
public void I_click_submit_for_a_waste_item_with_complete_fields()  {
   PP.I_click_submit_for_a_waste_item_with_complete_fields();
}



@When("^the yes has been clicked \\(i.e. submission of list item has been confirmed\\)$")
public void the_yes_has_been_clicked_i_e_submission_of_list_item_has_been_confirmed()  {
 PP.the_yes_has_been_clicked_i_e_submission_of_list_item_has_been_confirmed();
}

@Then("^the list item is removed from the Process and Collect Screen list and available to the packaging process$")
public void the_list_item_is_removed_from_the_Process_and_Collect_Screen_list_and_available_to_the_packaging_process() {
   PP.the_list_item_is_removed_from_the_Process_and_Collect_Screen_list_and_available_to_the_packaging_process();
}

@When("^the no has been clicked \\(i.e. submission of list item has not been confirmed\\)$")
public void the_no_has_been_clicked_i_e_submission_of_list_item_has_not_been_confirmed()  {
   PP.the_no_has_been_clicked_i_e_submission_of_list_item_has_not_been_confirmed();
}

@Then("^the submit modal closes.$")
public void the_submit_modal_closes()  {
   PP.the_submit_modal_closes();
}


// Process list View by   GDRW-374


@When("^I select View All from the option displayed on the pop up window for process page$")
public void I_select_View_All_from_the_option_displayed_on_the_pop_up_window_for_process_page() {
  PP.I_select_View_All_from_the_option_displayed_on_the_pop_up_window_for_process_page();
}


@When("^Select viewall option from dropdown$")
public void Select_viewall_option_from_dropdown() {
  PP.Select_viewall_option_from_dropdown();
}


@Then("^all items are arranged in date order \\(descending\\) for process page$")
public void all_items_are_arranged_in_date_order_descending_for_process_page() {
	 PP.all_items_are_arranged_in_date_order_descending_for_process_page();
}

@When("^i select Bags from the option displayed on the pop up windowÂ for process page$")
public void i_select_Bags_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {
	 PP.i_select_Bags_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the Bag items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {
	PP.only_the_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select Vacuum Bag from the option displayed on the pop up windowÂ for process page$")
public void i_select_Vacuum_Bag_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page()  {
	 PP.i_select_Vacuum_Bag_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the Vacuum Bag items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Vacuum_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {
	 PP.only_the_Vacuum_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select ByPass Blowdown filter from the option displayed on the pop up windowÂ for process page$")
public void i_select_ByPass_Blowdown_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page()  {
	 PP.i_select_ByPass_Blowdown_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the ByPass Blowdown filter items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_ByPass_Blowdown_filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page()  {
	 PP.only_the_ByPass_Blowdown_filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
	 
}

@When("^i select Charcoal Filter from the option displayed on the pop up windowÂ for process page$")
public void i_select_Charcoal_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page()  {
	 PP.i_select_Charcoal_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the Charcoal Filter items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Charcoal_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page()  {
	 PP.only_the_Charcoal_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select  Cuboid HEPA filter from the option displayed on the pop up windowÂ for process page$")
public void i_select_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page(){
	 PP.i_select_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the  Cuboid HEPA filter items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Cuboid_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page()  {
	 PP.only_the_Cuboid_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select Cylindrical HEPA filterfrom the option displayed on the pop up windowÂ for process page$")
public void i_select_Cylindrical_HEPA_filterfrom_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {
	 PP.i_select_Cylindrical_HEPA_filterfrom_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the Cylindrical HEPA filter items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Cylindrical_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page()  {
	 PP.only_the_Cylindrical_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select DSE Filter from the option displayed on the pop up windowÂ for process page$")
public void i_select_DSE_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {
	 PP.i_select_DSE_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the DSE Filteritems are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_DSE_Filteritems_are_displayed_and_arranged_in_date_order_descending_for_process_page() {
	 PP.only_the_DSE_Filteritems_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select Pre-Filter from the option displayed on the pop up windowÂ for process page$")
public void i_select_Pre_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {
	 PP.i_select_Pre_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the Pre-Filter items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Pre_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {
	 PP.only_the_Pre_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select Liquid from the option displayed on the pop up windowÂ for process page$")
public void i_select_Liquid_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {
	 PP.i_select_Liquid_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the Liquid items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Liquid_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {
	 PP.only_the_Liquid_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select Loose Item from the option displayed on the pop up windowÂ for process page$")
public void i_select_Loose_Item_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page()  {
	 PP.i_select_Loose_Item_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the Loose items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Loose_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {
	 PP.only_the_Loose_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select Resin from the option displayed on the pop up windowÂ for process page$")
public void i_select_Resin_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {
	 PP.i_select_Resin_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the Resin items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Resin_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {
	 PP.only_the_Resin_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}

@When("^i select Sludge from the option displayed on the pop up windowÂ for process page$")
public void i_select_Sludge_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {
	 PP.i_select_Sludge_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^only the Sludge items are displayed and arranged  in date order \\(descending\\) for process page$")
public void only_the_Sludge_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {
	 PP.only_the_Sludge_items_are_displayed_and_arranged_in_date_order_descending_for_process_page();
}
	

//Process List Sort by GDRW - 375





@When("^I select SORTBY from the option displayed on the pop up window for process page$")
public void I_select_SORTBY_from_the_option_displayed_on_the_pop_up_window_for_process_page() throws Throwable {
   
	PP.I_select_SORTBY_from_the_option_displayed_on_the_pop_up_window_for_process_page();
	
}

@When("^I select Date from the option displayed on the pop up window for process page$")
public void I_select_Date_from_the_option_displayed_on_the_pop_up_window_for_process_page() throws Throwable {
   
	PP.I_select_Date_from_the_option_displayed_on_the_pop_up_window_for_process_page();
	
}

@Then("^all items are arranged in date order \\(ascending\\) for process page$")
public void all_items_are_arranged_in_date_order_ascending_for_process_page()  {
	PP.all_items_are_arranged_in_date_order_ascending_for_process_page();
}

@When("^i select ID from the option displayed on the pop up windowÂ for process page$")
public void i_select_ID_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {
	PP.select_ID_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^all items are arranged in order of item ID \\(numerically\\) for process page$")
public void all_items_are_arranged_in_order_of_item_ID_numerically_for_process_page() {
	PP.all_items_are_arranged_in_order_of_item_ID_numerically_for_process_page();
}


@When("^i select Origin from the option displayed on the pop up windowÂ for process page$")
public void i_select_Origin_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {
	PP.select_Origin_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^all items are arranged in order of item Origin \\(alphabetically\\) for process page$")
public void all_items_are_arranged_in_order_of_item_Origin_alphabetically_for_process_page() {
	PP.all_items_are_arranged_in_order_of_item_ID_alphabetically_for_process_page();
}




@When("^i select Stored from the option displayed on the pop up windowÂ for process page$")
public void i_select_Stored_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page()  {
	PP.select_Stored_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^all items are arranged by waste Stored \\(alphabetically\\) for process page$")
public void all_items_are_arranged_by_waste_Stored_alphabetically_for_process_page()  {
  PP.all_items_are_arranged_by_waste_Stored_alphabetically_for_process_page();
}



@When("^i select Stream from the option displayed on the pop up windowÂ for process page$")
public void i_select_Stream_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page()  {
	PP.select_Stream_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page();
}

@Then("^all items are arranged by waste Stream \\(alphabetically\\) for process page$")
public void all_items_are_arranged_by_waste_Stream_alphabetically_for_process_page()  {
  PP.all_items_are_arranged_by_waste_Stream_alphabetically_for_process_page();
}

//


@Then("^verify it on process page and delete it$")
public void verify_it_on_process_page_and_delete_it()  {
	 PP.verify_it_on_process_page_and_delete_it();
}

@Then("^verify if the item is deleted from page$")
public void verify_if_the_item_is_deleted_from_page()  {
	 PP.verify_if_the_item_is_deleted_from_page();
}


@Then("^wait for the spinner to disable$")
public void wait_for_the_spinner_to_disable()  {
	 PP.wait_for_the_spinner_to_disable();
}

@Then("^Click submit button for recently created waste$")
public void Click_submit_button_for_recently_created_waste()  {
	 PP.Click_submit_button_for_recently_created_waste();
}


@Then("^Click yes for submission for recently created waste$")
public void Click_yes_for_submission_for_recently_created_waste()  {
	 PP.Click_yes_for_submission_for_recently_created_waste();
}


}
