package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\sabarinathan\\eclipse-workspace\\Facebook_Project\\src\\test\\java\\com\\feature\\Facebook.feature",
			      glue = "com.stepdefinition",
			      plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner {

}
