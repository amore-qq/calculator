package calculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Введите первое число: ");
            double a = sc.nextDouble();

            System.out.println("Выберите одну из предоставленных операций(+, -, *, /, ^): ");
            String opSymbol = sc.next();

            System.out.println("Введите второе число: ");
            double b = sc.nextDouble();

            Operation op = Operation.fromSymbol(opSymbol);

            try {
                double result = Calculator.calculate(a, b, op);
                System.out.println("Результат: " + result);
                Logger.log(opSymbol, a, b, result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
