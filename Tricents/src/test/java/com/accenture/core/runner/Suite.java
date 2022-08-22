package com.accenture.core.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import drivers.DriverWeb;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions( plugin = "pretty",
				  glue = "com.accenture.core",
				  monochrome = true,
				  tags = "@run and not @ignore",
				  features = "src/test/resources/features/",
				  dryRun = false)

public class Suite {
	
	@BeforeClass
	public static void configurardDriver() {
		DriverWeb.getDriver();
	}
	
}