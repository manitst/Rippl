package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@TC1",
		features = "src/test/resources/FeatureFiles" ,
		glue = "stepDefinitions",
		plugin = {"pretty","junit:target/cucumber-reports/cucumber.xml",
				 	       "html:target/cucumber-reports/cucumber.html" },
		monochrome = true, 
		dryRun = false,
		publish = true
		
		)


public class Runner {
	
	
	

}
