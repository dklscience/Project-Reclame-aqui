package stepdefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith (Cucumber.class)
    @CucumberOptions (features = "C:\\Projetos\\ReclameAqui\\src\\test\\java\\features\\Login.feature", glue = {""}, monochrome = true, dryRun = false)
    public class RunTest{

    }
