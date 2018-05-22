package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="ProjectFeatures", glue="stepDefinitions", tags= {"@busqueda", "~@sinfecharegreso", "~@siningresardestino"})
//@CucumberOptions(features="ProjectFeatures", glue="stepDefinitions")
//@CucumberOptions(features="ProjectFeatures", glue="stepDefinitions", tags= {"@vuelos, ~@busqueda, ~@sinfecharegreso, @siningresardestino"})
public class Runner {
	
}
