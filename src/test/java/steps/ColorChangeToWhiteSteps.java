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
import page.ColorChangeToWhitePage;
import util.BrowserFactory;

public class ColorChangeToWhiteSteps {

	WebDriver driver;
	ColorChangeToWhitePage colorChangeToWhitePage;
	BasePage basePage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startTheBrowser();
		colorChangeToWhitePage = PageFactory.initElements(driver, ColorChangeToWhitePage.class);
		basePage = PageFactory.initElements(driver, BasePage.class);
	}

	@Given("^user is in tehfios test page with the blue skyblue background color$")
	public void user_is_in_tehfios_test_page_with_the_blue_skyblue_background_color() {

		colorChangeToWhitePage.setSkyBlueBackground();

	}

	@When("^the user click on the 'set white background' button$")
	public void the_user_click_on_the_set_white_background_button() {

		colorChangeToWhitePage.setWhiteBackground();

	}

	@Then("^the background color should be white$")
	public void the_background_color_should_be_white() {
		Boolean status2 = colorChangeToWhitePage.verifyTheBackgroundColorIsWhite();
		Assert.assertTrue("the background is not white color", status2);


	}

	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}
}
