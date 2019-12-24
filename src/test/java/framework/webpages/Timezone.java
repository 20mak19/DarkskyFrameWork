package framework.webpages;

import org.openqa.selenium.By;
import stepdefinition.SharedSD;

import java.util.Calendar;
import java.util.TimeZone;

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
        System.out.println(timeZone.getID()+" Time&zone is : "+ calendar.getTime()+" o'clock ");
        return calendar.get(Calendar.HOUR);
        //calendar.get(Calendar.HOUR)

    }
    public int addTwoHoursOnCurrentTime() throws InterruptedException{
        String time=getTextFromElement(timeTwoHourslaterFromNow);
        Thread.sleep(1000);
        int timeForTwoHoursLater=Integer.parseInt(time.replaceAll("[^\\d.]", ""));
        System.out.println("Time will be "+timeForTwoHoursLater+" o'clock two hours later on the DarkSky HomePage ");
        return timeForTwoHoursLater;
    }
    public boolean timeAddedByTwoHours()
    {
        return isAddedBy2(timeTwoHourslaterFromNow);
    }



}
