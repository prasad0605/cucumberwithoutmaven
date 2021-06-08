package MyTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
features="Features/Mercury_Datatable.feature",
//features="@target/rerun.txt",
glue= {"Stepdefinition"},
plugin= {"pretty:STDOUT","html:target/cucumber-html-report","json:target/cucumber.json","junit:target/cucumber.xml","rerun:target/rerun.txt"}
//tags= {"@tag1,@tag2"}//  to run mutiple tags
)

public class TestRunner {

}



