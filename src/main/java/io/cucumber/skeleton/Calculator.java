package io.cucumber.skeleton;

public class Calculator {
    private double num1;
    private double num2;

    public void setNumbers(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double calculate(String operation){
        double result = 0;
        if(operation.equals("+")){
            result = num1+num2;
        }
        else if(operation.equals("*")){
            result = num1 * num2;
        }
        return result;
    }
}
