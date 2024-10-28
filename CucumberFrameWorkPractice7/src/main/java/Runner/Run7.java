package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith((Cucumber.class))
@CucumberOptions(features = {"src/main/java/Feature/Contact7.Feature"},glue = {"StepDefinition"},monochrome = true,tags = {"@tag1"})
public class Run7 {

}
