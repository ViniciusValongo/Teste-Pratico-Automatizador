package br.com.viniciusvalongo.testepratico.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Acesso.feature", 
		glue = "br.com.viniciusvalongo.testepratico.tests"		
		)
public class RunnerTest {

}
