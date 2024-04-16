package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/FeatureFiles",glue="StepDefinition",monochrome=true,dryRun=true,plugin= {"pretty","html:target/Report/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
