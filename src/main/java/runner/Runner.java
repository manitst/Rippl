package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@buildfromscratch",
		features = "src/test/resources/FeatureFiles" ,
		glue = "stepDefinitions",
		plugin = {"pretty","junit:target/cucumber-reports/cucumber.xml",
				 	       "html:target/cucumber-reports/cucumber.html" },
		monochrome = true, 
		dryRun = true,
		publish = true
		
		)


public class Runner {
	
	
	

}
