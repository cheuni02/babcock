package pageobjects;

import modules.Header.CookieBar;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ivancheung on 03/05/2016.
 */
public abstract class BCBase  {
    private static WebDriver driver;
    public static boolean bResult;

//    @FindBy(id = "js-babcock-cookie-bar")
//    private WebElement CookieBar;


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

    public static boolean CookiebarPresent(WebDriver driver) {
        CookieBar cookieBar = new CookieBar(driver);
        try{
            CookieBar.isPresent(driver, cookieBar);
            //driver.findElements(By.tagName("section").id("js-babcock-cookie-bar"));
        }catch(NoSuchElementException e){
            return false;
        }
        return true;
    }




}
