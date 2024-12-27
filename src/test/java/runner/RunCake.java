package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",glue={"steps"},tags="@prod or @staging or @bvt", plugin= {"html:target/cucumber-reports/cucumber-html-report.html"
		,"json:target/report.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCake extends AbstractTestNGCucumberTests {
	

}
