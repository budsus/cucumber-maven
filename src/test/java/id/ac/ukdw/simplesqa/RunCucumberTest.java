package id.ac.ukdw.simplesqa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/id/ac/ukdw/simplesqa"},
        plugin = {"pretty"})
public class RunCucumberTest {
}
