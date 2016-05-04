package com.babcock.bdd;

import org.openqa.selenium.WebDriver;
/**
 * Created by ivancheung on 03/05/2016.
 */
public class BCBase {
    private WebDriver driver;


    public BCBase(WebDriver driver) {
        this.driver = driver;
    }

    public void visit_page(WebDriver driver) {
        driver.navigate().to("http://www.babcockinternational.com");
    }

    public String getURL (){
        return driver.getCurrentUrl();
    }




}
