package calculatorp;

public class Calculator {
    private double number1;
    private double number2;

    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double add() {
        return number1 + number2;
    }

    public double subtract() {
        return number1 - number2;
    }

    public double multiply() {
        return number1 * number2;
    }

    public double divide() {
        if (number2 == 0) {
            throw new ArithmeticException("Zero");
        }
        return number1 / number2;
    }
}
