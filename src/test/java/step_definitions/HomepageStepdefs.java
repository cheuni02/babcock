package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import modules.Header.CookieBar;
import org.openqa.selenium.WebDriver;
import pageobjects.BCHomepage;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by ivancheung on 03/05/2016.
 */
public class HomepageStepdefs {

    //private static EmbeddedTomcat tomcat = new EmbeddedTomcat();
    public WebDriver driver;
    BCHomepage homepageObject = new BCHomepage(driver);

    public HomepageStepdefs() { driver = Hooks.driver; }

    @Given("^I am on the homepage after a cache refreshed browser opened$")
    public void iAmOnTheHomepageAfterACacheRefreshedBrowserOpened() throws Throwable {
        // Write code here that turns the phrase above into concrete actions


        BCHomepage.visit_page(driver);
        assertThat(BCHomepage.checkURL(driver), containsString("babcockinternational"));
    }

    @Then("^the cookie statement should appear$")
    public void theCookieStatementShouldAppear() throws Throwable {

        assertThat(CookieBar.isCookieBarPresent(driver), is(true));

    }

    @And("^I can click to open the statement page$")
    public void iCanClickToOpenTheStatementPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        BCHomepage.clickPrivacyStatement(driver);

    }

    @And("^Also be able to close the cookie statement​$")
    public void alsoBeAbleToCloseTheCookieStatement​() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^the title of the cookie statement should be shown$")
    public void theTitleOfTheCookieStatementShouldBeShown() throws Throwable {
        assertThat(CookieBar.isCookieTitlePresent(driver), is(true));
    }

//    @After("@cookies")
//    public void afterScenario(){
//        System.console().printf("Cookies scenario done!");
//    }

//    @After()
//    public void logout() {
//        //homePage.logout();
//        driver.close();
//    }

}
