package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColorChangeToWhitePage {
	WebDriver driver;

	public ColorChangeToWhitePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//div[@id='label-first']/b[contains(text(),'TODO List')] ")
	WebElement pageTitle;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')] ")
	WebElement setBlueBackgroundButon;
	@FindBy(how = How.CSS, using = "body[style='background-color: skyblue;']")
	WebElement backgroudColorRed;
	@FindBy(how = How.CSS, using = "button[onclick='myFunctionWhite()']")
	WebElement setWhiteBackgroundButton;
	@FindBy(how = How.CSS, using = "body[style='background-color: white;']")
	WebElement backgroudColorWhite;

	public void verifyPageTitle() {
		waitFor(pageTitle, driver);
		pageTitle.click();
		System.out.println("NSS-TODO List v 1.1 tab is dysplayed");

	}

	public void waitFor(WebElement element, WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void setSkyBlueBackground()  {
		setBlueBackgroundButon.click();
		
		
	}
	
	public void setWhiteBackground()  {
		setWhiteBackgroundButton.click();
		
	}
	public boolean verifyTheBackgroundColorIsWhite() {

		if (backgroudColorWhite.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

	

}
