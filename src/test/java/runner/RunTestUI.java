package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features="classpath:features/ui",
		glue="stepdefinations",
		tags="",
		//tags="@get",
		plugin = {"pretty",
				"html:target/html/",
				"json:target/json/file.json",
		},
		strict=false,
		dryRun=false,
		monochrome = true

		)


public class RunTestUI {

}
