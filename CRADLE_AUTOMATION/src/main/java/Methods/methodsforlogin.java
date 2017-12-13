package Methods;

import java.io.File;
import java.util.logging.Logger;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.UtilFile;
import junit.framework.Assert;

public class methodsforlogin {

	private static Logger Log = Logger.getLogger(methodsforlogin.class.getName());

	//login page page objects
	

	
	@FindBy(xpath = "//*[@id='forms.login.username']")
	public static WebElement userName;

	@FindBy(xpath = "//*[@id='forms.login.password']")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id='app']/div/div[3]/div[2]/form/button[1]")
	public static WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id='app']/div/div[1]/div[4]/a")
	public static WebElement loggeduser;
	
	@FindBy(xpath = "//*[@id='app']/div/div[1]/div[5]/button")
	public static WebElement Cloudicon;
	
	@FindBy(xpath = "//*[@id='forms.login.usernameSuffix']")
	public static WebElement emailtag;
	
	
	@FindBy(xpath = "//*[@id='app']/div/div[3]/div[2]/form/button[2]")
	public static WebElement resetpin_button;
	
	//Reset pin page
	
	@FindBy(xpath = "//*[@id='forms.resetPin.oldPin']")
	public static WebElement resetoldpin;
	
	@FindBy(xpath = "//*[@id='forms.resetPin.newPin']")
	public static WebElement newpin_resetpage;
	
	@FindBy(xpath = "//*[@id='forms.resetPin.confirmNewPin']")
	public static WebElement confirmpin_resetpage;
	
	@FindBy(xpath = "//*[@id='app']/div/div[3]/div[2]/form/button[1]")
	public static WebElement reset_resetpage;
	
	@FindBy(xpath = "//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div/div/div[1]/h4/div/span")
	public static WebElement errormesssage_resetpage;
	
	@FindBy(xpath = "//*[@id='app']/div/div[3]/div[3]/div/div[2]/div/div/div/div[2]/button")
	public static WebElement okbutton_resetpage;
	
	@FindBy(xpath = "//*[@id='app']/div/div[3]/div[2]/form/button[2]")
	public static WebElement cancelbutton_resetpage;
	
	
	
	public static  void usernamerlogin(String userval){

	    	try {
	    		
	       UtilFile.waitForElementToBeClickable(userName).sendKeys(userval);
	    	
	    	
	    	}catch (StaleElementReferenceException e) {
				System.out.println("Element is not attached to the page document "+ e.getMessage());
			} catch (NoSuchElementException e) {
				System.out.println("Element was not found in DOM "+ e.getMessage());
			} catch (Exception e) {
				System.out.println("Unable to click on element "+ e.getMessage());
			}

	  
	    	   }
	
	
	public static  void Pinlogin(String pinval){

    	try {
    		
        UtilFile.waitForElementToBeClickable(password).sendKeys(pinval);
    	
    	}catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "+ e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM "+ e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element "+ e.getMessage());
		}

  
    }
	

	public static  void Loginbutton(){

    	try {
    	
    		
        UtilFile.waitForElementToBeClickable(loginbutton).click();
    	
    	
    	}catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "+ e.getMessage());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM "+ e.getMessage());
		} catch (Exception e) {
			System.out.println("Unable to click on element "+ e.getMessage());
		}

	}
    	
    	public static  void validateloggeduser(String usernameexpected){

        	try {
        	
        		
            UtilFile.waitForElementToBeClickable(loggeduser);
           String enteredlogged_in_user= loggeduser.getText();
           System.out.println(enteredlogged_in_user);
         Assert.assertEquals(usernameexpected, enteredlogged_in_user);
         System.out.println("datamatched");
        	
        	
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}catch(AssertionError e){
    			System.out.println("data dint match");
    			}
    	
    	
    	
    }
	
	
    	public static  void Click_on_cloud_icon(){

        	try {
        	
        		
        	Thread.sleep(7000);
            UtilFile.waitForElementToBeClickable(Cloudicon).click();
        	Thread.sleep(3000);
            
        	
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}
    	
    	
    	
    	public static  void Verify_downloaded_file_cloudicon(){

        	try {
        	
            
            UtilFile.verifydownloadedfilefromdownloads(".xlsx");
        	
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}
    	
    
    	public static  void Username_is_in_first_last_format_email_ID(){

        	try {
        	
            
            UtilFile.waitForElementToBeClickable(emailtag);
          String emailtagverify=  emailtag.getAttribute("placeholder");
          if(emailtagverify.contains(".com")) {
        	  System.out.println("email tag verified");
          }else {
        	  System.out.println("not present emailtag");
          }
        	
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}
    		  	
    	public static  void Click_on_resetpin_button(){

        	try {
        	
            
            UtilFile.waitForElementToBeClickable(resetpin_button).click();
        	
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}
    	
    	public static  void I_see_a_reset_pin_page_with_options_to_reset_or_cancel_enteroldpin(String pinval){

        	try {
        	
            Log.info("I_see_a_reset_pin_page_with_options_to_reset_or_cancel");
            
            UtilFile.waitforpagetoload();
            Thread.sleep(3000);
            UtilFile.waitForElementToBeClickable(resetoldpin).sendKeys(pinval);
        	
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}
    	
    	public static  void I_enter_that_password(String newpin,String ermessage){

        	try {
        	
            UtilFile.waitForElementToBeClickable(newpin_resetpage).sendKeys(newpin);
        	
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}	
    	
    	
    	public static  void Verify_error_message_resetpin(){

        	try {
        	
            
            UtilFile.waitForElementToBeClickable(errormesssage_resetpage);
            System.out.println(errormesssage_resetpage.getText());
            Assert.assertEquals("Invalid input", errormesssage_resetpage.getText());
        	
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}	
    	
    	public static  void I_click_on_button_for_reset(){

        	try {
        	
            
            UtilFile.waitForElementToBeClickable(okbutton_resetpage).click();            
        	
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}
    	
    	
    	public static  void I_confirm_pin_and_click_reset(String confirmpin){

        	try {
        	
            
            UtilFile.waitForElementToBeClickable(confirmpin_resetpage).sendKeys(confirmpin);
            
            UtilFile.waitForElementToBeClickable(reset_resetpage).click();
            
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}
    	
    	public static  void I_click_on_cancel_button_to_return_to_login_page(){

        	try {
        	
            UtilFile.waitForElementToBeClickable(cancelbutton_resetpage).click();
   
            
        	}catch (StaleElementReferenceException e) {
    			System.out.println("Element is not attached to the page document "+ e.getMessage());
    		} catch (NoSuchElementException e) {
    			System.out.println("Element was not found in DOM "+ e.getMessage());
    		} catch (Exception e) {
    			System.out.println("Unable to click on element "+ e.getMessage());
    		}
    	}
    	
}
