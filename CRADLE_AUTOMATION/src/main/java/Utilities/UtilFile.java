package Utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilFile {

	public static WebDriverWait wait =new WebDriverWait(WebConnector.driver, 30);
	
	public static void gotourl() {

		if (!WebConnector.driver.getCurrentUrl().contains("http://sandpit.auto.radwaste-webapp.s3-website.eu-west-2.amazonaws.com")) {
			WebConnector.driver.manage().window().maximize();
			waitforpagetoload();
			WebConnector.driver.get("http://sandpit.auto.radwaste-webapp.s3-website.eu-west-2.amazonaws.com/login");
			
		}else {
			System.out.println("*");
		}
	}

	public static void waitforpagetoload() {
		WebConnector.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static WebElement waitForElementToBeClickable(WebElement element) {
		
		 return wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
	}
	
	
	public static void waitForElementToBeClickable1(WebElement element) {
		
		 wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(element)));
		
	}


	public static  void waitForElementToBeselect(WebElement element) {
			wait.until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeSelected(element)));
	}


	
	
	public static void waitForElementToBevisible(WebElement element) {
		new WebDriverWait(WebConnector.driver,30);
		 wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOf(element)));
	}
	

	public static void waitForElementToBeDisplayed(WebElement element) {
		new WebDriverWait(WebConnector.driver,30);
		 wait.until(ExpectedConditions.refreshed(ExpectedConditions.textToBePresentInElement(element, "Bag")));
		
	}
	
	public static void invisible() {
		By loadingImage = By.cssSelector("div.spinner");

		WebDriverWait wait = new WebDriverWait(WebConnector.driver,7);

		wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingImage));
		
	}
	
	public static void verifydownloadedfilefromdownloads(String fileformat) {

		File dir = new File("D:\\Users\\chpuli\\Downloads");
		File[] files = dir.listFiles();
		if (files == null || files.length == 0) {
			System.out.println("file doesnot exist");
		}

		for (int i = 1; i < files.length; i++) {
			if (files[i].getName().contains(fileformat)) {
				System.out.println("file exists");
			} else {
				System.out.println("looking file doesnot exist");
			}
		}

	}
	
	
	public static void safeJavaScriptClick(WebElement element) throws Exception {
		try {
	
				System.out.println("Clicking on element with using java script click");
				JavascriptExecutor jse = (JavascriptExecutor)WebConnector.driver;

				jse.executeScript("arguments[0].scrollIntoView()", element); 
			
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element was not found in DOM "+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Unable to click on element "+ e.getStackTrace());
		}
	}
	

}
