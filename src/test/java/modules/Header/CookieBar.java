package modules.Header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import step_definitions.Hooks;

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


//    def cookie_title(text)
//    cookie_bar.h3(text: text)
//    end
//
//    def cookie_text(text)
//    cookie_bar.li(text: text)
//    end
//
//    def privacy_statement
//    cookie_bar.link(href: "/Privacy")
//    end
//
//    def click_statement
//    privacy_statement.click
//            end
//
//    def close
//    cookie_bar.link(class: "NotificationBar-close").click

    // 1)
//    public boolean isPresent(WebDriver driver, CookieBar cookieBar) {
//        return cookie.isDisplayed();
//    }

    // 2)
    public static boolean isPresent(WebDriver driver){
        return driver.findElement(cookie).isDisplayed();
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



    // more than one attribute method 1
    //driver.findElements(By.tagName("section").id("js-babcock-cookie-bar"));

    // more than one attribute method 2
    //By byXpath = By.xpath("//input[(@id='id_Start') and (@class = 'blabla')]")







}
