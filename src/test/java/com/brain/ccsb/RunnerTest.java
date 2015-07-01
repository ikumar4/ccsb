package com.brain.ccsb;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(
//@Cucumber.Options(
		//dryRun = false,
		//strict = true,
		//glue = "pb1",
		
		
		format = {"pretty",
				"html:target/html/"
			//	"json:target_json/cucumber.json"
				//"junit:taget_junit/cucumber.xml"
				},
		
		features =	"src/test/resource",
		
				tags = {"@brainlogin, @olrlogin"}
		//@brainlogin , 
		//, @olrlogin"
				//, @Olrvalidation
				// "~@wip", "~@notImplemented","@executeThis"},
				//"@Login, @CourseCreation,
		//monochrome = true,
		
		)

public class RunnerTest {

}