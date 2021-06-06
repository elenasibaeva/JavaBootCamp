package sef.finaltask.activity.SecondTask;

public class SecondActivity {
    public static void main(String[] args){
        SecondActivity calculator = new SecondActivity();
    }

//Create a calculator in SecondActivity and add test for calculator

    public double sum(double firstName, double secondName){
        double result = firstName + secondName;
        return result;
    }

    public double subtract(double firstName, double secondName) {
        double result = firstName - secondName;
        return result;
    }

    public double divide(double firstName, double secondName){
        double result = firstName/secondName;
        return result;
    }

    public double multiply(double firstName, double secondName){
        double result = firstName*secondName;
        return result;
        }
    }
