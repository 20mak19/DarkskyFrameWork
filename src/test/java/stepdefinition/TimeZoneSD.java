package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.Timezone;
import org.testng.Assert;

public class TimeZoneSD {

    private Timezone timeZone= new Timezone();

    @Given("^I am on DarkSky Home Page$")
    public void homePage(){
       Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://darksky.net/forecast/40.7127,-74.0059/us12/en" );

    }
    @When("^I enter city into search text field on home screen$")
    public void sendTextIntoSearcBox(){
        timeZone.sendTextToSearchField();
    }

    @And("^I verify city's time zone$")
    public void verifyTimeZone() throws InterruptedException {

        int expectedTime = timeZone.TimeZoneTwoHoursLater();
        int actualTime = timeZone.addTwoHoursOnCurrentTime();

        Assert.assertEquals(actualTime, expectedTime );

    }
    @Then("^I verify timeline is displayed with two hours incremented$")
    public void IsTimelineDisplayedWithTwoHoursIncremented(){
        Assert.assertEquals(timeZone.timeAddedByTwoHours(),true,"The time is not incremented by TWO HOURS");
        System.out.println("Is Timeline Displayed With Two Hours Incremented : "+timeZone.timeAddedByTwoHours());

    }
}
