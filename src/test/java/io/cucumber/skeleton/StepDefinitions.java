package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static junit.framework.TestCase.assertEquals;

public class StepDefinitions {
    private String sign;
    private double result;
    private Calculator calculator;

    @Before
    public void prepareCalculator(){
        calculator = new Calculator();
    }

    @Given("User input two numbers {double} {double}")
    public void user_input_two_numbers(double num1, double num2) {
        calculator.setNumbers(num1,num2);
    }

    @When("user input sign {string}")
    public void user_input_plus_sign(String sign) {
        this.sign = sign;
        System.out.println(this.sign);
    }

    @Then("calculate numbers")
    public void calculate_numbers(){
         result = calculator.calculate(sign);
         System.out.println(result);
    }

    @Then("assert calculation {double}")
    public void assert_calculation(double expectedOutput) {
        if(sign.equals("+")){
            assertEquals(expectedOutput, result);
        }
        else if(sign.equals("*")){
            assertEquals(expectedOutput,result);
        }
        System.out.println(result);
    }
}
