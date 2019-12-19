package framework.webpages;

import org.openqa.selenium.By;

public class MainPage extends ElementUtil{

    private By darkSkyAPIBtn= By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    private By logInBtn = By.xpath("//a[contains(text(),'Log In')]");
    private By emailBox = By.id("email");
    private By passwordBox = By.id("password");
    private By login = By.cssSelector("[type=submit]");
    private By errorMassage= By.xpath("//div[@class='error']");

    public void clickOnDarkSkyAPIButton(){
        clickOn(darkSkyAPIBtn);
    }

    public void clickOnloginBtn() throws InterruptedException {
        Thread.sleep(3000);
        clickOn(logInBtn);
    }
    public void enterEmailAddress(String text) throws InterruptedException {
        Thread.sleep(1000);
        setValue(emailBox,text);
    }
    public void enterPassword(String text) throws InterruptedException {
        Thread.sleep(1000);
        setValue(passwordBox,text);
    }
    public void clickOnlogin(){
        clickOn(login);
    }
    public String verifytheErrorMessage(){
    return getTextFromElement(errorMassage);
    }

}
