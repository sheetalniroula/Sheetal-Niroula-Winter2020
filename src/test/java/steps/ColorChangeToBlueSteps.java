package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.BasePage;
import page.ColorChangeToBluePage;
import util.BrowserFactory;

public class ColorChangeToBlueSteps {

	WebDriver driver;
	ColorChangeToBluePage colorChangeToBluePage;
	BasePage basePage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startTheBrowser();
		colorChangeToBluePage = PageFactory.initElements(driver, ColorChangeToBluePage.class);
		basePage = PageFactory.initElements(driver, BasePage.class);
	}

	@Given("^user is in tehfios test page$")
	public void user_is_in_tehfios_test_page() {
		// colorChangeToBluePage = PageFactory.initElements(driver,
		// ColorChangeToBluePage.class);
		// basePage = PageFactory.initElements(driver, BasePage.class);
		colorChangeToBluePage.verifyPageTitle();

	}

	@When("^the user click on the 'set skyblue background' button$")
	public void the_user_click_on_the_set_skyblue_background_button() {

		// colorChangeToBluePage = PageFactory.initElements(driver,
		// ColorChangeToBluePage.class);
		colorChangeToBluePage.setSkyBlueBackground();

	}

	@Then("^the background color should be blue$")
	public void the_background_color_should_be_blue() {
		// colorChangeToBluePage = PageFactory.initElements(driver,
		// ColorChangeToBluePage.class);
		Boolean status1 = colorChangeToBluePage.verifyTheBackgroundColorIsBlue();
		Assert.assertTrue("the background is not blue color", status1);

	}

	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}
}
