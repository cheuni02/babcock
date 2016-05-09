package step_definitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriverException;

import java.net.MalformedURLException;

/**
 * Created by ivancheung on 04/05/2016.
 */
public class Hooks {

    public static WebDriver driver;

    @Before
    public void spawnBrowser() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebdrivers\\chromedriver.exe");
        System.out.println("Called openBrowser");
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        //driver.get("http://www.babcockinternational.com");
        driver.manage().deleteAllCookies();
        driver.manage().window().setSize(new Dimension(1200,800));

    }

    @After
    public void closeBrowser(Scenario scenario){
        //homePage.logout();
        if(scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
//            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }

        }
        driver.quit();
    }

}
