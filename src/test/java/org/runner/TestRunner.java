package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features= "C:\\Users\\HP\\eclipse-workspace\\NewWork\\ProjectDemo\\Feature\\AddToCart.feature",
				glue="org.steps"
				)
public class TestRunner {

}
