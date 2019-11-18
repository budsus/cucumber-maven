package id.ac.ukdw.simplesqa;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author budsus
 */
public class CalculatorTest {
    private Calculator calc;
    private int result;

    @Given("a calculator I just turned on")
    public void aCalculatorIJustTurnedOn() {
        calc = new Calculator();
    }

    @When("I add {int} and {int}")
    public void iAddAnd(int arg0, int arg1) {
        result = calc.add(arg0, arg1);
    }

    @Then("the result is {int}")
    public void theResultIs(int arg0) {
        assertEquals(arg0, result);
    }    
}
