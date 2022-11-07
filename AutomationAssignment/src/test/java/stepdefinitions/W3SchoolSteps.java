package stepdefinitions;

import com.pages.HomePage;
import com.pages.JavaTutorialPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

public class W3SchoolSteps {

	private static String title;
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private JavaTutorialPage javaTutorialPage = new JavaTutorialPage(DriverFactory.getDriver());

	@Given("user launches browser and open w3School website")
	public void user_is_on_w3school_home_page() {
		DriverFactory.getDriver().get("https://www.w3schools.com/");
	}

	@When("user on {string} home page")
	public void user_gets_the_title_of_the_homepage(String page) {
		title = homePage.getHomePageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("user verifies page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("user on w3school homepage clicks on {string} link")
	public void user_clicks_on_tutorial_option(String link) {
		homePage.clickOnTutorial();
	}

	@And("user on selects {string} from tutorials")
	public void user_select_on_learn_java_option(String langauge) {
		homePage.clickOnLearnJava();
	}
	
	@Then("user on java tutorial home page lists all java class options")
	public void user_list_java_class_list() {
		List<String> javaClassLists = javaTutorialPage.getJavaClassList();
		System.out.println("Java Classes are : " + javaClassLists);
	}

}
