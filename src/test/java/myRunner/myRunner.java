package myRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\TRAINING_H2A.06.17\\Downloads\\cucjenkins23\\features\\logintest.feature", 
glue={"stepDefs"},
monochrome=true,
plugin= {"pretty","json:target/cucumber.json"}
			)

public class myRunner {

}

