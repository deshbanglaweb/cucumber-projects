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

    @Then("assert calculation")
    public void assert_calculation() {
        if(sign.equals("+")){
            assertEquals(result,22.0);
        }
        else if(sign.equals("*")){
            assertEquals(result,120.0);
        }
        System.out.println(result);
    }
}
