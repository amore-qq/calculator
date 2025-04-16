package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addTest() {
        double result = Calculator.calculate(10, 6, Operation.ADD);
        Assertions.assertEquals(16, result);
    }

    @Test
    void subtractTest() {
        double result = Calculator.calculate(54, 8, Operation.SUBTRACT);
        Assertions.assertEquals(46, result);
    }

    @Test
    void multiplyTest() {
        double result = Calculator.calculate(5.6, 4, Operation.MULTIPLY);
        Assertions.assertEquals(22.4, result);
    }

    @Test
    void divideTest() {
        double result = Calculator.calculate(6.4, 4, Operation.DIVIDE);
        Assertions.assertEquals(1.6, result);
    }

    @Test
    void powTest() {
        double result = Calculator.calculate(2, 3, Operation.POW);
        Assertions.assertEquals(8, result);
    }
}
