package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features="Features",
		glue={"StepDefination","hooks"},
		dryRun=false,
		monochrome=false,tags="@Sanity  , @Regrassion",
		plugin= {"pretty","html:test-output"}
		
		)
public class FacebookRunnerClass {

}
