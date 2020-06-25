package page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ColorChangeToBluePage {
	WebDriver driver;

	public ColorChangeToBluePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement toggleAllCheckbox;
	@FindBy(how = How.XPATH, using = "//input[@name='todo[4]']")
	WebElement nissanCheckbox;
	@FindBy(how = How.XPATH, using = "//input[@name='todo[1]']")
	WebElement firtToDoList;
	@FindBy(how = How.NAME, using = "submit")
	WebElement removeButton;
	@FindBy(how = How.XPATH, using = "//input[contains(@name,'todo')] ")
	WebElement toDoLists;
	@FindBy(how = How.XPATH, using = "//div[@id='label-first']/b[contains(text(),'TODO List')] ")
	WebElement pageTitle;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')] ")
	WebElement setBlueBackgroundButon;
	@FindBy(how = How.CSS, using = "body[style='background-color: skyblue;']")
	WebElement backgroudColor;

	public void cilckOnToggleAll() {

		toggleAllCheckbox.click();
	}

	public Boolean nissanCheckboxIsChecked(WebElement element) throws Exception {

		if (nissanCheckbox.isSelected()) {
			return true;
		} else {

			return false;
		}
	}

	public void deleteTheCheckedBox() throws Exception {

		firtToDoList.click();
		Thread.sleep(10);
		removeButton.click();

	}

	public Boolean webelementIsPresent(WebElement deletedElement) {

		List<String> allList = new ArrayList<String>();

		for (String list : allList) {
			list = toDoLists.getText();
			if (firtToDoList.equals(list)) {
				return true;
			}
		}

		return false;
	}

	public void verifyPageTitle() {
		waitFor(pageTitle, driver);
		pageTitle.click();
		System.out.println("NSS-TODO List v 1.1 tab is dysplayed");

	}

	public void waitFor(WebElement element, WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public void setSkyBlueBackground() {
		setBlueBackgroundButon.click();

	}

	public boolean verifyTheBackgroundColorIsBlue() {

		if (backgroudColor.isDisplayed()) {
			return true;
		} else {
			return false;
		}

	}

}
