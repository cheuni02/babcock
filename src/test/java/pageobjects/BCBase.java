package pageobjects;

import modules.Header.CookieBar;
import org.openqa.selenium.WebDriver;

/**
 * Created by ivancheung on 03/05/2016.
 */
public abstract class BCBase  {
    private static WebDriver driver;
    public static boolean bResult;


    public BCBase(WebDriver driver) {
        BCBase.driver = driver;
        BCBase.bResult = true;
    }

    public static void visit_page(WebDriver driver) {
        driver.get("http://www.babcockinternational.com");
    }

    public static String checkURL(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public String getURL (){
        return driver.getCurrentUrl();
    }

    //including the Header::CookieBar module
    CookieBar cookie = new CookieBar(driver);

}
