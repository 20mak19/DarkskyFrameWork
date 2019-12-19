package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.DarkSkyHomePage;
import org.testng.Assert;

public class DarkSkyHomePageSD {

    private DarkSkyHomePage darkSkyHomePage = new DarkSkyHomePage();

    @Given("^I am on Darksky Home Page$")
    public void verifyHomePageTitle(){
        Assert.assertEquals(darkSkyHomePage.verifyHomePageTitle(), "Dark Sky - Broadway, New York, NY");
        System.out.println("Home page title : "+darkSkyHomePage.verifyHomePageTitle());
    }

    @When("^I expand todays timeline$")
    public void clickOnTodayButton() throws InterruptedException {
        darkSkyHomePage.clickOnTodayBtn();
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
     public void listHighestAndLowestTemp(){
        darkSkyHomePage.findTodaysMinMaxTemperature();
    }
}



