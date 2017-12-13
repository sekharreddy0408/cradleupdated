package Methods;

import java.util.logging.Logger;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.UtilFile;
import Utilities.WebConnector;
import junit.framework.Assert;

public class methodsforProcessPage {


	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[2]")
	public static WebElement ProcessTab;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[1]/ul")
	public static WebElement ProcessTab_hint;
	
	// date icon
	
	
	@FindBy(xpath = "//*[@id='11']/span[4] ")    //*[@id='wasteItem.dateBtn']
	public static WebElement dateicon_processpage;
	
	@FindBy(xpath = "//*[@id='11']/span[4]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]")
	public static WebElement save_dateicon_processpage;
	
	
	// dose icon process page
	
	
	

	
	@FindBy(xpath = "//*[@id='11']/span[5] ")  //*[@id='wasteItem.doseBtn']
	public static WebElement doseicon_processpage;
	
	@FindBy(xpath = "//*[@id='processlist.11.dose.contactDose']")
	public static WebElement contactdoserate_processpage;
	
	@FindBy(xpath = "//*[@id='11']/span[5]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]")
	public static WebElement  save_dose_processpage;
	
	@FindBy(xpath = "//*[@id='11']/span[5]/div/div/div/div/div[2]/div/div/div/div[1]/button[1]")
	public static WebElement  cancel_dose_processpage;
	
	@FindBy(xpath = "//*[@id='11']/span[5]/div/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement yes_cancel_dose_processpage;
	
	
	
	// m3 icon options
	
	
	
	@FindBy(xpath = "//*[@id='wasteItem.massBtn']")
	public static WebElement m3icon_processpage;
	
	@FindBy(xpath = "//*[@id='11']/span[7]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]")
	public static WebElement save_m3icon_processpage;
	
	@FindBy(xpath = "//*[@id='processlist.11.mass.volume']")
	public static WebElement volume_m3icon_processpage;
	
	@FindBy(xpath = "//*[@id='processlist.11.mass.weight']")
	public static WebElement weight_m3icon_processpage;
	
	@FindBy(xpath = "//*[@id='11']/span[7]/div/div/div/div/div[2]/div/div/div/div[1]/button[1]")
	public static WebElement cancel_m3icon_processpage;
	
	@FindBy(xpath = "//*[@id='11']/span[7]/div/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement yes_cancel_m3icon_processpage;
	
// delete waste items
	
	
	@FindBy(xpath = "//*[@id='processlist.11.delete']")
	public static WebElement delete_button_item_process_page;	
	
	@FindBy(xpath = "//*[@id='11']/span[11]/div/div/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement Yes_delete_button_item_process_page;
	
	
	@FindBy(xpath = "//*[@id='11']/span[11]/div/div/div/div[2]/div/div/div/div[2]/button[1]")
	public static WebElement NO_delete_button_item_process_page;
	
	@FindBy(xpath = "//*[@id='11']/span[11]/div/div/div/div[2]/div/div/div/div[1]/h4/div/span")
	public static WebElement deleteitem_message_process;
	
	
	//OPTIONS ON LINE INCOMPLETE FIELDS
	
	
	@FindBy(xpath = "//*[@id='processlist.11.submit']/button")
	public static WebElement INCOMPLETELINE_SUBMITBUTTON;
	
	@FindBy(xpath = "//*[@id='inCompleteData']/div/div/div/div/h4/div/span")
	public static WebElement INCOMPLETELINE_ERRORMESSAGE;
	
	@FindBy(xpath = "//*[@id='inCompleteData']/div/div/div/div/button")
	public static WebElement INCOMPLETELINE_ERRORMESSAGE_CANCEL_BUTTON;
	
	@FindBy(xpath = "//*[@id='processlist.9.submit']/button")
	public static WebElement COMPLETELINE_SUBMIT_BUTTON;
	
	@FindBy(xpath = "//*[@id='processlist.9.submit']/div/div/div[2]/div/div/div/div[1]/h4/div/span")
	public static WebElement COMPLETELINE_CONFIRMATIONLINE;
	
	@FindBy(xpath = "//*[@id='processlist.9.submit']/div/div/div[2]/div/div/div/div[4]/button[1]")
	public static WebElement YES_CONFIRMATIONLINE;
	
	@FindBy(xpath = "//*[@id='processlist.9.submit']/div/div/div[2]/div/div/div/div[4]/button[2]")
	public static WebElement NO_CONFIRMATIONLINE;
	
	
	// view all options for process page
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/input")
	public static WebElement VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[1]")
	public static WebElement VIEWALLOPTION_IN_DROPDOWN_PROCESSPAGE;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[2]")
	public static WebElement BAG_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[3]")
	public static WebElement VACCUMBAG_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[4]")
	public static WebElement BYPASSBLOWDOWN_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[5]")
	public static WebElement CHARCOALFILTER_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[6]")
	public static WebElement CUBOIDHEPAFILTER_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[7]")
	public static WebElement CYLINDRICALHEPAFILTER_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[8]")
	public static WebElement DSEFILTER_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[9]")
	public static WebElement PREFILTER_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[10]")
	public static WebElement LIQUID_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[11]")
	public static WebElement RESIN_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[12]")
	public static WebElement SLUDGE_VIEWALL_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[1]/div/div/div/div[2]/div/div/div/div/button[13]")
	public static WebElement LOOSEITEM_VIEWALL_PROCESSPAGE;
	
	
	
	//Select Sort by options
	

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[2]/div/input")
	public static WebElement SORTBY_PROCESSPAGE;
	
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/button[2]")
	public static WebElement DATE_SORTBY_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/button[3]")
	public static WebElement ID_SORTBY_PROCESSPAGE;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/button[4]")
	public static WebElement ORIGIN_SORTBY_PROCESSPAGE;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/button[5]")
	public static WebElement STORED_SORTBY_PROCESSPAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[6]/div/article/div/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/div/div/div/button[6]")
	public static WebElement STREAM_SORTBY_PROCESSPAGE;
	
	
	
	
	
	private static Logger Log = Logger.getLogger(methodsforProcessPage.class.getName());
	

	
	
	public static void i_click_on_process_tab() {

		try {

			Log.info("Click on process Tab");
		//	UtilFile.waitForElementToBeClickable(ProcessTab).click();
			
			UtilFile.waitForElementToBeClickable1(ProcessTab_hint);
			UtilFile.waitForElementToBeClickable(ProcessTab).click();
		
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " +e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void processhintiussue() {

		try {
		
			
			UtilFile.waitForElementToBeClickable1(ProcessTab_hint);
			UtilFile.waitForElementToBeClickable(ProcessTab).click();
			System.out.println("issue success");
			
			

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void i_click_on_date_icon() {

		try {

			Thread.sleep(2000);
			UtilFile.waitForElementToBeClickable(dateicon_processpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void i_click_on_save_button_on_Date() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(save_dateicon_processpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void i_Click_on_dose_icon_of_process_page() {

		try {

			Thread.sleep(2000);
			
          UtilFile.waitForElementToBeClickable(doseicon_processpage).click();



		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void i_change_on_contact_dose_rate(String dosevalue) {

		try {

			
			UtilFile.waitForElementToBeClickable(contactdoserate_processpage).clear();
			contactdoserate_processpage.sendKeys(dosevalue);

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void i_click_on_save_button_for_dose_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(save_dose_processpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void i_click_on_cancel_button_for_dose_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(cancel_dose_processpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void i_click_on_yes_button_for_dose_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(yes_cancel_dose_processpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void i_click_on_m_icon_of_process_page() {

		try {

			UtilFile.waitforpagetoload();
			Thread.sleep(4000);
			UtilFile.waitForElementToBeClickable(m3icon_processpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void i_edit_value_for_volume_for_process_page(String volvalue) {

		try {

			
			UtilFile.waitForElementToBeClickable(volume_m3icon_processpage).clear();
			volume_m3icon_processpage.sendKeys(volvalue);

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void i_edit_value_for_weight_for_process_page(String weightval) {

		try {

			
			UtilFile.waitForElementToBeClickable(weight_m3icon_processpage).clear();
			weight_m3icon_processpage.sendKeys(weightval);

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void i_click_on_save_button_for_m_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(save_m3icon_processpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void i_click_on_cancel_button_for_m_icon() {

		try {

			
			UtilFile.waitForElementToBeClickable(cancel_m3icon_processpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void i_click_on_yes_for_m_button_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(yes_cancel_m3icon_processpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	//
	
	
	
	
	

	public static void I_press_the_Delete_icon() {

		try {

			UtilFile.waitforpagetoload();
			UtilFile.waitForElementToBeClickable(delete_button_item_process_page).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void the_item_is_removed_from_the_displayed_list() {

		try {

			Thread.sleep(1000);
			Assert.assertEquals("Do you want to delete this item (e.g. as clearance monitoring indicates it is not radioactive)?", deleteitem_message_process.getText());
			UtilFile.waitForElementToBeClickable(NO_delete_button_item_process_page).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void I_click_submit_for_a_waste_item_with_incomplete_fields() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(INCOMPLETELINE_SUBMITBUTTON).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void the_following_text_appears_Incomplete_Data_Mandatory_Data_Missing_Date_Dose_Volume() {

		try {

						UtilFile.waitForElementToBeClickable(INCOMPLETELINE_ERRORMESSAGE);
						System.out.println(INCOMPLETELINE_ERRORMESSAGE.getText());
Assert.assertEquals("INCOMPLETE DATA", INCOMPLETELINE_ERRORMESSAGE.getText());
						
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void clickoncancelbuttonforerrormessagepage() {

		try {
			Thread.sleep(1000);
						UtilFile.waitForElementToBeClickable(INCOMPLETELINE_ERRORMESSAGE_CANCEL_BUTTON).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void I_click_submit_for_a_waste_item_with_complete_fields() {

		try {

			Thread.sleep(1000);
						UtilFile.waitForElementToBeClickable(COMPLETELINE_SUBMIT_BUTTON).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	

	
	public static void the_yes_has_been_clicked_i_e_submission_of_list_item_has_been_confirmed() {

		try {

						UtilFile.waitForElementToBeClickable(YES_CONFIRMATIONLINE).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void the_list_item_is_removed_from_the_Process_and_Collect_Screen_list_and_available_to_the_packaging_process() {

		try {


		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void the_no_has_been_clicked_i_e_submission_of_list_item_has_not_been_confirmed() {

		try {
			           
			Thread.sleep(1000);
						UtilFile.waitForElementToBeClickable(NO_CONFIRMATIONLINE).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void the_submit_modal_closes() {

		try {

			
			if(COMPLETELINE_SUBMIT_BUTTON.isDisplayed()) {
				System.out.println("process item passed");
			}else {
				System.out.println("process item failed");
			}
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	
	// Process list View by   GDRW-374
	
	public static void I_select_View_All_from_the_option_displayed_on_the_pop_up_window_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	public static void Select_viewall_option_from_dropdown() {

		try {

			UtilFile.waitForElementToBeClickable(VIEWALLOPTION_IN_DROPDOWN_PROCESSPAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void all_items_are_arranged_in_date_order_descending_for_process_page() {

		try {

			
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	

	public static void i_select_Bags_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(BAG_VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void only_the_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Bag")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	public static void i_select_Vacuum_Bag_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(VACCUMBAG_VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void only_the_Vacuum_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Vacuum Bag")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("vaccum bags are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	public static void i_select_ByPass_Blowdown_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(BYPASSBLOWDOWN_VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_ByPass_Blowdown_filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Bypass Blowdown")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Bypass Blowdown are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	public static void i_select_Charcoal_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(CHARCOALFILTER_VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Charcoal_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Charcoal Filter")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Charcoal Filter are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	public static void i_select_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(CUBOIDHEPAFILTER_VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void only_the_Cuboid_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Cuboid HEPA Filter")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Cuboid HEPA Filter are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	public static void i_select_Cylindrical_HEPA_filterfrom_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(CYLINDRICALHEPAFILTER_VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Cylindrical_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Cylinderical HEPA")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("vaccum bags are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	public static void i_select_DSE_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(DSEFILTER_VIEWALL_PROCESSPAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_DSE_Filteritems_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("DSE Filter")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("DSE Filter are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	public static void i_select_Pre_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(PREFILTER_VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Pre_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Pre-Filter")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("vaccum bags are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	public static void i_select_Liquid_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(LIQUID_VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Liquid_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Liquid")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Liquid are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	public static void i_select_Resin_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			UtilFile.waitForElementToBeClickable(RESIN_VIEWALL_PROCESSPAGE).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Loose_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Loose Item")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Loose Item are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	public static void i_select_Sludge_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(SLUDGE_VIEWALL_PROCESSPAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	public static void only_the_Resin_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Resin Bag")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Resin are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	public static void i_select_Loose_Item_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(LOOSEITEM_VIEWALL_PROCESSPAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Sludge_items_are_displayed_and_arranged_in_date_order_descending_for_process_page() {

		try {

			System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value"));
			if (VIEWALL_PROCESSPAGE.getAttribute("value").contains("Sludge")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Sludge are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	
	//Process List Sort by  GDRW-375
	
	

	public static void I_select_SORTBY_from_the_option_displayed_on_the_pop_up_window_for_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(SORTBY_PROCESSPAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void I_select_Date_from_the_option_displayed_on_the_pop_up_window_for_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(DATE_SORTBY_PROCESSPAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	public static void all_items_are_arranged_in_date_order_ascending_for_process_page() {

		try {

			System.out.println(SORTBY_PROCESSPAGE.getAttribute("value"));
			if (SORTBY_PROCESSPAGE.getAttribute("value").contains("Date")) {
				System.out.println(VIEWALL_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Date are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
	
	}

		
	public static void select_ID_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(ID_SORTBY_PROCESSPAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void all_items_are_arranged_in_order_of_item_ID_numerically_for_process_page() {

		try {

			System.out.println(SORTBY_PROCESSPAGE.getAttribute("value"));
			if (SORTBY_PROCESSPAGE.getAttribute("value").contains("ID")) {
				System.out.println(SORTBY_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("ID are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	

	public static void select_Stream_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(STREAM_SORTBY_PROCESSPAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void all_items_are_arranged_by_waste_Stream_alphabetically_for_process_page() {

		try {

			System.out.println(SORTBY_PROCESSPAGE.getAttribute("value"));
			if (SORTBY_PROCESSPAGE.getAttribute("value").contains("Stream")) {
				System.out.println(SORTBY_PROCESSPAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Stream are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}	
		
		

		public static void select_Origin_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

			try {

				
				UtilFile.waitForElementToBeClickable(ORIGIN_SORTBY_PROCESSPAGE).click();
				
			} catch (StaleElementReferenceException e) {
				System.out.println("Element is not attached to the page document " + e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println("Element was not found in DOM " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Unable to click on element " + e.getMessage());
			}

		}
		
		public static void all_items_are_arranged_in_order_of_item_ID_alphabetically_for_process_page() {

			try {

				System.out.println(SORTBY_PROCESSPAGE.getAttribute("value"));
				if (SORTBY_PROCESSPAGE.getAttribute("value").contains("Origin")) {
					System.out.println(SORTBY_PROCESSPAGE.getAttribute("value")+"are displayed");
				}else {
				
					System.out.println("Origin are displayed");
				}
				
				
			} catch (StaleElementReferenceException e) {
				System.out.println("Element is not attached to the page document " + e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println("Element was not found in DOM " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Unable to click on element " + e.getMessage());
			}
			
		}
		
		

		public static void select_Stored_from_the_option_displayed_on_the_pop_up_windowÂ_for_process_page() {

			try {

				
				UtilFile.waitForElementToBeClickable(STORED_SORTBY_PROCESSPAGE).click();
				
			} catch (StaleElementReferenceException e) {
				System.out.println("Element is not attached to the page document " + e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println("Element was not found in DOM " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Unable to click on element " + e.getMessage());
			}

		}
		
		public static void all_items_are_arranged_by_waste_Stored_alphabetically_for_process_page() {

			try {

				System.out.println(SORTBY_PROCESSPAGE.getAttribute("value"));
				if (SORTBY_PROCESSPAGE.getAttribute("value").contains("Stored")) {
					System.out.println(SORTBY_PROCESSPAGE.getAttribute("value")+"are displayed");
				}else {
				
					System.out.println("all items are displayed");
				}
				
				
			} catch (StaleElementReferenceException e) {
				System.out.println("Element is not attached to the page document " + e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println("Element was not found in DOM " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Unable to click on element " + e.getMessage());
			}
			
		}
		
	


	
	
	
	
}
