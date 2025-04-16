package calculator;

public class Calculator {
    public static double calculate(double a, double b, Operation operation) {
        switch (operation) {
            case ADD: return a + b;
            case SUBTRACT: return a - b;
            case MULTIPLY: return a * b;
            case DIVIDE:
                if (b == 0) throw new ArithmeticException("На ноль делить нельзя!");
                return a / b;
            case POW:
                double result = Math.pow(a, b);
                if (Double.isNaN(result)) { throw new ArithmeticException("Возвести отрицательное число в дробную степень не предоставляется возможным");}
                return result;
            default: throw new IllegalArgumentException("Неизвестная операция");
        }
    }
}
