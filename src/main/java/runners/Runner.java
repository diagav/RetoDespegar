package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="ProjectFeatures", glue="stepDefinitions", tags= {"~@busqueda", "~@sinfecharegreso", "@siningresardestino"})
public class Runner {
	
}
