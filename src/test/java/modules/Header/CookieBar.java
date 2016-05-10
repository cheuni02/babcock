package modules.Header;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
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

    // 1)
    //@FindBys({@FindBy(how= How.TAG_NAME, using = "section"), @FindBy(how= How.ID, using = "js-babcock-cookie-bar")})

//    @FindBy(how= How.ID, using = "js-babcock-cookie-bar")
//    public static WebElement cookiebar;

    @FindBy(how= How.ID, using = "js-babcock-cookie-bar")
    public static WebElement cookiebar;

    public static boolean isPresent(WebDriver driver, CookieBar cookieBar) {
        return cookiebar.isDisplayed();
    }

    // 2)
    //driver.findElements(By.tagName("section").id("js-babcock-cookie-bar"));

    // 3)
    //By byXpath = By.xpath("//input[(@id='id_Start') and (@class = 'blabla')]")




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



}
