package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.MainPage;
import org.testng.Assert;

public class MainPageSD {
    private MainPage mainPage= new MainPage();

    @Given("^I am on the darksky Register page$")
    public void clickOnDarkSkyAPI() {
        mainPage.clickOnDarkSkyAPIButton();
    }

    @When("^I click on login button$")
    public void clickOnLoginButton() throws InterruptedException {
        mainPage.clickOnloginBtn();
        mainPage.enterEmailAddress("makbuleangun@gmail.com");
        mainPage.enterPassword("mak123");
    }

    @Then("^I verify error message \"password and username does not match\"$")
    public void clickOnLogin() throws InterruptedException {
        mainPage.clickOnlogin();
        Assert.assertEquals(mainPage.verifytheErrorMessage(),"Username and password do not match");
        System.out.println("Verified Message : "+mainPage.verifytheErrorMessage());
    }
    }
