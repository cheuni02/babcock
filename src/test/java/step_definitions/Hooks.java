package step_definitions;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by ivancheung on 04/05/2016.
 */
public class Hooks {

    public static WebDriver driver;

    @Before()
    public void spawnBrowser(){
        driver = new FirefoxDriver();
        //driver.get("http://www.babcockinternational.com");
        driver.manage().window().setSize(new Dimension(1200,800));


    }

    @After()
    public void closeBrowser(){
        //homePage.logout();
        driver.close();
    }

}
