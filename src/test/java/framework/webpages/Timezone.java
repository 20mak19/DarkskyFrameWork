package framework.webpages;

import org.openqa.selenium.By;
import stepdefinition.SharedSD;
import java.util.TimeZone;
import java.util.Calendar;

public class Timezone extends ElementUtil {

    private By searchBox=By.xpath("//form[@id='searchForm']//input");
    private By timeTwoHourslaterFromNow= By.xpath("//div[@class='hours']//span[3]");


    public void sendTextToSearchField(){
        SharedSD.getDriver().findElement(searchBox).clear();
        setValue(searchBox,"Laurel Avenue, Hammonton, NJ");
    }
    public int TimeZoneTwoHoursLater() throws InterruptedException {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        Calendar calendar=Calendar.getInstance(TimeZone.getTimeZone("GMT-3"));
        System.out.println(timeZone.getID()+" Time&zone is :"+ calendar.get(Calendar.HOUR)+" o'clock two hours later");
        return calendar.get(Calendar.HOUR);

    }
    public int addTwoHoursOnCurrentTime() throws InterruptedException{
        String time=getTextFromElement(timeTwoHourslaterFromNow);
        Thread.sleep(3000);
        int timeForTwoHoursLater=Integer.parseInt(time.replaceAll("[^\\d.]", ""));
        System.out.println("Time is "+timeForTwoHoursLater+" on the DarkSky HomePage o'clock two hours later");
        return timeForTwoHoursLater;
    }
    public boolean timeAddedByTwoHours(){
        return isAddedBy2(timeTwoHourslaterFromNow);
    }



}
