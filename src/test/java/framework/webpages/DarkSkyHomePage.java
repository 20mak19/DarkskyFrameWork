package framework.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinition.SharedSD;

import java.util.List;

public class DarkSkyHomePage extends ElementUtil {

    private By todayBtn = By.xpath("//div[@id='week']//a[1]//span[1]//span[1]");
    private By allTemapratures = By.xpath("//div[@id='week']//div[@class='temps']//span[contains(text(),'°')]");
    private By currentTemp = By.xpath("//span[@class='summary swap']");

    public String verifyHomePageTitle() {
        return waitForGetPageTitle(SharedSD.getDriver().getTitle());

    }
    public void clickOnTodayBtn() throws InterruptedException {
        scrollByElement(todayBtn);
        Thread.sleep(1000);
        clickOn(todayBtn);
    }
    public void findTodaysMinMaxTemperature() {

        List<WebElement> tempList = SharedSD.getDriver().findElements(allTemapratures);

        String currentTempatures = SharedSD.getDriver().findElement(currentTemp).getText();
        System.out.println("Current Temp:" + currentTempatures);
        System.out.println("All the temperatures on the temp line");
        int temperature = Integer.parseInt(currentTempatures.substring(0, 2));

        int maxTemp = temperature;
        int minTem = temperature;

        for (WebElement tempElement : tempList) {
            String text = tempElement.getText().substring(0, 2);        //Temperatures on the line
            int lineTemp = Integer.parseInt(text);

            System.out.println("instant temperatures : " + lineTemp);

            if (lineTemp > maxTemp) {
                maxTemp = lineTemp;
            }
            if (lineTemp < minTem) {
                minTem = lineTemp;
            }
        }
        System.out.println("Maximum temperature is... " + maxTemp);
        System.out.println("Minimum temperature is...:" + minTem);
}
}



