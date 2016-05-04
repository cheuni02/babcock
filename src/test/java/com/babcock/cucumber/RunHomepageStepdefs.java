package com.babcock.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(format={"pretty", "html:target/com.babcock.cucumber.bdd"},features="src/test/resources/",tags = {"@homepage"})
public class RunHomepageStepdefs {
}