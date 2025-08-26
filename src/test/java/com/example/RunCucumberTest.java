package com.example;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features",   // Path to feature files
    glue = {"com.example.steps", "com.example.support"}, // Step definitions + hooks
    plugin = {
        "pretty", 
        "html:target/cucumber-reports.html",
        "json:target/cucumber.json"
    },
    monochrome = true
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
