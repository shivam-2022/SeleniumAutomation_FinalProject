package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/java/Features",
            glue = {"Steps", "Utility"},
            plugin = {"pretty","html:target/cucumber-html-report/report.html","json:cucumber.json"},
            tags = "@Order"
    )
    public class testRunner extends AbstractTestNGCucumberTests{

}
