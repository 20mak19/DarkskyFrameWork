package framework.webpages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import static stepdefinition.SharedSD.getDriver;

public class ElementUtil{

    // This is the most common wait function used in selenium
    public static WebElement webAction(final By locator) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .withMessage(
                        "WebDriver waited for 20 seconds but still could not find the element therefore Timeout Exception has been thrown");

        return wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
    }

    public void clickOn(By locator) {
        webAction(locator).click();
    }

    public void setValue(By locator, String value) {
        webAction(locator).sendKeys(value);
    }

    public String getTextFromElement(By locator) {
        return webAction(locator).getText();
    }

    public String waitForGetPageTitle(String title){
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.titleContains(title));
        return getDriver().getTitle();
    }


    public boolean isElementDisplayed(By locator) {
        return webAction(locator).isDisplayed();
    }

    public boolean isElementSelected(By locator) {
        return webAction(locator).isSelected();
    }

    public void selectFromDropdown(By locator, String dropdownText) {
        WebElement month = webAction(locator);
        Select selectMonth = new Select(month);
        //select element by visible text
        selectMonth.selectByVisibleText(dropdownText);
    }

    public void selectFromDropdown(By locator, int index) {
        WebElement month = webAction(locator);
        Select selectMonth = new Select(month);
        //select element by index
        selectMonth.selectByIndex(index);
    }

    public boolean isElementEnabled(By locator) {
        return webAction(locator).isEnabled();
    }

    public List<WebElement> webElements(By locator){
        return getDriver().findElements(locator);
    }

    public void scrollByElement(By locator){
        WebElement scrollElement = webAction(locator);
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", scrollElement);
    }

    public void scrollByPixel(String xPixel, String yPixel){
        String string = "window.scrollBy(" + xPixel +"," + yPixel + ")";
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript(string);
    }

    public void clear(By locator){
        webAction(locator).clear();
    }

    public void windowMaximize(){
        getDriver().manage().window().maximize();
    }

    public void moveToElement(By locator){
        Actions actions = new Actions(getDriver());
        actions.moveToElement(webAction(locator)).build().perform();
    }
    //    public static boolean isAddedBy2(By locator) {
//        List<WebElement> lists = getDriver().findElements(locator);
//        for (int i = 0; i < lists.size(); i++) {
//            Pattern p = Pattern.compile("[0-9]");
//            Matcher m = p.matcher(lists.get(i).getText());
//            while (m.find()) {
//                int n = Integer.parseInt(m.group());
//                if (isOdd(n)) {
//                    if ((n % 2 != 1)) {
//                        return false;
//                    }
//                } else {
//                    if ((n % 2 != 0)) {
//                        return false;
//                    }
//                }
//            }
//        }
//        return true;
//    }
    public static boolean isAddedBy2(By locator){
        List<WebElement> lists = getDriver().findElements(locator);
        for (int i = 0; i < lists.size(); i++) {
            String text = lists.get(i).getText().substring(0,2);		//Temperatures on the line
            int timeLine =Integer.parseInt(text.replaceAll("[^\\d.]", ""));
            if (isOdd(timeLine)) {
                if ((timeLine % 2 != 1)) {
                    return false;
                }
            } else {
                if ((timeLine % 2 != 0)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isOdd(int x) {

        for (int i = 1; i <= x; i += 2) {
            if (x == i) {
                return true;
            }
        }
        return false;
    }

}

