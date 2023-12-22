package task1;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public double calculateDiscount(double amount, int discount){
        if (discount < 0 || discount > 100){
            throw new ArithmeticException("Incorrect discount amount");
        }
        else if (amount < 0){
            throw new ArithmeticException("The purchase amount must be greater than 0");
        }
        return amount - (amount * discount / 100);
    }
}
