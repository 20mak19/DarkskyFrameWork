package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webpages.MainPage;
import org.testng.Assert;

public class MainPageSD {
    private MainPage mainPage= new MainPage();

//    @Given("^I am on Darksky Home Page$")
//
//    public void clickOnDarkSky(){
//        mainPage.clickOnDarkSkyAPIButton();
//
//    }
//    @Given("^I am on Darksky Home Page$")
//    public void homePage(){
//        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(), "https://darksky.net/forecast/40.7127,-74.0059/us12/en" );
//    }
    @And("^I am on the darksky Register page$")
    public void clickOnDarkSkyAPI() {
        mainPage.clickOnDarkSkyAPIButton();
    }
//    public void clickOnLogInButton() throws InterruptedException {
//        mainPage.clickOnloginBtn();
//    }
    @When("^I click on login button$")
    public void clickOnLoginButton() throws InterruptedException {
        mainPage.clickOnloginBtn();
    }
    @And("^I enter email into EmailAddress box$")
    public void enterEmail() throws InterruptedException {
        mainPage.enterEmailAddress("makbuleangun@gmail.com");
    }
    @And("^I enter password into Password box$")
    public void password() throws InterruptedException {
        mainPage.enterPassword("mak123");
    }
//    public void clickOnloginbtn(){
//        mainPage.clickOnlogin();
//    }

    @Then("^I verify error message \"password and username does not match\"$")
    public void clickOnLogin(){
        mainPage.clickOnlogin();
        Assert.assertEquals(mainPage.verifytheErrorMessage(),"Username and password do not match");
        System.out.println("verified message : "+mainPage.verifytheErrorMessage());
    }
//    public void verifyErrorMessage(){
//        Assert.assertEquals(mainPage.verifytheErrorMessage(),"password and username does not match");
//        System.out.println("verified message : "+mainPage.verifytheErrorMessage());
//    }





}
