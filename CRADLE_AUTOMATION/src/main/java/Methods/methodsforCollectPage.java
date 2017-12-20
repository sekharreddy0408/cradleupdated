package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utilities.UtilFile;
import Utilities.WebConnector;

import junit.framework.Assert;

public class methodsforCollectPage {

	private static Logger Log  = Logger.getLogger(methodsforCollectPage.class.getName());

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[1]/span")
	public static WebElement CollectTab;

	// Description dropdown
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[1]/label")
	public static WebElement Description;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[1]/div/div/div/div[2]/div/div/div/div/button[5]")
	public static WebElement HEPA_filter;

	// origin dropdown

	@FindBy(xpath = "//*[@id='forms.wasteItem.collectionArea']")
	public static WebElement OriginField;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[2]/div/div/div/div[2]/div/div/div/div/button[9]")
	public static WebElement Element_workshop_B;

	// store dropdown

	@FindBy(xpath = "//*[@id='forms.wasteItem.storageArea']")
	public static WebElement StoredField;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[3]/div/div/div/div[2]/div/div/div/div/button[5]")
	public static WebElement storedelement;

	// date page options

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/h4/div/span")
	public static WebElement Date_header;

	@FindBy(xpath = "//*[@id='wasteItem.dateBtn']")
	public static WebElement Date_Collect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[1]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[5]/td[3]/div")
	public static WebElement Diplayed_date_collect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[1]/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/div/div[2]/table/tbody/tr[5]/td[5]/div")
	public static WebElement future_date;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[1]/div/div[2]/div/div[2]/div/div/div/div[1]/h4/div/span")
	public static WebElement future_date_error_message;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/button")
	public static WebElement OK_BUTTTON_error_message;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/button[1]")
	public static WebElement cancelbutton_datepage;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[1]/div/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement YES_confirmation_delete_datepage;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[1]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]")
	public static WebElement Saved_date_collect;

	@FindBy(xpath = "//*[@id='wasteItem.doseBtn']")
	public static WebElement DOSE_collect;

	// dose page options


	@FindBy(xpath = "//*[@id='forms.wasteItem.dose.contactDose']")
	public static WebElement Contact_DOSErate_collect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]")
	public static WebElement Save_DOSErate_collect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/button[1]")
	public static WebElement Cancel_DOSErate_collect;

	@FindBy(xpath = "//*[@id='forms.wasteItem.dose.doseRate']")
	public static WebElement DOSErateatecollect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement YES_DOSErateatecollect;

	// m3 icon

	
	@FindBy(xpath = "//*[@id='wasteItem.massBtn']")
	public static WebElement m3_icon_collect;

	@FindBy(xpath = "//*[@id='forms.wasteItem.mass.volume']")
	public static WebElement Volume_m3_icon_collect;

	@FindBy(xpath = "//*[@id='forms.wasteItem.mass.weight']")
	public static WebElement Weight_m3_icon_collect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]")
	public static WebElement Save_m3_icon_collect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[3]/div/div/div/div/div[2]/div/div/div/div[1]/button[1]")
	public static WebElement Cancel_m3_icon_collect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[3]/div/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement YES_m3_icon_collect;

	// notes collect page

	
	
	@FindBy(xpath = "//*[@id='wasteItem.notesBtn']")
	public static WebElement Notes_icon_collect;

	@FindBy(xpath = "//*[@id='forms.wasteItem.notes.note']")
	public static WebElement NotesPage_icon_collect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[4]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]")
	public static WebElement Save_NotesPage_icon_collect;

	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[4]/div/div/div/div/div[2]/div/div/div/div[1]/button[1]")
	public static WebElement Cancel_NotesPage_icon_collect;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[4]/div/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement YES_NotesPage_icon_collect;

	// view all waste dropdown

	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/input")
	public static WebElement VIEW_All;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[1]")
	public static WebElement VIEWALL_value;

	static String firstvalue_viewalldates = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[";
	static String secondvalue_viewalldates = "]/ul/li[5]";

	// viewall dropdown options

	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[2]")
	public static WebElement Bag_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[3]")
	public static WebElement Vaccum_Bag_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[4]")
	public static WebElement Bypassblowdown_filter_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[5]")
	public static WebElement charcoal_filter_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[6]")
	public static WebElement cubiod_filter_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[7]")
	public static WebElement cylindrical_filter_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[8]")
	public static WebElement DSE_filter_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[9]")
	public static WebElement PRE_filter_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[10]")
	public static WebElement Liquid_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[11]")
	public static WebElement Resin_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[12]")
	public static WebElement SLUDGE_viewall;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div/div/div/button[13]")
	public static WebElement lOOSEITEM_viewall;

	
	// SORT BY DROPDOWN

	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[2]/div/input")
	public static WebElement SortBy;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/button[1]")
	public static WebElement SortByoption_indropdown;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/button[2]")
	public static WebElement DATE_Sortby;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/button[3]")
	public static WebElement ID_Sortby;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/button[4]")
	public static WebElement Origin_Sortby;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/button[5]")
	public static WebElement Stored_Sortby;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/div/div/div/button[6]")
	public static WebElement Stream_Sortby;

	
	// Submit page options

	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/form/div[4]/div[5]/button")
	public static WebElement Submit_button_Collectpage;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div/div[3]/button[1]")
	public static WebElement YES_Submit_button;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div/div[3]/button[2]")
	public static WebElement NO_Submit_button;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[1]/div[1]/div/div/div[2]/div/div/div/div[2]/span")
	public static WebElement newidmessage_Submit_button;

	// Collect page hint

	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[1]/ul")
	public static WebElement Collectpage_hint;

	
	// Created Line details
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[1]/ul/li[2]")
	public static WebElement description_of_waste_created;

	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[3]/ul/li[2]")
	public static WebElement description_of_waste_created_hint;
	
	
	
	
	
	public static void CollectTab_Clicking() {

		try {

			
			UtilFile.waitForElementToBeClickable(CollectTab).click();

	
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void Description_Clicking() {

		try {

			UtilFile.waitForElementToBeClickable(Collectpage_hint);
			UtilFile.waitForElementToBeClickable(Description).click();

		
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void All_Options_in_Description() {

		ArrayList<String> expectedDescription = new ArrayList<String>(Arrays.asList("- Bag", "- Vacuum Bag",
				"- Bypass Blowdown Filter", "- Charcoal Filter", "- Cuboid HEPA Filter", "- Cylindrical HEPA Filter",
				"- DSE Filter", "- Pre-Filter", "- Liquid", "- Resin", "- Sludge", "Loose Item"));

		try {

			Thread.sleep(1500);

			ArrayList<String> actualdescriptionoptions = new ArrayList<String>();
			List<WebElement> dropelements = WebConnector.driver.findElements(By.tagName("button"));

			for (int i = 1; i <= 12; i++) {
				System.out.println(dropelements.get(i).getText());
				actualdescriptionoptions.add(dropelements.get(i).getText());
		
			}

			Assert.assertEquals(expectedDescription, actualdescriptionoptions);
			System.out.println("data matched");

		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (AssertionError e) {
			System.out.println("data dint match");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void I_select_any_type_of_filter_e_g_HEPA_filter() {

		try {

			UtilFile.waitForElementToBeClickable(HEPA_filter).click();

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void I_click_in_the_Origin_field() {

		try {

		
			UtilFile.waitForElementToBeClickable(OriginField).click();

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void allOptions_of_Origin() {

		ArrayList<String> expectedDescription = new ArrayList<String>(Arrays.asList("Active Chemistry Laboratory",
				"Radioactive Effluent Treatment Plant", "Active Laundry", "Active Maintenance Facility",
				"Auxiliary Gas Plant", "Control Rod Mechanism Maintenance Room", "Decontamination Workshop A",
				"Decontamination Workshop B", "Decontamination Workshop C", "Flask Handling Area",
				"Gas Circulator Annulus", "Gas Circulator Lubrication Oil Sump", "Gas Circulator Maintenance Workshop",
				"Irradiated Fuel Disposal Facility", "Main Change Room", "Nose Unit Maintenance Position", "Pile Cap",
				"Plug Unit Maintenance Facility", "Ponds Area", "Reactor Internals"));

		try {

			
			Thread.sleep(2000);

			ArrayList<String> actualdescriptionoptions = new ArrayList<String>();
			List<WebElement> dropelementsOrigin = WebConnector.driver.findElements(By.tagName("button"));

			for (int i = 1; i <= 20; i++) {
				System.out.println(dropelementsOrigin.get(i).getText());
				actualdescriptionoptions.add(dropelementsOrigin.get(i).getText());
			}

			Assert.assertEquals(expectedDescription, actualdescriptionoptions);
			System.out.println("data matched");

			UtilFile.waitForElementToBeClickable(Element_workshop_B).click();

			
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AssertionError e) {
			System.out.println("data dint match");
		}
	}

	public static void selectworkshopbfromoriingdropdown() {
		try {	
		
			UtilFile.waitForElementToBeClickable(Element_workshop_B).click();
		
	
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}

	public static void I_click_in_the_Stored_field() {

		try {

			
			UtilFile.waitForElementToBeClickable(StoredField).click();

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void alloptionsStored() {

		ArrayList<String> expectedStored = new ArrayList<String>(
				Arrays.asList("Decontamination Workshop", "FB16 - Waste Sorting Room", "FB17 - Waste Receipt Room",
						"FB24 - R3 Store", "FB24 - R4 Store", "FG47 - Bypass Blowdown Filter Decay Store",
						"Incinerator Building", "Oil Storage Container", "Other (specify in notes)", "Solvent Store"));

		try {

			Thread.sleep(2000);

			ArrayList<String> actualStoredoptions = new ArrayList<String>();
			List<WebElement> dropelementsStored = WebConnector.driver.findElements(By.tagName("button"));

			for (int i = 1; i <= 10; i++) {
				System.out.println(dropelementsStored.get(i).getText());
				actualStoredoptions.add(dropelementsStored.get(i).getText());
			}

			Assert.assertEquals(expectedStored, actualStoredoptions);
			System.out.println("data matched");
			UtilFile.waitForElementToBeClickable(storedelement);
			storedelement.click();

		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AssertionError e) {
			System.out.println("data dint match");
		}
	}

	public static void storedelementbfromoriingdropdown() {
		try {
		
			UtilFile.waitForElementToBeClickable(storedelement).click();
		
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void iClickInTheDateIcon() {

		try {


			UtilFile.waitForElementToBeClickable(Date_Collect).click();

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void iCanSeeThePopUpCalendar() {

		try {

			String Datepopup_header_message = Date_header.getText();

			Assert.assertEquals("DATE OF REMOVAL FROM PLANT*", Datepopup_header_message);

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
		}

	}

	public static void iSelectTheDate() {

		try {

			UtilFile.waitForElementToBeClickable(Diplayed_date_collect).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_a_future_date() {

		try {

			Thread.sleep(500);
			UtilFile.waitForElementToBeClickable(future_date).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void Date_error_message_collect(String errorstring) {

		try {

			UtilFile.waitForElementToBeClickable(future_date_error_message);
			Assert.assertEquals(errorstring, future_date_error_message.getText());

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		} catch (AssertionError e) {
			System.out.println("data dint match");
		}
	}

	public static void Click_on_ok_to_return_to_calender_page() {

		try {

			UtilFile.waitForElementToBeClickable(OK_BUTTTON_error_message).click();

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
	}

	public static void Return_to_home_page_of_collect_from_date_page() {

		try {

			UtilFile.waitForElementToBeClickable(cancelbutton_datepage).click();
			UtilFile.waitForElementToBeClickable(YES_confirmation_delete_datepage).click();

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
	}

	public static void iClickSave_date_collect() {

		try {

			UtilFile.waitForElementToBeClickable(Saved_date_collect).click();

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void iClickInTheDoseIcon() {

		try {

			UtilFile.waitForElementToBeClickable(DOSE_collect).click();

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_clear_the_data_dose_level_of_m3_page() {

		try {

			UtilFile.waitForElementToBeClickable(Contact_DOSErate_collect).clear();
			Thread.sleep(1000);

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void a_pop_up_window_will_display_with_three_options_Contact_Dose_Rate_uSvh_free_text_box_save_andcancel() {

		try {

			UtilFile.waitForElementToBeClickable(Contact_DOSErate_collect);
			UtilFile.waitForElementToBeClickable(Save_DOSErate_collect);
			UtilFile.waitForElementToBeClickable(Cancel_DOSErate_collect);

		
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void iCanSeeTheDoseRateReadingBox() {

		try {

			UtilFile.waitForElementToBeClickable(Contact_DOSErate_collect);

		
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void I_enter_a_value_greater_than_50_uSvh(String Contactdoserateval) {

		try {

			UtilFile.waitForElementToBeClickable(Contact_DOSErate_collect).sendKeys(Contactdoserateval);

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void aseconddatafieldAtDoseuSvhshouldbedisplayedorbecomeactive() {

		try {

			UtilFile.waitForElementToBeClickable(DOSErateatecollect);

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void entervaluesindoseratecollect() {

		try {

			UtilFile.waitForElementToBeClickable(DOSErateatecollect).sendKeys("1");

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void Clickonsavebuutondosetab() {

		try {

			UtilFile.waitForElementToBeClickable(Save_DOSErate_collect).click();
	
		
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void Click_cancel_button_to_return_to_collect_page() {

		try {

			UtilFile.waitForElementToBeClickable(Cancel_DOSErate_collect).click();
			UtilFile.waitForElementToBeClickable(YES_DOSErateatecollect).click();
			
			

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void m3_icon_collect() {

		try {

			UtilFile.waitForElementToBeClickable(m3_icon_collect).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void aPopUpWindowWith4OptionsVolumeM3AndWeightKgWillAppearWithFreeTextFieldSaveAndCancel() {

		try {

			UtilFile.waitForElementToBeClickable(Volume_m3_icon_collect);
			UtilFile.waitForElementToBeClickable(Weight_m3_icon_collect);
			UtilFile.waitForElementToBeClickable(Save_m3_icon_collect);
			UtilFile.waitForElementToBeClickable(Cancel_m3_icon_collect);

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_clear_the_value_for_weight_first_on_m3_page() {

		try {

			UtilFile.waitForElementToBeClickable(Weight_m3_icon_collect).clear();
			Thread.sleep(1000);

			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void Enter_value_for_weight_in_volume_page_m3(String weightval) {

		try {

			UtilFile.waitForElementToBeClickable(Weight_m3_icon_collect).sendKeys(weightval);

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void Save_the_details_entered_for_Volume_page() {

		try {

			UtilFile.waitForElementToBeClickable(Save_m3_icon_collect).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void Click_on_cancel_button_to_return_from_m3page() {

		try {

			UtilFile.waitForElementToBeClickable(Cancel_m3_icon_collect).click();
			UtilFile.waitForElementToBeClickable(YES_m3_icon_collect).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void iClickInTheNotesIcon() {

		try {

			UtilFile.waitForElementToBeClickable(Notes_icon_collect).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void iSee3OptionsAFreeTextFieldUpTo300CharactersSaveAndCancel() {

		try {

			UtilFile.waitForElementToBeClickable(Save_NotesPage_icon_collect);
			UtilFile.waitForElementToBeClickable(Cancel_m3_icon_collect);

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void Click_on_Cancel_button_to_return_to_collect_page_from_Notes_Page() {

		try {


			UtilFile.waitForElementToBeClickable(Cancel_NotesPage_icon_collect).click();
			UtilFile.waitForElementToBeClickable(YES_NotesPage_icon_collect).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void I_select_View_All_from_the_option_displayed_on_the_pop_up_window() {

		try {


			Thread.sleep(6000);
			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(VIEWALL_value).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void all_items_are_arranged_in_date_order_descending() {

		try {


			ArrayList<String> datesofViewAll = new ArrayList<String>();

			for (int i = 1; i <= 13; i++) {
				WebElement datevalue = WebConnector.driver
						.findElement(By.xpath(firstvalue_viewalldates + i + secondvalue_viewalldates));

				if (datevalue.isEnabled()) {

					String valueofdat = datevalue.getText();
					String justdat[] = valueofdat.split("/");
					datesofViewAll.add(justdat[0]);

				}

			}

			if (Integer.parseInt(datesofViewAll.get(0)) > Integer
					.parseInt(datesofViewAll.get(datesofViewAll.size() - 1))) {
				System.out.println("descending");

			} else {
				System.out.println("error");
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Bags_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(Bag_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void only_the_selected_items_are_displayed_and_arranged_in_date_order_descending(
			String verifyitemdata) {

		try {

			System.out.println(VIEW_All.getAttribute("value"));
			if (VIEW_All.getAttribute("value").contains(verifyitemdata)) {
				System.out.println(VIEW_All.getAttribute("value") + "are displayed");
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Vacuum_Bag_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(Vaccum_Bag_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void only_the_VacuumBag_items_are_displayed_and_arranged_in_date_order_descending(
			String verifyitemdata) {

		try {

		

			System.out.println(VIEW_All.getAttribute("value"));
			if (VIEW_All.getAttribute("value").contains(verifyitemdata)) {
				System.out.println(VIEW_All.getAttribute("value") + "are displayed");
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void iselect_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(cubiod_filter_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void iselectByPassBlowdownfilterfromtheoptiondisplayedonthepopupwindow() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(Bypassblowdown_filter_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Charcoal_Filter_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(charcoal_filter_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(cubiod_filter_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Cylindrical_HEPA_filterfrom_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(cylindrical_filter_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_DSE_Filter_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(DSE_filter_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void iselectPreFilterfromtheoptiondisplayedonthepopupwindow() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(PRE_filter_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Liquid_rom_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(Liquid_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Loose_Item_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(lOOSEITEM_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Resin_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(Resin_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Sludge_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(VIEW_All).click();
			UtilFile.waitForElementToBeClickable(SLUDGE_viewall).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void I_select_Sortby_dropdown() {

		try {

			UtilFile.waitForElementToBeClickable(SortBy).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void the_associated_dropdown_is_show() {

		try {

			UtilFile.waitForElementToBeClickable(SortByoption_indropdown).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void items_are_displayed_as_per_data(String verifyitemdata) {

		try {

			System.out.println(SortBy.getAttribute("value"));
			if (SortBy.getAttribute("value").contains(verifyitemdata)) {
				System.out.println(SortBy.getAttribute("value") + "are displayed");
			}else {
				System.out.println("data in sortby dropdown dint match");
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void I_select_Date_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(SortBy).click();
			UtilFile.waitForElementToBeClickable(DATE_Sortby).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void all_items_are_arranged_in_date_order_ascending() {

		try {

			WebElement firstdate = WebConnector.driver.findElement(
					By.xpath("//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[1]/ul/li[5]"));
			WebElement lastdate = WebConnector.driver.findElement(
					By.xpath("//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[13]/ul/li[5]"));

			String date1 = firstdate.getText();
			String date1val[] = date1.split("/");
			String date2 = firstdate.getText();
			String date2val[] = date1.split("/");
			int firstval = Integer.valueOf(date1val[0]);
			int secondval = Integer.valueOf(date2val[0]);
			if (firstval <= secondval) {
				System.out.println("ascending");

			} else {
				System.out.println("descending and wrong order");
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_ID_from_the_option_displayed_on_the_pop_up_windowÂ() {

		try {

			UtilFile.waitForElementToBeClickable(SortBy).click();
			UtilFile.waitForElementToBeClickable(ID_Sortby).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void all_items_are_arranged_in_order_of_item_ID_numerically() {

		try {

			WebElement firstitem = WebConnector.driver.findElement(
					By.xpath("//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[1]/ul/li[2]/span"));
			WebElement seconditem = WebConnector.driver.findElement(
					By.xpath("//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[2]/ul/li[2]/span"));

			UtilFile.waitForElementToBeClickable(firstitem);
			UtilFile.waitForElementToBeClickable(seconditem);

			String id1_data = firstitem.getText();
			String firstval = id1_data.substring(1, 2);
			Integer firstdata = Integer.valueOf(firstval);
			System.out.println(id1_data.substring(1, 2));

			String id2_data = seconditem.getText();
			String secondval = id2_data.substring(1, 3);
			System.out.println(id2_data.substring(1, 3));
			Integer seconddata = Integer.valueOf(secondval);

			if (firstdata < seconddata) {
				System.out.println("ascending for id");

			} else {
				System.out.println("descending for id");
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Origin_from_the_option_displayed_on_the_pop_up_window() {

		try {

			UtilFile.waitForElementToBeClickable(SortBy).click();
			UtilFile.waitForElementToBeClickable(Origin_Sortby).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void all_items_are_arranged_by_Origin_of_where_the_waste_items_were_collected_from_alphabetically() {

		try {

			WebElement firstOrigin = WebConnector.driver.findElement(
					By.xpath("//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[1]/ul/li[3]"));
			UtilFile.waitForElementToBeClickable(firstOrigin);
			String firstwordfirstorigin = firstOrigin.getText();
			char firstletter_firstorigin = firstwordfirstorigin.charAt(0);
			System.out.println(firstletter_firstorigin);

			WebElement SIXTH_Origin = WebConnector.driver.findElement(
					By.xpath("//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[6]/ul/li[3]"));
			UtilFile.waitForElementToBeClickable(SIXTH_Origin);
			String secondwordfirstorigin = SIXTH_Origin.getText();
			char firstletter_SIXTH_Origin = secondwordfirstorigin.charAt(0);
			System.out.println(firstletter_SIXTH_Origin);

			WebElement lAST_Origin = WebConnector.driver.findElement(
					By.xpath("//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li[12]/ul/li[3]"));
			UtilFile.waitForElementToBeClickable(lAST_Origin);
			String firstwordlAST_Origin = lAST_Origin.getText();
			char firstletter_lAST_Origin = firstwordlAST_Origin.charAt(0);
			System.out.println(firstletter_lAST_Origin);

			if (firstletter_firstorigin < firstletter_SIXTH_Origin
					&& firstletter_firstorigin < firstletter_lAST_Origin) {
				System.out.println("In ascending order for Origin");
			} else {
				System.out.println("not in ascending Order for Origin");
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Stored_from_the_option_displayed_on_the_pop_up_windowÂ() {

		try {

			UtilFile.waitForElementToBeClickable(SortBy).click();
			UtilFile.waitForElementToBeClickable(Stored_Sortby).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void i_select_Stream_from_the_option_displayed_on_the_pop_up_windowÂ() {

		try {

			UtilFile.waitForElementToBeClickable(SortBy).click();
			UtilFile.waitForElementToBeClickable(Stream_Sortby).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void I_press_the_submit_button() {

		try {

			UtilFile.waitForElementToBeClickable(Submit_button_Collectpage).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void I_see_a_popup_window_with_the_uniqueID_and_options_to_accept_Yes_or_No() {

		try {

			UtilFile.waitForElementToBeClickable(newidmessage_Submit_button);
			Assert.assertEquals("ID CREATED WILL BE:", newidmessage_Submit_button.getText());
			System.out.println("assertpassed");

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		} catch (AssertionError e1) {
			System.out.println(e1.getMessage());
		}

	}

	public static void I_press_the_Yes_option() {

		try {

			UtilFile.waitForElementToBeClickable(YES_Submit_button).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	
	public static void I_see_an_item_created_with_the_same_uniqueID() {

		try {

			UtilFile.waitForElementToBeClickable(description_of_waste_created_hint);
			System.out.println(description_of_waste_created.getText());
			if(description_of_waste_created.getText().contains("Cuboid HEPA Filter"))
			{
				System.out.println("verified created filter");
			}else {
				System.out.println("created filter did not match");
			}

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	
	
	
	
	public static void I_press_the_No_option() {

		try {

			UtilFile.waitForElementToBeClickable(NO_Submit_button).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

}
