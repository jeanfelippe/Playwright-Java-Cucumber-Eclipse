package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/loginstaging.feature",glue={"steps"}, plugin= {"html:target/cucumber-reports/cucumber-html-report.html"
		,"json:target/report.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCake extends AbstractTestNGCucumberTests {
	

}
