package Runnerpackage;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
format={"pretty","html:target/cucumber-html-report","json:target/cucumber.json","pretty:target/cucumber-pretty.txt","usage:target/cucumber-usage.json","junit:target/cucumber-results.xml"},
features ={"src\\test\\Resources\\folder1\\Login.feature","src\\test\\Resources\\folder2\\CollectPage.feature","src\\test\\Resources\\folder3\\ProcessPage.feature","src\\test\\Resources\\folder4\\PackagePage.feature"},
glue = {"StepDefinitions"},
tags={"@Test1"}

)




public class Runnerwork{

}
