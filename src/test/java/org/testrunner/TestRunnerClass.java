package org.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\VP\\eclipse-workspace\\CucumberClass\\src\\test\\resources\\FeactureFile", 
                             glue = "org.fblogin", monochrome = true)

public class TestRunnerClass {

}
