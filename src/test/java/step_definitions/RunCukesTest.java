package step_definitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format ={"pretty", "html:target/cucumber-html-report"},
        features ="classpath:features",
        tags = {"@homepage"}
        )
public class RunCukesTest {
}