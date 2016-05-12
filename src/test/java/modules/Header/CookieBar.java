package modules.Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import step_definitions.Hooks;

import static common_actions.CommonActions.*;

/**
 * Created by ivancheung on 06/05/2016.
 */
public class CookieBar {
    public CookieBar(WebDriver driver){
        Hooks.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // 1) Identifying elements using PageFactory method
    ///////////////////////////////////////////////////

    //@FindBys({@FindBy(how= How.TAG_NAME, using = "section"), @FindBy(how= How.ID, using = "js-babcock-cookie-bar")})


//    @FindBy(how= How.ID, using = "js-babcock-cookie-bar")
//    public static WebElement cookie;
//
//    @FindBy(xpath = "//a[@href=\'/Privacy\']")
//    public static WebElement privacystatement;

    // 2) Identifying elements using Abstract Element Locators
    //////////////////////////////////////////////////////////

    static By cookie = By.id("js-babcock-cookie-bar");
    static By privacystatement = By.xpath("//a[@href=\'/Privacy\']");
    static By cookietitle = By.linkText("//h3[@class=\'NotificationBar-itemTitle\'");
    static By closebutton = By.xpath("//div[@class=\'NotificationBar-closeContainer\']");


    // 1)
//    public boolean isPresent(WebDriver driver, CookieBar cookieBar) {
//        return cookie.isDisplayed();
//    }

    // 2)
    public static boolean isCookieBarPresent(WebDriver driver){
        return isElementPresent(driver,cookie);

    }


    // 1)
//    public static void clickStatement(WebDriver driver, CookieBar privacyStatement)  throws InterruptedException {
//        privacystatement.click();
//            Thread.sleep(5000);
//    }



    // 2)
    public static void clickStatement(WebDriver driver)  throws InterruptedException {
        driver.findElement(privacystatement).click();
        Thread.sleep(5000);
    }

    public static boolean isCookieTitlePresent(WebDriver driver){
        isElementPresent(driver,cookietitle);
        return true; //driver.findElement(cookietitle).isDisplayed();
    }

    public static void clickClose(WebDriver driver) {
        driver.findElement(closebutton).click();
    }


    // more than one attribute method 1
    //driver.findElements(By.tagName("section").id("js-babcock-cookie-bar"));

    // more than one attribute method 2
    //By byXpath = By.xpath("//input[(@id='id_Start') and (@class = 'blabla')]")







}
