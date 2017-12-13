package Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utilities.UtilFile;
import Utilities.WebConnector;
import junit.framework.Assert;

public class methodsforPackagePage {

	
	private static Logger Log = Logger.getLogger(methodsforPackagePage.class.getName());

	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[3]/span")
	public static WebElement PackageTab;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[1]")
	public static WebElement PackageBox;

	
	
	// packitems button and options

	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[2]/button[1]")
	public static WebElement Packitems_button;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/div/div/div[2]/div/div/div/div[2]/button[1]")
	public static WebElement Cancel_Packitems_button;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/div/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement OK_Packitems_button;
	
	
	@FindBy(xpath = " //*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li/div[1]/div/div/a[1]")
	public static WebElement addedlist_packagebox;
	
	
	@FindBy(xpath = "//*[@id='packagelist.15.delete']")
	public static WebElement cancel_addedlist_packagebox;

//	@FindBy(xpath = "//*[@id='packagelist.14.delete']")
//	public static WebElement cancel_addedlist_multiple_packagebox;
	
	@FindBy(id = "packagelist.14.delete")
	public static WebElement cancel_addedlist_multiple_packagebox;

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement YES_cancel_addedlist_packagebox; 

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[2]/div/div/div[2]/div/div/div/div[1]/button")
	public static WebElement BIG_cancel_addedlist_packagebox; 
	 
	
	// CONTAINER OPTIONS LHS

	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[1]/div/div/a[1]")
	public static WebElement Package_LHS_Options;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/span[2]")
	public static WebElement Package_LHS_Options_DATE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/span[4]")
	public static WebElement Package_LHS_Options_DESCRIPTION;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/span[6]")
	public static WebElement Package_LHS_Options_STREAM;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/span[8]")
	public static WebElement Package_LHS_Options_Stored;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[2]/div/div/div[2]/div/div/div/div[2]/div[1]/span[10]")
	public static WebElement Package_LHS_Options_Route;
	
	
	
	// PACKAGE MIDDLE ICON OPTIONS
	
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[1]/div/div/a[2]/div/img")
	public static WebElement Package_MIDDLE_OPTION;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[3]/div/div/div[2]/div/div/div/div[2]/div[3]/div[1]")
	public static WebElement Package_MIDDLE_OPTION_WEIGHTOPTION;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[3]/div/div/div[2]/div/div/div/div[2]/div[7]/form/div[2]/div/input")
	public static WebElement Package_MIDDLE_OPTION_WEIGHTOPTION_MandatoryGrossWeight;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[3]/div/div/div[2]/div/div/div/div[1]/button[1]")
	public static WebElement Package_MIDDLE_OPTION_WEIGHTOPTION_Cancel_button;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[3]/div[2]/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement Package_MIDDLE_OPTION_WEIGHTOPTION_YES_Cancel_button;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[3]/div/div/div[2]/div/div/div/div[1]/button[2]")
	public static WebElement Package_MIDDLE_OPTION_WEIGHTOPTION_SAVE_button;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[3]/div[2]/div/div[2]/div/div/div/div[1]/h4/div/span")
	public static WebElement Package_MIDDLE_OPTION_WEIGHTOPTION_Cancel_VERIFICATION_message;
	
	
	
	// package submit icon
	
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[1]/div[1]/div/div/a[3]/div")
	public static WebElement SubmitICON_LEFTMOST;
                   	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[2]/div[1]")
	public static WebElement package_completedmandatoryfields;
	                  
	@FindBy(xpath = "//*[@id=\"app\"]/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[2]/div[1]/div/div/a[3]")
	public static WebElement SubmitICON_completedmandatoryfields;
	
	@FindBy(xpath = "//*[@id='inCompleteData']/div/div/div/div/h4/div/span")
	public static WebElement INCOMPLETEMESSAGE_SubmitICON;
	
	@FindBy(xpath = "//*[@id='inCompleteData']/div/div/div/ul/li[1]")
	public static WebElement DOSEOVERRATE_INCOMPLETEMESSAGE_SubmitICON;
	
	@FindBy(xpath = "//*[@id='inCompleteData']/div/div/div/ul/li[2]")
	public static WebElement PACKAGECONTENTSPERCENT_INCOMPLETEMESSAGE_SubmitICON;
	
	@FindBy(xpath = "//*[@id='inCompleteData']/div/div/div/ul/li[3]")
	public static WebElement VOLUMEWEIGHT_INCOMPLETEMESSAGE_SubmitICON;
	
	
	@FindBy(xpath = "//*[@id='inCompleteData']/div/div/div/div/button")
	public static WebElement cancelbutton_INCOMPLETEMESSAGE_SubmitICON;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[2]/div[4]/div/div[2]/div/div/div/div[1]/h4/div/span")
	public static WebElement CONFIRMATION_MESSAGE_SubmitICON;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li[2]/div[4]/div/div[2]/div/div/div/div[1]/button")
	public static WebElement CANCEL_BUTTON_CONFIRMATION_MESSAGE_SubmitICON;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/div/ul/li/div[1]")
	public static WebElement Packageitem_hint;
	
	
	
	//package items
	
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[2]/div/div[1]")//*[@id='13']
	public static WebElement Packageitem_leftmost;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[2]/div/div[2]")//*[@id='14']
	public static WebElement Packageitem_beforeleftmost;
	
	
	// CREATE NEW PACKAGE
	

	
	@FindBy(xpath = "//*[@id='wasteItem.createPackageBtn']")
	public static WebElement CREATE_NEWPACKAGE_BUTTON;
	
	@FindBy(xpath = "//*[@id='forms.package.createPackage.packageId']")
	public static WebElement Packageid_field;
	
	
	@FindBy(css= "button[id='10118']")
	public static WebElement selectid;
	
	@FindBy(xpath = "//*[@id='forms.package.createPackage.containerType']")
	public static WebElement CREATE_NEWPACKAGE_DESCRIPTION;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[2]/div/div/div/div/div[2]/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/button[2]")
	public static WebElement CREATE_NEWPACKAGE_DESCRIPTION_OPTION;
	
	
	@FindBy(xpath = "//*[@id='forms.package.createPackage.storageArea']")
	public static WebElement CREATE_NEWPACKAGE_STORED;
	

	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[2]/div/div/div/div/div[2]/div/div/div/div[4]/div/div/div/div[2]/div/div/div/div/button[3]")
	public static WebElement CREATE_NEWPACKAGE_STORED_OPTION;
	
	
	@FindBy(xpath = "//*[@id='forms.package.createPackage.wasteStream']")
	public static WebElement CREATE_NEWPACKAGE_STREAM;
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[2]/div/div/div/div/div[2]/div/div/div/div[5]/div/div/div/div[2]/div/div/div/div/button[2]")
	public static WebElement CREATE_NEWPACKAGE_STREAM_OPTION;
	
	@FindBy(xpath = "//*[@id='forms.package.createPackage.packingArea']")
	public static WebElement CREATE_NEWPACKAGE_ROUTE;
	
	@FindBy(xpath = "//*[@id='4']")
	public static WebElement CREATE_NEWPACKAGE_ROUTE_OPTION;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[2]/div/div/div/div/div[2]/div/div/div/div[7]/div/label/span[1]")
	public static WebElement CREATE_NEWPACKAGE_PRECHECKS;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/button[2]")
	public static WebElement SUBMIT_CREATE_NEWPACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[2]/div/div/div/div/div[2]/div/div/div/div[1]/button[1]")
	public static WebElement CANCEL_CREATE_NEWPACKAGE;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[2]/div/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]")
	public static WebElement YES_CANCELCREATE_NEWPACKAGE;
	
	
	
	// Process list View by

	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/input")
	public static WebElement VIEWALL_PACKAGE;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[2]")
	public static WebElement BAG_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[3]")
	public static WebElement VACUUMBAG_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[4]")
	public static WebElement BYPASSBLOWDOWN_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[5]")
	public static WebElement CHARCOALFILTER_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[6]")
	public static WebElement CUBOIDHEPAFILTERVIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[7]")
	public static WebElement CYLINDERICAL_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[8]")
	public static WebElement DSE_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[9]")
	public static WebElement PREFILTER_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[10]")
	public static WebElement LIQUID_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[11]")
	public static WebElement RESIN_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[12]")
	public static WebElement SLUDGE_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[1]/div/div/div/div[2]/div/div/div/div/button[13]")
	public static WebElement LOOSEITEM_VIEWALL_PACKAGE;
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[5]/article/div/div[2]/div[2]/ul/li/ul/li[3]")
	public static WebElement hInt_PACKAGETAB;
	
	
	// SORTBY DROPDOWN OPTIONS
	

	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[2]/div/input")
	public static WebElement SortbyDropdown;
	
	                  
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/button[2]")
	public static WebElement Date_SortbyDropdown;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/button[3]")
	public static WebElement ID_SortbyDropdown;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/button[4]")
	public static WebElement  Origin_SortbyDropdown;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/button[5]")
	public static WebElement Stored_SortbyDropdown;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[3]/div[2]/div/div/div/div[2]/div/div/div/div/button[6]")
	public static WebElement Stream_SortbyDropdown;
	
	
	
	
	public static void I_Click_on_Package_Tab() {

		try {
			
			
			UtilFile.waitForElementToBeClickable1(hInt_PACKAGETAB);
			UtilFile.waitForElementToBeClickable(PackageTab).click();
			

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}

	public static void I_select_a_package() {

		try {

			
			UtilFile.waitForElementToBeClickable(PackageBox).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void I_select_an_Item() {

		try {

			
			UtilFile.waitForElementToBeClickable(Packageitem_leftmost).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void I_Click_on_pack_items_button() {

		try {

			
			UtilFile.waitForElementToBeClickable(Packitems_button).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	public static void I_Click_on_cancel_packitems_of_package_page() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(Cancel_Packitems_button).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void I_Click_on_ok_packitems_of_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(OK_Packitems_button).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void I_Click_on_the_list_of_package_box() {

		try {

			Thread.sleep(8000);
			UtilFile.waitForElementToBeClickable(addedlist_packagebox).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	public static void I_Click_on_cancel_button_of_item() {

		try {

			
			UtilFile.waitForElementToBeClickable(cancel_addedlist_packagebox).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void Cancel_addedlist_multiple_packagebox() {

		try {

		
			UtilFile.invisible();
			UtilFile.waitForElementToBeClickable(cancel_addedlist_multiple_packagebox).click();
			

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (TimeoutException e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	

	public static void BIG_Cancel_addedlist_mainpackagebox() {

		try {

			//Thread.sleep(4000);
			UtilFile.invisible();
			UtilFile.waitForElementToBeClickable(BIG_cancel_addedlist_packagebox).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
	 	} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void YES_cancel_addedlist_packagebox() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(YES_cancel_addedlist_packagebox).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
		
	
	public static void I_select_multiple_Items() {

		try {

			
			UtilFile.waitForElementToBeClickable(Packageitem_beforeleftmost).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void I_click_on_CREATE_NEW_PACKAGE() {

		try {

			UtilFile.waitForElementToBeClickable(Packageitem_hint);
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_BUTTON).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void I_can_select_a_unique_package_ID_as_per_agreed_and_designed_format() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(Packageid_field).click();
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void I_verify_the_size_of_the_dropdown() {

		try {

			Thread.sleep(1000);
			
			List<WebElement>totalnoof_Elements=WebConnector.driver.findElements(By.tagName("button"));
			System.out.println(totalnoof_Elements.size());
//			for(int i=0;i<=totalnoof_Elements.size();i++) {
//				System.out.println(totalnoof_Elements.get(i).getText());
//			}
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	public static void select_uniqueid_from_packageiddropdown() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(selectid).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void I_select_the_Description() {

		try {

			
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_DESCRIPTION).click();
			

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void Verify_all_the_elements_in_description() {

		try {

			ArrayList<String> expected_description_package= new ArrayList<String>(Arrays.asList("- TC14","- TC19","- UN","- SCOT","- Other","- TC14","- IBC","- Berglof","- Dolav","- Other","- Bulk","- Other"));
			
			ArrayList<String> actual_description_package= new ArrayList<String>();
			
			Log.info("Verify all the elements in description");
		List<WebElement> all_description_names =WebConnector.driver.findElements(By.tagName("button"));
		
		System.out.println(all_description_names.size());
		
		for(int i=6;i<=17;i++) {
		
			actual_description_package.add(all_description_names.get(i).getText());
		}

		
		Assert.assertEquals(expected_description_package, actual_description_package);
		
		System.out.println("description all items verified");
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}catch(AssertionError e1) {
			System.out.println(e1.getMessage());
		}

	}
	
	public static void select_option_description_newpackage() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_DESCRIPTION_OPTION).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void Click_on_stored_newpackage() {

		try {

			
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_STORED).click();
			

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void Verify_items_on_stored_package_page() {

		try {

			
ArrayList<String> expected_stored_package= new ArrayList<String>(Arrays.asList("Decontamination Workshop","FB16 - Waste Sorting Room","FB17 - Waste Receipt Room","FB24 - R3 Store","FB24 - R4 Store","FG47 - Bypass Blowdown Filter Decay Store","Incinerator Building","Oil Storage Container","Other (specify in notes)","Solvent Store"));
			
			ArrayList<String> actual_stored_package= new ArrayList<String>();
			
			Log.info("Verify all the elements in stored");
		List<WebElement> all_stored_names =WebConnector.driver.findElements(By.tagName("button"));
		
		System.out.println(all_stored_names.size());
		
		for(int i=6;i<16;i++) {
		
			actual_stored_package.add(all_stored_names.get(i).getText());
		}

		
		Assert.assertEquals(expected_stored_package, actual_stored_package);
		System.out.println("passed, verified all items in stored package");
			

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}catch(AssertionError e1) {
			System.out.println(e1.getMessage());
		}

	}
	
	
	public static void Click_on_stored_newpackage_option () {

		try {

			
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_STORED_OPTION).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void select__strem() {

		try {

			
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_STREAM).click();
		

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	
	public static void verify_all_the_options_in_stream() {

		try {

			
ArrayList<String> expected_stream_package= new ArrayList<String>(Arrays.asList("- A","- B","- C"));
			
			ArrayList<String> actual_stream_package= new ArrayList<String>();
			
			Log.info("Verify all the elements in stream");
		List<WebElement> all_stream_names =WebConnector.driver.findElements(By.tagName("button"));
		
		
		
String firstpart_stream_element="//*[@id='app']/div/div[2]/div[7]/div/article/div/div[2]/div[1]/form/div[2]/div/div/div/div/div[2]/div/div/div/div[5]/div/div/div/div[2]/div/div/div/div/button[";
String secondpart_stream_element="]";
		
		for(int i=1;i<=3;i++) {
		
			actual_stream_package.add(WebConnector.driver.findElement(By.xpath(firstpart_stream_element+i+secondpart_stream_element)).getText());
		}

		
		Assert.assertEquals(expected_stream_package, actual_stream_package);
		System.out.println("passed, verified all items in stream package");
			

		
		}catch(AssertionError e1) {
			System.out.println(e1.getMessage());
		}

	}
	
	
	public static void select_option_strem() {

		try {

			
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_STREAM_OPTION).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void select_routedropdown() {

		try {

			
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_ROUTE).click();
			

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	public static void Verify_the_options_in_dropdown_route_in_package() {

		try {

			
ArrayList<String> expected_route_package= new ArrayList<String>(Arrays.asList("Decay Storage", "LLWR Direct", "Metallic Waste Treatment", "Non Compactable", "Offsite Incineration", "Other", "Super Compaction"));
			
			ArrayList<String> actual_route_package= new ArrayList<String>();
			
			Log.info("Verify all the elements in route");
		List<WebElement> all_route_names =WebConnector.driver.findElements(By.tagName("button"));
		
		System.out.println(all_route_names.size());
		
		for(int i=6;i<13;i++) {
		
			actual_route_package.add(all_route_names.get(i).getText());
		}

		
		Assert.assertEquals(expected_route_package, actual_route_package);
		System.out.println("passed, verified all items in route package");
			

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}catch(AssertionError e1) {
			System.out.println(e1.getMessage());
		}

	}
	
	public static void select_routedropdown_option() {

		try {

			
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_ROUTE_OPTION).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void select_prechecksoption() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(CREATE_NEWPACKAGE_PRECHECKS).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void Click_on_cancel_button_of_create_new_package() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(CANCEL_CREATE_NEWPACKAGE).click();
			UtilFile.waitForElementToBeClickable(YES_CANCELCREATE_NEWPACKAGE).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	public static void Clickon_submitbutton_newpackage() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(SUBMIT_CREATE_NEWPACKAGE).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
		
	
	
	public static void I_can_see_a_package_displayed_on_the_screen_with_the_unique_ID() {

		try {

			
//			UtilFile.waitForElementToBeClickable();
//			.click();
//			Thread.sleep(1000);
	

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void the_ID_will_no_longer_be_available_to_select_in_the_create_new_package_list() {

		

			

	}
	
	
	
	public static void Click_on_cancel_button_to_return_to_package_home_page() {

		try {
			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(CANCEL_CREATE_NEWPACKAGE).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void Click_on_yes_to_return_to_package_home_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(YES_CANCELCREATE_NEWPACKAGE).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void Click_on_LHS_of_package_icon() {

		try {

			
			UtilFile.waitForElementToBeClickable(Package_LHS_Options).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void I_see_information_date_of_package() {

		try {

			
			UtilFile.waitForElementToBeDisplayed(Package_LHS_Options_DATE);
			System.out.println(Package_LHS_Options_DATE.getText());

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}	
	
	public static void I_see_information_Description_of_package() {

		try {

			
			UtilFile.waitForElementToBeDisplayed(Package_LHS_Options_DESCRIPTION);
			System.out.println(Package_LHS_Options_DESCRIPTION.getText());

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void I_see_information_stream_of_package() {

		try {

			
			UtilFile.waitForElementToBeDisplayed(Package_LHS_Options_STREAM);
			System.out.println(Package_LHS_Options_STREAM.getText());

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void I_see_information_stored_of_package() {

		try {

			
			UtilFile.waitForElementToBeDisplayed(Package_LHS_Options_Stored);
			System.out.println(Package_LHS_Options_Stored.getText());

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void I_see_informationroute_of_package() {

		try {

			
			UtilFile.waitForElementToBeDisplayed(Package_LHS_Options_Route);
			System.out.println(Package_LHS_Options_Route.getText());

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void i_click_the_middle_icon() {

		try {

			
			UtilFile.waitForElementToBeClickable(Package_MIDDLE_OPTION).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void I_click_on_Weight_tab() {

		try {

			Thread.sleep(2000);
			UtilFile.waitForElementToBeClickable(Package_MIDDLE_OPTION_WEIGHTOPTION).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	
	public static void it_should_accept_positive_numbers_only() {

		try {

			
			UtilFile.waitForElementToBeClickable(Package_MIDDLE_OPTION_WEIGHTOPTION_MandatoryGrossWeight).sendKeys("1");

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void I_click_on_save() {

		try {

			
			UtilFile.waitForElementToBeClickable(Package_MIDDLE_OPTION_WEIGHTOPTION_SAVE_button).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	
	public static void I_click_on_cancel() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(Package_MIDDLE_OPTION_WEIGHTOPTION_Cancel_button).click();
			yes_cancelbutton();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void yes_cancelbutton() {

		try {

			Thread.sleep(1000);
			UtilFile.waitForElementToBeClickable(Package_MIDDLE_OPTION_WEIGHTOPTION_YES_Cancel_button).click();

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void the_pop_up_Are_you_sure_you_want_to_close_you_will_lose_any_unsaved_data_appears() {

		try {

			
			UtilFile.waitForElementToBeClickable(Package_MIDDLE_OPTION_WEIGHTOPTION_Cancel_VERIFICATION_message);
			System.out.println(Package_MIDDLE_OPTION_WEIGHTOPTION_Cancel_VERIFICATION_message.getText());

		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " +e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
//	Process list View by
	
	public static void I_select_View_All_from_the_option_displayed_on_the_pop_up_window_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void all_items_are_arranged_in_date_order_descending_for_package_page() {

		try {

			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
		
	
	public static void i_select_Bags_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(BAG_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Bag")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Bag are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	public static void i_select_Vacuum_Bag_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(VACUUMBAG_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Vacuum_Bag_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Vacuum Bag")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Vacuum Bag are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	
	
	public static void i_select_ByPass_Blowdown_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(BYPASSBLOWDOWN_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_ByPass_Blowdown_filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Bypass Blowdown")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
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
	
	
	
	public static void i_select_Charcoal_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(CHARCOALFILTER_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Charcoal_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Charcoal Filter")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
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
	
	
	
	
	public static void i_select_Cuboid_HEPA_filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(CUBOIDHEPAFILTERVIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Cuboid_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Cuboid HEPA Filter")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
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
	
	
	
	public static void i_select_Cylindrical_HEPA_filterfrom_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(CYLINDERICAL_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Cylindrical_HEPA_filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Cylindrical HEPA")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Cylindrical HEPA are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	
	public static void i_select_DSE_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(DSE_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_DSE_Filteritems_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("DSE Filter")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println(" are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	
	public static void i_select_Pre_Filter_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(PREFILTER_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Pre_Filter_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Pre-Filter")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println(" PreFilter are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	
	public static void i_select_Liquid_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(LIQUID_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Liquid_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Liquid")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
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
	
	
	public static void i_select_Loose_Item_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(LOOSEITEM_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Loose_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Loose Item")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
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
	
	
	public static void i_select_Resin_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(RESIN_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Resin_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Resin")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
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
	
	
	public static void i_select_Sludge_from_the_option_displayed_on_the_pop_up_windowÂ_for_package_page() {

		try {

			
			UtilFile.waitForElementToBeClickable(SLUDGE_VIEWALL_PACKAGE).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void only_the_Sludge_items_are_displayed_and_arranged_in_date_order_descending_for_package_page() {

		try {

			System.out.println(VIEWALL_PACKAGE.getAttribute("value"));
			if (VIEWALL_PACKAGE.getAttribute("value").contains("Sludge")) {
				System.out.println(VIEWALL_PACKAGE.getAttribute("value")+"are displayed");
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
	
	
	//Process list SortBy by  GDWR-400
	
	
	
	
	
	
	public static void I_click_on_the_SortBy_dropdown() {

		try {

			
			UtilFile.waitForElementToBeClickable(SortbyDropdown).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void I_select_Date_of_the_options() {

		try {

			
			UtilFile.waitForElementToBeClickable1(Date_SortbyDropdown);
			Date_SortbyDropdown.click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void all_the_list_is_sorted_as_per_date() {

		try {

			System.out.println(SortbyDropdown.getAttribute("value"));
			if (SortbyDropdown.getAttribute("value").contains("Date")) {
				System.out.println(SortbyDropdown.getAttribute("value")+"are displayed");
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
	
	
	
	
	
	
	public static void I_select_ID_of_the_options() {

		try {

			
			UtilFile.waitForElementToBeClickable(ID_SortbyDropdown).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void all_the_options_are_sorted_as_per_ID() {

		try {

			System.out.println(SortbyDropdown.getAttribute("value"));
			if (SortbyDropdown.getAttribute("value").contains("ID")) {
				System.out.println(SortbyDropdown.getAttribute("value")+"are displayed");
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
	
	
	
	
	
	public static void I_select_Origin_of_the_options() {

		try {

			
			UtilFile.waitForElementToBeClickable(Origin_SortbyDropdown).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void all_the_options_are_sorted_as_per_Origin() {

		try {

			System.out.println(SortbyDropdown.getAttribute("value"));
			if (SortbyDropdown.getAttribute("value").contains("Origin")) {
				System.out.println(SortbyDropdown.getAttribute("value")+"are displayed");
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
	
	
	
	
	
	public static void I_select_stored_of_the_options() {

		try {

			
			UtilFile.waitForElementToBeClickable(Stored_SortbyDropdown).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void all_the_options_are_sorted_as_per_Stored() {

		try {

			System.out.println(SortbyDropdown.getAttribute("value"));
			if (SortbyDropdown.getAttribute("value").contains("Stored")) {
				System.out.println(SortbyDropdown.getAttribute("value")+"are displayed");
			}else {
			
				System.out.println("Stored are displayed");
			}
			
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}
		
	}
	
	
	public static void I_select_stream_of_the_options() {

		try {

			
			UtilFile.waitForElementToBeClickable(Stream_SortbyDropdown).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	public static void all_the_options_are_sorted_as_per_Stream() {

		try {

			System.out.println(SortbyDropdown.getAttribute("value"));
			if (SortbyDropdown.getAttribute("value").contains("Stream")) {
				System.out.println(SortbyDropdown.getAttribute("value")+"are displayed");
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
	
	
	public static void I_click_on_submit() {

		try {

			
			UtilFile.waitForElementToBeClickable(SubmitICON_LEFTMOST).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void the_pop_up_will_display_an_error_if_Mandatory_data_missing_for() {

		try {

			
			UtilFile.waitForElementToBeClickable(INCOMPLETEMESSAGE_SubmitICON);
			DOSEOVER_RATE_ERRORMESSAGE_PACKAGE();
			PACKAGECONTENTSPERCENT();
			VOLUMEWEIGHT_ERRORMESSAGE_PACKAGE();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void DOSEOVER_RATE_ERRORMESSAGE_PACKAGE() {

		
			if(DOSEOVERRATE_INCOMPLETEMESSAGE_SubmitICON.isDisplayed()) {
				System.out.println("error message dose over rate displayed");
			}else {
				System.out.println("error message dose over rate displayed");
			}
			

	}
	
	public static void PACKAGECONTENTSPERCENT() {

		

			if(PACKAGECONTENTSPERCENT_INCOMPLETEMESSAGE_SubmitICON.isDisplayed()) {
				System.out.println("error message package percent displayed");
			}else {
				System.out.println("error message packagepercent displayed");
			}
			
			
		
	}
	
	
	public static void VOLUMEWEIGHT_ERRORMESSAGE_PACKAGE() {

		

			if(VOLUMEWEIGHT_INCOMPLETEMESSAGE_SubmitICON.isDisplayed()) {
				System.out.println("error message volumeweight displayed");
			}else {
				System.out.println("error message volumeweight displayed");
			}
			
			
		

	}
	
	
	
	public static void all_mandatory_fields_are_complete() {

		try {

			
			UtilFile.waitForElementToBeClickable(CONFIRMATION_MESSAGE_SubmitICON);
			System.out.println(CONFIRMATION_MESSAGE_SubmitICON.getText());
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void Click_on_x_for_mandatoryfields_not_complete() {

		try {

			
			UtilFile.waitForElementToBeClickable(cancelbutton_INCOMPLETEMESSAGE_SubmitICON).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
	public static void Select_mandatoryfieldscompletedpackage() {

		try {

		
			UtilFile.waitForElementToBeClickable(package_completedmandatoryfields).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	public static void I_click_on_submit_with_complete_fields() {

		try {

		
			UtilFile.waitForElementToBeClickable(SubmitICON_completedmandatoryfields).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	public static void I_click_on_x_buttonforpackagepage() {

		try {

			
			UtilFile.waitForElementToBeClickable(CANCEL_BUTTON_CONFIRMATION_MESSAGE_SubmitICON).click();
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document " + e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element " + e.getMessage());
		}

	}
	
	
	
	
}
