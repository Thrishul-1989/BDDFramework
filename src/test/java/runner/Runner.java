package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/Features/*.feature",
            glue = {"src/test/java/*.java"},
            tags = "@regression",
            plugin = {"html:target/cucumberHtmlReport"}
    )
    public class Runner {
    }


