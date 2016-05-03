package com.babcock.cucumber.bdd;

import com.babcock.bdd.homepage.Homepage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by ivancheung on 03/05/2016.
 */
public class HomepageStepdefs {

    private WebDriver driver;

    @Given("^I am on the homepage after a cache refreshed browser opened$")
    public void iAmOnTheHomepageAfterACacheRefreshedBrowserOpened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver = new FirefoxDriver();
        Homepage homepage = new Homepage(driver);
        homepage.visit_page(driver);

        assertThat(homepage.getURL(), containsString("https://www.babcockinternational.com/"));



        //throw new PendingException();
    }

}
