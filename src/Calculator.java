import fit.ColumnFixture;

public class Calculator extends ColumnFixture {

    private double number1;
    private double number2;
    private String operation;

    public Calculator() {

    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double operate() {
        switch (operation) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case ":":
                return number1 / number2;
            case "*":
                return number1 * number2;
            case "^":
                return Math.pow(number1, 2);
            default:
                return 0;
        }
    }
}