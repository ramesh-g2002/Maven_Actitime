package maven_cucumber;

import org.junit.runner.RunWith;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//Features/google.feature",
glue="Stepdefinition",
//dryRun=true,
monochrome = true,
plugin = {"pretty","html:target/CucumberHtmlRep.html"})
public class TestRunner {
	

}
