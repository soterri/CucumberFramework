package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( //A CONFIG FOR OUR TESTS 
	features="src/test/resources/features/AddEmployee.feature"
	,glue="com/hrms/steps"
	,dryRun=false //meaning not actually running, but checking!
	,plugin= {"pretty", "html:target/html/cucumber-default-report", "json:target/cucumber.json"}
	,monochrome=true
	,tags = {"@smoke"}
	
	)
	
public class SmokeRunner {


}
