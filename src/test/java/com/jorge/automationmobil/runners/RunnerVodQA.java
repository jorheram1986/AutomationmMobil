/**
 * @since 29/07/2018
 */
package com.jorge.automationmobil.runners;

import com.jorge.automationmobil.utils.BeforeSuite;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@CucumberOptions(features="src/test/resources/features/App_Login.feature",
		tags = {"@LoginExitoso"},
		glue={"com.jorge.automationmobil"},
		snippets = SnippetType.CAMELCASE)

@RunWith(RunnerPersonalizado.class)
public class RunnerVodQA {
	@BeforeSuite
	public static void test() throws InvalidFormatException, IOException {
	}

}
