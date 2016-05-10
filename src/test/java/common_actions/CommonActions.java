package common_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import step_definitions.Hooks;

/**
 * Created by ivan.cheung on 5/10/2016.
 */
public class CommonActions {
    private WebDriver driver;

    public CommonActions(WebDriver driver) {
        Hooks.driver = driver;
    }

    public static boolean isElementPresent(WebDriver driver, By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
