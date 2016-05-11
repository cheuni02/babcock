package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ivancheung on 03/05/2016.
 */
public abstract class BCBase  {
    private static WebDriver driver;
    public static boolean bResult;

    public BCBase(WebDriver driver) {
        BCBase.driver = driver;
        PageFactory.initElements(driver, this);
        BCBase.bResult = true;
    }

    public static void visit_page(WebDriver driver) {
        driver.get("http://www.babcockinternational.com");
    }

    public static String checkURL(WebDriver driver) {
        return driver.getCurrentUrl();
    }


}
